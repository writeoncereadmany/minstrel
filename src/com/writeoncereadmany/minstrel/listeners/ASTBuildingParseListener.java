package com.writeoncereadmany.minstrel.listeners;

import java.math.BigInteger;
import java.util.Stack;

import com.writeoncereadmany.minstrel.scope.Scope;
import com.writeoncereadmany.minstrel.scope.Scopes;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.TerminalNode;

import com.writeoncereadmany.minstrel.ast.ASTNode;
import com.writeoncereadmany.minstrel.ast.ASTNodeBuilder;
import com.writeoncereadmany.minstrel.ast.AnonymousFunctionBuilder;
import com.writeoncereadmany.minstrel.ast.ArgumentListBuilder;
import com.writeoncereadmany.minstrel.ast.BlockBuilder;
import com.writeoncereadmany.minstrel.ast.DeclarationBuilder;
import com.writeoncereadmany.minstrel.ast.DefinitionBuilder;
import com.writeoncereadmany.minstrel.ast.ErrorStatementBuilder;
import com.writeoncereadmany.minstrel.ast.ExpressionStatementBuilder;
import com.writeoncereadmany.minstrel.ast.FunctionCallBuilder;
import com.writeoncereadmany.minstrel.ast.FunctionDefinitionBuilder;
import com.writeoncereadmany.minstrel.ast.FunctionInterfaceBuilder;
import com.writeoncereadmany.minstrel.ast.IfStatementBuilder;
import com.writeoncereadmany.minstrel.ast.IntegerLiteralBuilder;
import com.writeoncereadmany.minstrel.ast.NameBuilder;
import com.writeoncereadmany.minstrel.ast.OperationBuilder;
import com.writeoncereadmany.minstrel.ast.Operators;
import com.writeoncereadmany.minstrel.ast.ParameterBuilder;
import com.writeoncereadmany.minstrel.ast.ParameterListBuilder;
import com.writeoncereadmany.minstrel.ast.ParenthesisedExpressionBuilder;
import com.writeoncereadmany.minstrel.ast.Program;
import com.writeoncereadmany.minstrel.ast.ProgramBuilder;
import com.writeoncereadmany.minstrel.ast.ReassignmentStatementBuilder;
import com.writeoncereadmany.minstrel.ast.ReturnStatementBuilder;
import com.writeoncereadmany.minstrel.ast.StringLiteralBuilder;
import com.writeoncereadmany.minstrel.ast.TypeBuilder;
import com.writeoncereadmany.minstrel.ast.VariableBuilder;
import com.writeoncereadmany.minstrel.ast.WhileStatementBuilder;
import com.writeoncereadmany.minstrel.generated.MinstrelBaseListener;
import com.writeoncereadmany.minstrel.generated.MinstrelParser.Anonymous_function_definitionContext;
import com.writeoncereadmany.minstrel.generated.MinstrelParser.Argument_listContext;
import com.writeoncereadmany.minstrel.generated.MinstrelParser.BlockContext;
import com.writeoncereadmany.minstrel.generated.MinstrelParser.ComparisonContext;
import com.writeoncereadmany.minstrel.generated.MinstrelParser.Declaration_statementContext;
import com.writeoncereadmany.minstrel.generated.MinstrelParser.DefinitionContext;
import com.writeoncereadmany.minstrel.generated.MinstrelParser.Definition_statementContext;
import com.writeoncereadmany.minstrel.generated.MinstrelParser.Error_statementContext;
import com.writeoncereadmany.minstrel.generated.MinstrelParser.Expression_statementContext;
import com.writeoncereadmany.minstrel.generated.MinstrelParser.Factor_expressionContext;
import com.writeoncereadmany.minstrel.generated.MinstrelParser.Function_callContext;
import com.writeoncereadmany.minstrel.generated.MinstrelParser.Function_definitionContext;
import com.writeoncereadmany.minstrel.generated.MinstrelParser.Function_interface_definitionContext;
import com.writeoncereadmany.minstrel.generated.MinstrelParser.If_statementContext;
import com.writeoncereadmany.minstrel.generated.MinstrelParser.Integer_literalContext;
import com.writeoncereadmany.minstrel.generated.MinstrelParser.NameContext;
import com.writeoncereadmany.minstrel.generated.MinstrelParser.ParameterContext;
import com.writeoncereadmany.minstrel.generated.MinstrelParser.Parameter_listContext;
import com.writeoncereadmany.minstrel.generated.MinstrelParser.Parenthesised_expressionContext;
import com.writeoncereadmany.minstrel.generated.MinstrelParser.ProgramContext;
import com.writeoncereadmany.minstrel.generated.MinstrelParser.Reassignment_statementContext;
import com.writeoncereadmany.minstrel.generated.MinstrelParser.Return_statementContext;
import com.writeoncereadmany.minstrel.generated.MinstrelParser.String_literalContext;
import com.writeoncereadmany.minstrel.generated.MinstrelParser.Term_expressionContext;
import com.writeoncereadmany.minstrel.generated.MinstrelParser.TypeContext;
import com.writeoncereadmany.minstrel.generated.MinstrelParser.VariableContext;
import com.writeoncereadmany.minstrel.generated.MinstrelParser.While_statementContext;

public class ASTBuildingParseListener extends MinstrelBaseListener {

	private Stack<ASTNodeBuilder> beingBuilt;
    private Scope systemScope;
    private Scopes programScopes;
	private Program program = null;
	
	public ASTBuildingParseListener(final Scope systemScope)
	{
		beingBuilt = new Stack<ASTNodeBuilder>();
        programScopes = new Scopes();
        this.systemScope = systemScope;
	}
	
	public Program getProgram()
	{
		if(null==program)
		{
			throw new IllegalStateException("Program has not been built correctly");
		}
		return program;
	}
	
	@Override
	public void exitEveryRule(@NotNull ParserRuleContext ctx) {
		final ASTNodeBuilder finishedBuilding = beingBuilt.pop();
		final ASTNode node = finishedBuilding.build(programScopes);
		
		if(beingBuilt.isEmpty()) 
		{
			program = (Program)node;
		}
		else
		{
			ASTNodeBuilder parentNode = beingBuilt.peek();
			parentNode.addNode(node);
		}
	}
	
	@Override
	public void visitTerminal(@NotNull TerminalNode node) {
        String terminal = node.getText();
        if(Operators.isOperator(terminal))
        {
            beingBuilt.peek().addNode(Operators.forSymbol(terminal));
        }
	}
	
	@Override
	public void enterProgram(@NotNull ProgramContext ctx) {
		beingBuilt.push(new ProgramBuilder(programScopes));
	}
	
	@Override
	public void enterExpression_statement(@NotNull Expression_statementContext ctx) {
		beingBuilt.push(new ExpressionStatementBuilder());
	}
	
	@Override
	public void enterFunction_call(@NotNull Function_callContext ctx) {
		beingBuilt.push(new FunctionCallBuilder());
	}
	
	@Override
	public void enterVariable(@NotNull VariableContext ctx) {
		beingBuilt.push(new VariableBuilder(ctx.getText()));
	}
	
	@Override
	public void enterArgument_list(@NotNull Argument_listContext ctx) {
		beingBuilt.push(new ArgumentListBuilder());
	}
	
	@Override
	public void enterString_literal(@NotNull String_literalContext ctx) {
		beingBuilt.push(new StringLiteralBuilder(ctx.getText()));
	}
	
	@Override
	public void enterDeclaration_statement(@NotNull Declaration_statementContext ctx) {
		beingBuilt.push(new DeclarationBuilder());
	}
	
	@Override
	public void enterType(@NotNull TypeContext ctx) {
		beingBuilt.push(new TypeBuilder());
	}
	
	@Override
	public void enterName(@NotNull NameContext ctx) {
		beingBuilt.push(new NameBuilder(ctx.getText()));
	}
	
	@Override
	public void enterFactor_expression(@NotNull Factor_expressionContext ctx) {
		beingBuilt.push(new OperationBuilder());
	}
	
	@Override
	public void enterTerm_expression(@NotNull Term_expressionContext ctx) {
		beingBuilt.push(new OperationBuilder());
	}
	
	@Override
	public void enterInteger_literal(@NotNull Integer_literalContext ctx) {
		beingBuilt.push(new IntegerLiteralBuilder(new BigInteger(ctx.getText())));
	}
	
	@Override
	public void enterParenthesised_expression(
			@NotNull Parenthesised_expressionContext ctx) {
		beingBuilt.push(new ParenthesisedExpressionBuilder());
	}
	
	@Override
	public void enterReassignment_statement(
			@NotNull Reassignment_statementContext ctx) {
		beingBuilt.push(new ReassignmentStatementBuilder());
	}
	
	@Override
	public void enterComparison(@NotNull ComparisonContext ctx) {
		beingBuilt.push(new OperationBuilder());
	}
	
	@Override
	public void enterBlock(@NotNull BlockContext ctx) {
		beingBuilt.push(new BlockBuilder());
	}
	
	@Override
	public void enterIf_statement(@NotNull If_statementContext ctx) {
		beingBuilt.push(new IfStatementBuilder(programScopes));
	}

    @Override
	public void enterWhile_statement(@NotNull While_statementContext ctx) {
		beingBuilt.push(new WhileStatementBuilder(programScopes));
	}


    @Override
	public void enterFunction_definition(@NotNull Function_definitionContext ctx) {
		beingBuilt.push(new FunctionDefinitionBuilder(programScopes));
	}

    @Override
	public void enterParameter_list(@NotNull Parameter_listContext ctx) {
		beingBuilt.push(new ParameterListBuilder());
	}
	
	@Override
	public void enterParameter(@NotNull ParameterContext ctx) {
		beingBuilt.push(new ParameterBuilder());
	}
	
	@Override
	public void enterReturn_statement(@NotNull Return_statementContext ctx) {
		beingBuilt.push(new ReturnStatementBuilder());
	}
	
	@Override
	public void enterDefinition(@NotNull DefinitionContext ctx) {
		beingBuilt.push(new DefinitionBuilder());
	}
	
	@Override
	public void enterDefinition_statement(@NotNull Definition_statementContext ctx) {
		beingBuilt.push(new DefinitionBuilder());
	}
	
	@Override
	public void enterAnonymous_function_definition(@NotNull Anonymous_function_definitionContext ctx) {
		beingBuilt.push(new AnonymousFunctionBuilder(programScopes));
	}

    @Override
	public void enterFunction_interface_definition(@NotNull Function_interface_definitionContext ctx) {
		beingBuilt.push(new FunctionInterfaceBuilder(programScopes));
	}

    @Override
	public void enterError_statement(@NotNull Error_statementContext ctx) {
		beingBuilt.push(new ErrorStatementBuilder());
	}
}
