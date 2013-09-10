// First draft of simplest form of grammar: only allows top-level declarations, in a single file. Uses explicit end-of-statement symbol

grammar Minstrel;

// Lexer rules

fragment LETTER: [a-zA-Z];
fragment DIGIT: [0-9];
SPACE: [ \t\r\n]+ -> skip;

INTEGER_LITERAL: DIGIT+;
FLOAT_LITERAL: DIGIT+'.'DIGIT+;
STRING_LITERAL: '"' ~["]* '"';

// Keywords

OF: 'of';
GIVING: 'giving';
TAKING: 'taking';
CLASS: 'class';
IMPLEMENTS: 'implements';
CONSTRUCT: 'construct';
METHOD: 'method';
RETURNS: 'returns';
INTERFACE: 'interface';
EXTENDS: 'extends';
FUNCTION: 'function';
ENUM: 'enum';
IS: 'is';
BECOMES: 'becomes';
IF: 'if';
ELSE: 'else';
WHILE: 'while';
FOR: 'for';
IN: 'in';
RETURN: 'return';
ERROR: 'error';
OR: 'or';
AND: 'and';
NOT: 'not';

IDENTIFIER: LETTER (LETTER | DIGIT)* ;

// Parser rules

program: statement*;

generic_argument_list: initial_generic_parameter (',' additional_generic_parameter)*;

initial_generic_parameter: variance_modifier inner_type;
additional_generic_parameter: variance_modifier? inner_type;

variance_modifier: OF      
                 | GIVING  
                 | TAKING
                 ;

type: modifier* name generic_argument_list?;
inner_type: name | '(' type ')';

modifier: name;

class_definition: CLASS name generic_argument_list? IMPLEMENTS type '{' class_body '}';
class_body: (field_definition | constructor_definition | method_definition)*;
field_definition: type name';';
constructor_definition: CONSTRUCT parameter_list block;
method_definition: METHOD name parameter_list RETURNS type block;

parameter_list: '[' (parameter (',' parameter)*)? ']';
parameter: type name;

argument_list: '[' (expression (',' expression)*)? ']';

block: '{' statement* '}';

interface_definition: INTERFACE name generic_argument_list? (EXTENDS type (',' type)*)? '{' interface_body '}';
interface_body: method_declaration*;
method_declaration: METHOD name parameter_list RETURNS type ';';

function_interface_definition: FUNCTION INTERFACE name generic_argument_list? parameter_list RETURNS type ';';

function_definition: FUNCTION generic_argument_list? name parameter_list RETURNS type block;

enum_definition: ENUM name '{' enum_value (',' enum_value)* '}';
enum_value: name;

name: IDENTIFIER;

statement: expression ';'                                                  # expression_statement  
         | type name IS expression ';'                                     # declaration_statement  
         | name IS expression';'                                           # initialisation_statement 
         | name BECOMES expression ';'                                     # reassignment_statement 
         | IF expression block (ELSE IF expression block)* (ELSE block)?   # if_statement 
         | WHILE expression block                                          # while_statement 
         | FOR name IN expression block                                    # for_statement  
         | RETURN expression';'                                            # return_statement 
         | ERROR argument_list';'                                          # error_statement
         | definition													   # definition_statement
         ;

definition: class_definition | interface_definition | function_definition | function_interface_definition | enum_definition;


expression: '(' expression ')'                                                  # parenthesised_expression
          | INTEGER_LITERAL                                                     # integer_literal
          | FLOAT_LITERAL                                                       # float_literal
          | STRING_LITERAL                                                      # string_literal
          | IDENTIFIER	                                                        # variable
          | FUNCTION generic_argument_list? parameter_list RETURNS type block   # anonymous_function_definition
          | expression argument_list                                            # function_call
          | expression '.' name argument_list	                                # method_call
          | '-' expression                                                      # negation_expression
          | expression ('*' | '/') expression                                   # factor_expression
          | expression ('+' | '-') expression                                   # term_expression
          | expression ('<' | '<=' | '=' | '>=' | '>' | '=/=') expression       # comparison	
          | NOT expression                                                      # not_expression
          | expression AND expression                                           # and_expression
          | expression OR expression                                            # or_expression
          ;
          