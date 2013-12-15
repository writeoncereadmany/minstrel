package com.writeoncereadmany.minstrel.listeners;

import java.util.Stack;

import com.writeoncereadmany.minstrel.ast.*;
import com.writeoncereadmany.minstrel.ast.miscellaneous.*;
import com.writeoncereadmany.minstrel.ast.operators.ComplexBinaryOperators;
import com.writeoncereadmany.minstrel.ast.operators.SimpleBinaryOperators;
import com.writeoncereadmany.minstrel.ast.statements.definitions.*;
import com.writeoncereadmany.minstrel.ast.expressions.*;
import com.writeoncereadmany.minstrel.ast.statements.*;
import com.writeoncereadmany.minstrel.ast.statements.definitions.classes.ClassDefinitionBodyBuilder;
import com.writeoncereadmany.minstrel.ast.statements.definitions.classes.ClassDefinitionBuilder;
import com.writeoncereadmany.minstrel.ast.statements.definitions.functions.FunctionDefinitionBuilder;
import com.writeoncereadmany.minstrel.ast.statements.definitions.functions.SignatureBuilder;
import com.writeoncereadmany.minstrel.ast.statements.definitions.interfaces.InterfaceDefinitionBodyBuilder;
import com.writeoncereadmany.minstrel.ast.statements.definitions.interfaces.InterfaceDefinitionBuilder;
import com.writeoncereadmany.minstrel.ast.statements.definitions.interfaces.MethodDeclarationBuilder;
import com.writeoncereadmany.minstrel.generated.MinstrelParser;
import com.writeoncereadmany.minstrel.scope.Scope;
import com.writeoncereadmany.minstrel.scope.Scopes;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.TerminalNode;

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
import com.writeoncereadmany.minstrel.generated.MinstrelParser.If_statementContext;
import com.writeoncereadmany.minstrel.generated.MinstrelParser.NameContext;
import com.writeoncereadmany.minstrel.generated.MinstrelParser.Number_literalContext;
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
    private Scopes scopes;
	private Program program = null;
	
	public ASTBuildingParseListener(final Scope systemScope)
	{
		beingBuilt = new Stack<ASTNodeBuilder>();
        scopes = new Scopes(systemScope);
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
		final ASTNode node = finishedBuilding.build(scopes);
		
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
        if(SimpleBinaryOperators.isOperator(terminal))
        {
            beingBuilt.peek().addNode(SimpleBinaryOperators.forSymbol(terminal));
        }
        else if(ComplexBinaryOperators.isOperator(terminal))
        {
            beingBuilt.peek().addNode(ComplexBinaryOperators.forSymbol(terminal));
        }
	}
	
	@Override
	public void enterProgram(@NotNull ProgramContext ctx) {
		beingBuilt.push(new ProgramBuilder(scopes));
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
	public void enterNumber_literal(@NotNull Number_literalContext ctx) {
		beingBuilt.push(new NumberLiteralBuilder(ctx.getText()));
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
		beingBuilt.push(new IfStatementBuilder(scopes));
	}

    @Override
	public void enterWhile_statement(@NotNull While_statementContext ctx) {
		beingBuilt.push(new WhileStatementBuilder(scopes));
	}


    @Override
	public void enterFunction_definition(@NotNull Function_definitionContext ctx) {
		beingBuilt.push(new FunctionDefinitionBuilder(scopes));
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
		beingBuilt.push(new AnonymousFunctionBuilder(scopes));
	}

    @Override
	public void enterSignature_definition(@NotNull MinstrelParser.Signature_definitionContext ctx) {
		beingBuilt.push(new SignatureBuilder(scopes));
	}

    @Override
	public void enterError_statement(@NotNull Error_statementContext ctx) {
		beingBuilt.push(new ErrorStatementBuilder());
	}

    @Override
    public void enterMethod_call(@NotNull MinstrelParser.Method_callContext ctx) {
        beingBuilt.push(new MethodCallBuilder());
    }

    @Override
    public void enterInterface_definition(@NotNull MinstrelParser.Interface_definitionContext ctx) {
        beingBuilt.push(new InterfaceDefinitionBuilder());
    }

    @Override
    public void enterInterface_body(@NotNull MinstrelParser.Interface_bodyContext ctx) {
        beingBuilt.push(new InterfaceDefinitionBodyBuilder());
    }

    @Override
    public void enterMethod_declaration(@NotNull MinstrelParser.Method_declarationContext ctx) {
        beingBuilt.push(new MethodDeclarationBuilder(scopes));
    }

    @Override
    public void enterClass_definition(@NotNull MinstrelParser.Class_definitionContext ctx) {
        beingBuilt.push(new ClassDefinitionBuilder(scopes));
    }

    @Override
    public void enterClass_body(@NotNull MinstrelParser.Class_bodyContext ctx) {
        beingBuilt.push(new ClassDefinitionBodyBuilder());
    }
}
