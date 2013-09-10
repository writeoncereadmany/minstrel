package com.writeoncereadmany.minstrel.generated;

// Generated from Minstrel.g4 by ANTLR 4.1
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MinstrelParser}.
 */
public interface MinstrelListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MinstrelParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(@NotNull MinstrelParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinstrelParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(@NotNull MinstrelParser.TypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link MinstrelParser#reassignment_statement}.
	 * @param ctx the parse tree
	 */
	void enterReassignment_statement(@NotNull MinstrelParser.Reassignment_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinstrelParser#reassignment_statement}.
	 * @param ctx the parse tree
	 */
	void exitReassignment_statement(@NotNull MinstrelParser.Reassignment_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link MinstrelParser#variance_modifier}.
	 * @param ctx the parse tree
	 */
	void enterVariance_modifier(@NotNull MinstrelParser.Variance_modifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinstrelParser#variance_modifier}.
	 * @param ctx the parse tree
	 */
	void exitVariance_modifier(@NotNull MinstrelParser.Variance_modifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link MinstrelParser#method_call}.
	 * @param ctx the parse tree
	 */
	void enterMethod_call(@NotNull MinstrelParser.Method_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinstrelParser#method_call}.
	 * @param ctx the parse tree
	 */
	void exitMethod_call(@NotNull MinstrelParser.Method_callContext ctx);

	/**
	 * Enter a parse tree produced by {@link MinstrelParser#for_statement}.
	 * @param ctx the parse tree
	 */
	void enterFor_statement(@NotNull MinstrelParser.For_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinstrelParser#for_statement}.
	 * @param ctx the parse tree
	 */
	void exitFor_statement(@NotNull MinstrelParser.For_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link MinstrelParser#function_definition}.
	 * @param ctx the parse tree
	 */
	void enterFunction_definition(@NotNull MinstrelParser.Function_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinstrelParser#function_definition}.
	 * @param ctx the parse tree
	 */
	void exitFunction_definition(@NotNull MinstrelParser.Function_definitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link MinstrelParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterComparison(@NotNull MinstrelParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinstrelParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitComparison(@NotNull MinstrelParser.ComparisonContext ctx);

	/**
	 * Enter a parse tree produced by {@link MinstrelParser#modifier}.
	 * @param ctx the parse tree
	 */
	void enterModifier(@NotNull MinstrelParser.ModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinstrelParser#modifier}.
	 * @param ctx the parse tree
	 */
	void exitModifier(@NotNull MinstrelParser.ModifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link MinstrelParser#not_expression}.
	 * @param ctx the parse tree
	 */
	void enterNot_expression(@NotNull MinstrelParser.Not_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinstrelParser#not_expression}.
	 * @param ctx the parse tree
	 */
	void exitNot_expression(@NotNull MinstrelParser.Not_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link MinstrelParser#float_literal}.
	 * @param ctx the parse tree
	 */
	void enterFloat_literal(@NotNull MinstrelParser.Float_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinstrelParser#float_literal}.
	 * @param ctx the parse tree
	 */
	void exitFloat_literal(@NotNull MinstrelParser.Float_literalContext ctx);

	/**
	 * Enter a parse tree produced by {@link MinstrelParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(@NotNull MinstrelParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinstrelParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(@NotNull MinstrelParser.Function_callContext ctx);

	/**
	 * Enter a parse tree produced by {@link MinstrelParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(@NotNull MinstrelParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinstrelParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(@NotNull MinstrelParser.ProgramContext ctx);

	/**
	 * Enter a parse tree produced by {@link MinstrelParser#method_declaration}.
	 * @param ctx the parse tree
	 */
	void enterMethod_declaration(@NotNull MinstrelParser.Method_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinstrelParser#method_declaration}.
	 * @param ctx the parse tree
	 */
	void exitMethod_declaration(@NotNull MinstrelParser.Method_declarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link MinstrelParser#method_definition}.
	 * @param ctx the parse tree
	 */
	void enterMethod_definition(@NotNull MinstrelParser.Method_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinstrelParser#method_definition}.
	 * @param ctx the parse tree
	 */
	void exitMethod_definition(@NotNull MinstrelParser.Method_definitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link MinstrelParser#integer_literal}.
	 * @param ctx the parse tree
	 */
	void enterInteger_literal(@NotNull MinstrelParser.Integer_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinstrelParser#integer_literal}.
	 * @param ctx the parse tree
	 */
	void exitInteger_literal(@NotNull MinstrelParser.Integer_literalContext ctx);

	/**
	 * Enter a parse tree produced by {@link MinstrelParser#string_literal}.
	 * @param ctx the parse tree
	 */
	void enterString_literal(@NotNull MinstrelParser.String_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinstrelParser#string_literal}.
	 * @param ctx the parse tree
	 */
	void exitString_literal(@NotNull MinstrelParser.String_literalContext ctx);

	/**
	 * Enter a parse tree produced by {@link MinstrelParser#generic_argument_list}.
	 * @param ctx the parse tree
	 */
	void enterGeneric_argument_list(@NotNull MinstrelParser.Generic_argument_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinstrelParser#generic_argument_list}.
	 * @param ctx the parse tree
	 */
	void exitGeneric_argument_list(@NotNull MinstrelParser.Generic_argument_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link MinstrelParser#initialisation_statement}.
	 * @param ctx the parse tree
	 */
	void enterInitialisation_statement(@NotNull MinstrelParser.Initialisation_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinstrelParser#initialisation_statement}.
	 * @param ctx the parse tree
	 */
	void exitInitialisation_statement(@NotNull MinstrelParser.Initialisation_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link MinstrelParser#parameter_list}.
	 * @param ctx the parse tree
	 */
	void enterParameter_list(@NotNull MinstrelParser.Parameter_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinstrelParser#parameter_list}.
	 * @param ctx the parse tree
	 */
	void exitParameter_list(@NotNull MinstrelParser.Parameter_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link MinstrelParser#function_interface_definition}.
	 * @param ctx the parse tree
	 */
	void enterFunction_interface_definition(@NotNull MinstrelParser.Function_interface_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinstrelParser#function_interface_definition}.
	 * @param ctx the parse tree
	 */
	void exitFunction_interface_definition(@NotNull MinstrelParser.Function_interface_definitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link MinstrelParser#argument_list}.
	 * @param ctx the parse tree
	 */
	void enterArgument_list(@NotNull MinstrelParser.Argument_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinstrelParser#argument_list}.
	 * @param ctx the parse tree
	 */
	void exitArgument_list(@NotNull MinstrelParser.Argument_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link MinstrelParser#interface_body}.
	 * @param ctx the parse tree
	 */
	void enterInterface_body(@NotNull MinstrelParser.Interface_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinstrelParser#interface_body}.
	 * @param ctx the parse tree
	 */
	void exitInterface_body(@NotNull MinstrelParser.Interface_bodyContext ctx);

	/**
	 * Enter a parse tree produced by {@link MinstrelParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(@NotNull MinstrelParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinstrelParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(@NotNull MinstrelParser.If_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link MinstrelParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull MinstrelParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinstrelParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull MinstrelParser.BlockContext ctx);

	/**
	 * Enter a parse tree produced by {@link MinstrelParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void enterWhile_statement(@NotNull MinstrelParser.While_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinstrelParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void exitWhile_statement(@NotNull MinstrelParser.While_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link MinstrelParser#enum_definition}.
	 * @param ctx the parse tree
	 */
	void enterEnum_definition(@NotNull MinstrelParser.Enum_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinstrelParser#enum_definition}.
	 * @param ctx the parse tree
	 */
	void exitEnum_definition(@NotNull MinstrelParser.Enum_definitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link MinstrelParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(@NotNull MinstrelParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinstrelParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(@NotNull MinstrelParser.ParameterContext ctx);

	/**
	 * Enter a parse tree produced by {@link MinstrelParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(@NotNull MinstrelParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinstrelParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(@NotNull MinstrelParser.NameContext ctx);

	/**
	 * Enter a parse tree produced by {@link MinstrelParser#declaration_statement}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration_statement(@NotNull MinstrelParser.Declaration_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinstrelParser#declaration_statement}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration_statement(@NotNull MinstrelParser.Declaration_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link MinstrelParser#anonymous_function_definition}.
	 * @param ctx the parse tree
	 */
	void enterAnonymous_function_definition(@NotNull MinstrelParser.Anonymous_function_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinstrelParser#anonymous_function_definition}.
	 * @param ctx the parse tree
	 */
	void exitAnonymous_function_definition(@NotNull MinstrelParser.Anonymous_function_definitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link MinstrelParser#enum_value}.
	 * @param ctx the parse tree
	 */
	void enterEnum_value(@NotNull MinstrelParser.Enum_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinstrelParser#enum_value}.
	 * @param ctx the parse tree
	 */
	void exitEnum_value(@NotNull MinstrelParser.Enum_valueContext ctx);

	/**
	 * Enter a parse tree produced by {@link MinstrelParser#inner_type}.
	 * @param ctx the parse tree
	 */
	void enterInner_type(@NotNull MinstrelParser.Inner_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinstrelParser#inner_type}.
	 * @param ctx the parse tree
	 */
	void exitInner_type(@NotNull MinstrelParser.Inner_typeContext ctx);

	/**
	 * Enter a parse tree produced by {@link MinstrelParser#class_body}.
	 * @param ctx the parse tree
	 */
	void enterClass_body(@NotNull MinstrelParser.Class_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinstrelParser#class_body}.
	 * @param ctx the parse tree
	 */
	void exitClass_body(@NotNull MinstrelParser.Class_bodyContext ctx);

	/**
	 * Enter a parse tree produced by {@link MinstrelParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void enterReturn_statement(@NotNull MinstrelParser.Return_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinstrelParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void exitReturn_statement(@NotNull MinstrelParser.Return_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link MinstrelParser#or_expression}.
	 * @param ctx the parse tree
	 */
	void enterOr_expression(@NotNull MinstrelParser.Or_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinstrelParser#or_expression}.
	 * @param ctx the parse tree
	 */
	void exitOr_expression(@NotNull MinstrelParser.Or_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link MinstrelParser#definition}.
	 * @param ctx the parse tree
	 */
	void enterDefinition(@NotNull MinstrelParser.DefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinstrelParser#definition}.
	 * @param ctx the parse tree
	 */
	void exitDefinition(@NotNull MinstrelParser.DefinitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link MinstrelParser#expression_statement}.
	 * @param ctx the parse tree
	 */
	void enterExpression_statement(@NotNull MinstrelParser.Expression_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinstrelParser#expression_statement}.
	 * @param ctx the parse tree
	 */
	void exitExpression_statement(@NotNull MinstrelParser.Expression_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link MinstrelParser#factor_expression}.
	 * @param ctx the parse tree
	 */
	void enterFactor_expression(@NotNull MinstrelParser.Factor_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinstrelParser#factor_expression}.
	 * @param ctx the parse tree
	 */
	void exitFactor_expression(@NotNull MinstrelParser.Factor_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link MinstrelParser#term_expression}.
	 * @param ctx the parse tree
	 */
	void enterTerm_expression(@NotNull MinstrelParser.Term_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinstrelParser#term_expression}.
	 * @param ctx the parse tree
	 */
	void exitTerm_expression(@NotNull MinstrelParser.Term_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link MinstrelParser#negation_expression}.
	 * @param ctx the parse tree
	 */
	void enterNegation_expression(@NotNull MinstrelParser.Negation_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinstrelParser#negation_expression}.
	 * @param ctx the parse tree
	 */
	void exitNegation_expression(@NotNull MinstrelParser.Negation_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link MinstrelParser#parenthesised_expression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesised_expression(@NotNull MinstrelParser.Parenthesised_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinstrelParser#parenthesised_expression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesised_expression(@NotNull MinstrelParser.Parenthesised_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link MinstrelParser#field_definition}.
	 * @param ctx the parse tree
	 */
	void enterField_definition(@NotNull MinstrelParser.Field_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinstrelParser#field_definition}.
	 * @param ctx the parse tree
	 */
	void exitField_definition(@NotNull MinstrelParser.Field_definitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link MinstrelParser#definition_statement}.
	 * @param ctx the parse tree
	 */
	void enterDefinition_statement(@NotNull MinstrelParser.Definition_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinstrelParser#definition_statement}.
	 * @param ctx the parse tree
	 */
	void exitDefinition_statement(@NotNull MinstrelParser.Definition_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link MinstrelParser#class_definition}.
	 * @param ctx the parse tree
	 */
	void enterClass_definition(@NotNull MinstrelParser.Class_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinstrelParser#class_definition}.
	 * @param ctx the parse tree
	 */
	void exitClass_definition(@NotNull MinstrelParser.Class_definitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link MinstrelParser#error_statement}.
	 * @param ctx the parse tree
	 */
	void enterError_statement(@NotNull MinstrelParser.Error_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinstrelParser#error_statement}.
	 * @param ctx the parse tree
	 */
	void exitError_statement(@NotNull MinstrelParser.Error_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link MinstrelParser#constructor_definition}.
	 * @param ctx the parse tree
	 */
	void enterConstructor_definition(@NotNull MinstrelParser.Constructor_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinstrelParser#constructor_definition}.
	 * @param ctx the parse tree
	 */
	void exitConstructor_definition(@NotNull MinstrelParser.Constructor_definitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link MinstrelParser#and_expression}.
	 * @param ctx the parse tree
	 */
	void enterAnd_expression(@NotNull MinstrelParser.And_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinstrelParser#and_expression}.
	 * @param ctx the parse tree
	 */
	void exitAnd_expression(@NotNull MinstrelParser.And_expressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link MinstrelParser#additional_generic_parameter}.
	 * @param ctx the parse tree
	 */
	void enterAdditional_generic_parameter(@NotNull MinstrelParser.Additional_generic_parameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinstrelParser#additional_generic_parameter}.
	 * @param ctx the parse tree
	 */
	void exitAdditional_generic_parameter(@NotNull MinstrelParser.Additional_generic_parameterContext ctx);

	/**
	 * Enter a parse tree produced by {@link MinstrelParser#interface_definition}.
	 * @param ctx the parse tree
	 */
	void enterInterface_definition(@NotNull MinstrelParser.Interface_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinstrelParser#interface_definition}.
	 * @param ctx the parse tree
	 */
	void exitInterface_definition(@NotNull MinstrelParser.Interface_definitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link MinstrelParser#initial_generic_parameter}.
	 * @param ctx the parse tree
	 */
	void enterInitial_generic_parameter(@NotNull MinstrelParser.Initial_generic_parameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinstrelParser#initial_generic_parameter}.
	 * @param ctx the parse tree
	 */
	void exitInitial_generic_parameter(@NotNull MinstrelParser.Initial_generic_parameterContext ctx);

	/**
	 * Enter a parse tree produced by {@link MinstrelParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(@NotNull MinstrelParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinstrelParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(@NotNull MinstrelParser.VariableContext ctx);
}