package com.writeoncereadmany.minstrel.listeners;

import com.writeoncereadmany.minstrel.generated.MinstrelListener;
import com.writeoncereadmany.minstrel.generated.MinstrelParser.*;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class PrintingParseListener implements MinstrelListener {

	@Override
	public void enterEveryRule(@NotNull ParserRuleContext arg0) {
//		System.out.println("Entering a rule");
	}

	@Override
	public void exitEveryRule(@NotNull ParserRuleContext arg0) {
//		System.out.println("Exiting a rule");
	}

	@Override
	public void visitErrorNode(@NotNull ErrorNode arg0) {
//		System.out.println("Visiting an error node");
	}

	@Override
	public void visitTerminal(@NotNull TerminalNode arg0) {
		System.out.println("Visiting a terminal node: text is " + arg0.getText());
	}

	@Override
	public void enterType(@NotNull TypeContext ctx) {
		System.out.println("Entering a type definition");
	}

	@Override
	public void exitType(@NotNull TypeContext ctx) {
		System.out.println("Exiting a type definition");
	}

	@Override
	public void enterReassignment_statement(
			@NotNull Reassignment_statementContext ctx) {
		System.out.println("Entering a reassignment statement");
	}

	@Override
	public void exitReassignment_statement(
			@NotNull Reassignment_statementContext ctx) {
		System.out.println("Exiting a reassignment statement");
	}

	@Override
	public void enterVariance_modifier(@NotNull Variance_modifierContext ctx) {
		System.out.println("Entering a variance modifier");
	}

	@Override
	public void exitVariance_modifier(@NotNull Variance_modifierContext ctx) {
		System.out.println("Exiting a variance modifier");
	}

	@Override
	public void enterMethod_call(@NotNull Method_callContext ctx) {
		System.out.println("Entering a method call");
	}

	@Override
	public void exitMethod_call(@NotNull Method_callContext ctx) {
		System.out.println("Exiting a method call");
	}

	@Override
	public void enterFor_statement(@NotNull For_statementContext ctx) {
		System.out.println("Entering a for statement");
	}

	@Override
	public void exitFor_statement(@NotNull For_statementContext ctx) {
		System.out.println("Exiting a for statement");
	}

	@Override
	public void enterFunction_definition(@NotNull Function_definitionContext ctx) {
		System.out.println("Entering a function definition");
	}

	@Override
	public void exitFunction_definition(@NotNull Function_definitionContext ctx) {
		System.out.println("Exiting a function definition");
	}

	@Override
	public void enterComparison(@NotNull ComparisonContext ctx) {
		System.out.println("Entering a comparison");
	}

	@Override
	public void exitComparison(@NotNull ComparisonContext ctx) {
		System.out.println("Exiting a comparison");
	}

	@Override
	public void enterModifier(@NotNull ModifierContext ctx) {
		System.out.println("Entering a modifier");
	}

	@Override
	public void exitModifier(@NotNull ModifierContext ctx) {
		System.out.println("Exiting a modifier");
	}

	@Override
	public void enterNot_expression(@NotNull Not_expressionContext ctx) {
		System.out.println("Entering a not expression");
	}

	@Override
	public void exitNot_expression(@NotNull Not_expressionContext ctx) {
		System.out.println("Exiting a not expression");
	}

	@Override
	public void enterFunction_call(@NotNull Function_callContext ctx) {
		System.out.println("Entering a function call");
	}

	@Override
	public void exitFunction_call(@NotNull Function_callContext ctx) {
		System.out.println("Exiting a function call");
	}

	@Override
	public void enterProgram(@NotNull ProgramContext ctx) {
		System.out.println("Entering a program");
	}

	@Override
	public void exitProgram(@NotNull ProgramContext ctx) {
		System.out.println("Exiting a program");
	}

	@Override
	public void enterMethod_declaration(@NotNull Method_declarationContext ctx) {
		System.out.println("Entering a method declaration");
	}

	@Override
	public void exitMethod_declaration(@NotNull Method_declarationContext ctx) {
		System.out.println("Exiting a method declaration");
	}

	@Override
	public void enterMethod_definition(@NotNull Method_definitionContext ctx) {
		System.out.println("Entering a method definition");
	}

	@Override
	public void exitMethod_definition(@NotNull Method_definitionContext ctx) {
		System.out.println("Exiting a method definition");
	}

	@Override
	public void enterNumber_literal(@NotNull Number_literalContext ctx) {
		System.out.println("Entering an integer literal");
	}

	@Override
	public void exitNumber_literal(@NotNull Number_literalContext ctx) {
		System.out.println("Exiting an integer literal");
	}

	@Override
	public void enterGeneric_argument_list(
			@NotNull Generic_argument_listContext ctx) {
		System.out.println("Entering a generic argument");
	}

	@Override
	public void exitGeneric_argument_list(
			@NotNull Generic_argument_listContext ctx) {
		System.out.println("Exiting a generic argument");
	}

	@Override
	public void enterParameter_list(@NotNull Parameter_listContext ctx) {
		System.out.println("Entering a parameter list");
	}

	@Override
	public void exitParameter_list(@NotNull Parameter_listContext ctx) {
		System.out.println("Exiting a parameter list");
	}

	@Override
	public void enterSignature_definition(
			@NotNull Signature_definitionContext ctx) {
		System.out.println("Entering a function interface definition");
	}

	@Override
	public void exitSignature_definition(
			@NotNull Signature_definitionContext ctx) {
		System.out.println("Exiting a function interface definition");
	}

	@Override
	public void enterArgument_list(@NotNull Argument_listContext ctx) {
		System.out.println("Entering an argument list");
	}

	@Override
	public void exitArgument_list(@NotNull Argument_listContext ctx) {
		System.out.println("Exiting an argument list");
	}

	@Override
	public void enterString_literal(@NotNull String_literalContext ctx) {
		System.out.println("Entering a string literal");
	}

	@Override
	public void exitString_literal(@NotNull String_literalContext ctx) {
		System.out.println("Exiting a string literal");
	}

	@Override
	public void enterInterface_body(@NotNull Interface_bodyContext ctx) {
		System.out.println("Entering an interface body");
	}

	@Override
	public void exitInterface_body(@NotNull Interface_bodyContext ctx) {
		System.out.println("Exiting an interface body");
	}

	@Override
	public void enterIf_statement(@NotNull If_statementContext ctx) {
		System.out.println("Entering an if statement");
	}

	@Override
	public void exitIf_statement(@NotNull If_statementContext ctx) {
		System.out.println("Exiting an if statement");
	}

	@Override
	public void enterBlock(@NotNull BlockContext ctx) {
		System.out.println("Entering a block");
	}

	@Override
	public void exitBlock(@NotNull BlockContext ctx) {
		System.out.println("Exiting a block");
	}

	@Override
	public void enterWhile_statement(@NotNull While_statementContext ctx) {
		System.out.println("Entering a while statement");
	}

	@Override
	public void exitWhile_statement(@NotNull While_statementContext ctx) {
		System.out.println("Exiting a while statement");
	}

	@Override
	public void enterEnum_definition(@NotNull Enum_definitionContext ctx) {
		System.out.println("Entering an enum definition");
	}

	@Override
	public void exitEnum_definition(@NotNull Enum_definitionContext ctx) {
		System.out.println("Exiting an enum definition");
	}

	@Override
	public void enterParameter(@NotNull ParameterContext ctx) {
		System.out.println("Entering a parameter definition");
	}

	@Override
	public void exitParameter(@NotNull ParameterContext ctx) {
		System.out.println("Exiting a parameter definition");
	}

	@Override
	public void enterDeclaration_statement(
			@NotNull Declaration_statementContext ctx) {
		System.out.println("Entering a declaration statement");
	}

	@Override
	public void exitDeclaration_statement(
			@NotNull Declaration_statementContext ctx) {
		System.out.println("Exiting a declaration statement");
	}

	@Override
	public void enterInner_type(@NotNull Inner_typeContext ctx) {
		System.out.println("Entering an inner type");
	}

	@Override
	public void exitInner_type(@NotNull Inner_typeContext ctx) {
		System.out.println("Exiting an inner type");
	}

	@Override
	public void enterClass_body(@NotNull Class_bodyContext ctx) {
		System.out.println("Entering a class body");
	}

	@Override
	public void exitClass_body(@NotNull Class_bodyContext ctx) {
		System.out.println("Exiting a class body");
	}

	@Override
	public void enterEnum_value(@NotNull Enum_valueContext ctx) {
		System.out.println("Entering an enum value");
	}

	@Override
	public void exitEnum_value(@NotNull Enum_valueContext ctx) {
		System.out.println("Exiting an enum value");
	}

	@Override
	public void enterReturn_statement(@NotNull Return_statementContext ctx) {
		System.out.println("Entering a return statement");
	}

	@Override
	public void exitReturn_statement(@NotNull Return_statementContext ctx) {
		System.out.println("Exiting a return statement");
	}

	@Override
	public void enterOr_expression(@NotNull Or_expressionContext ctx) {
		System.out.println("Entering an or expression");
	}

	@Override
	public void exitOr_expression(@NotNull Or_expressionContext ctx) {
		System.out.println("Exiting an or expression");
	}

	@Override
	public void enterDefinition(@NotNull DefinitionContext ctx) {
		System.out.println("Entering definition");
	}

	@Override
	public void exitDefinition(@NotNull DefinitionContext ctx) {
		System.out.println("Exiting definition");
	}

	@Override
	public void enterExpression_statement(
			@NotNull Expression_statementContext ctx) {
		System.out.println("Entering expression statement");
	}

	@Override
	public void exitExpression_statement(
			@NotNull Expression_statementContext ctx) {
		System.out.println("Exiting expression statement");
	}

	@Override
	public void enterFactor_expression(@NotNull Factor_expressionContext ctx) {
		System.out.println("Entering factor expression");
	}

	@Override
	public void exitFactor_expression(@NotNull Factor_expressionContext ctx) {
		System.out.println("Exiting factor expression");
	}

	@Override
	public void enterTerm_expression(@NotNull Term_expressionContext ctx) {
		System.out.println("Entering term expression");
	}

	@Override
	public void exitTerm_expression(@NotNull Term_expressionContext ctx) {
		System.out.println("Exiting term expression");
	}

	@Override
	public void enterNegation_expression(@NotNull Negation_expressionContext ctx) {
		System.out.println("Entering negation expression");
	}

	@Override
	public void exitNegation_expression(@NotNull Negation_expressionContext ctx) {
		System.out.println("Exiting negation expression");
	}

	@Override
	public void enterParenthesised_expression(
			@NotNull Parenthesised_expressionContext ctx) {
		System.out.println("Entering a parenthesised expression");
	}

	@Override
	public void exitParenthesised_expression(
			@NotNull Parenthesised_expressionContext ctx) {
		System.out.println("Exiting a parenthesised expression");
	}

	@Override
	public void enterField_definition(@NotNull Field_definitionContext ctx) {
		System.out.println("Entering a field definition");
	}

	@Override
	public void exitField_definition(@NotNull Field_definitionContext ctx) {
		System.out.println("Exiting a field definition");
	}

	@Override
	public void enterClass_definition(@NotNull Class_definitionContext ctx) {
		System.out.println("Entering a class definition");
	}

	@Override
	public void exitClass_definition(@NotNull Class_definitionContext ctx) {
		System.out.println("Exiting a class definition");
	}

	@Override
	public void enterError_statement(@NotNull Error_statementContext ctx) {
		System.out.println("Entering an error statement");
	}

	@Override
	public void exitError_statement(@NotNull Error_statementContext ctx) {
		System.out.println("Exiting an error statement");
	}

	@Override
	public void enterConstructor_definition(
			@NotNull Constructor_definitionContext ctx) {
		System.out.println("Entering a constructor");
	}

	@Override
	public void exitConstructor_definition(
			@NotNull Constructor_definitionContext ctx) {
		System.out.println("Exiting a constructor");
	}

	@Override
	public void enterAnd_expression(@NotNull And_expressionContext ctx) {
		System.out.println("Entering an and expression");
	}

	@Override
	public void exitAnd_expression(@NotNull And_expressionContext ctx) {
		System.out.println("Exiting an and expression");
	}

	@Override
	public void enterAdditional_generic_parameter(
			@NotNull Additional_generic_parameterContext ctx) {
		System.out.println("Entering an additional generic parameter");
	}

	@Override
	public void exitAdditional_generic_parameter(
			@NotNull Additional_generic_parameterContext ctx) {
		System.out.println("Exiting an additional generic parameter");
	}

	@Override
	public void enterInterface_definition(
			@NotNull Interface_definitionContext ctx) {
		System.out.println("Entering an interface definition");
	}

	@Override
	public void exitInterface_definition(
			@NotNull Interface_definitionContext ctx) {
		System.out.println("Exiting an interface definition");
	}

	@Override
	public void enterInitial_generic_parameter(
			@NotNull Initial_generic_parameterContext ctx) {
		System.out.println("Entering an initial generic parameter");
	}

	@Override
	public void exitInitial_generic_parameter(
			@NotNull Initial_generic_parameterContext ctx) {
		System.out.println("Exiting an initial generic parameter");
	}

	@Override
	public void enterVariable(@NotNull VariableContext ctx) {
		System.out.println("Entering a variable");
	}

	@Override
	public void exitVariable(@NotNull VariableContext ctx) {
		System.out.println("Exiting a variable");
	}

	@Override
	public void enterName(@NotNull NameContext ctx) {
		System.out.println("Entering a name");
		
	}

	@Override
	public void exitName(@NotNull NameContext ctx) {
		System.out.println("Exiting a name");
	}

	@Override
	public void enterDefinition_statement(
			@NotNull Definition_statementContext ctx) {
		System.out.println("Entering a definition statement");
	}

	@Override
	public void exitDefinition_statement(
			@NotNull Definition_statementContext ctx) {
		System.out.println("Exiting a definition statement");
	}

	@Override
	public void enterAnonymous_function_definition(
			@NotNull Anonymous_function_definitionContext ctx) {
		System.out.println("Entering an anonymous function definition");
	}

	@Override
	public void exitAnonymous_function_definition(
			@NotNull Anonymous_function_definitionContext ctx) {
		System.out.println("Exiting an anonymous function definition");
	}
	
	
}
