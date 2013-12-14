package com.writeoncereadmany.minstrel.ast.statements;

import com.writeoncereadmany.minstrel.ast.ASTNode;
import com.writeoncereadmany.minstrel.ast.ASTNodeBuilder;
import com.writeoncereadmany.minstrel.ast.expressions.Expression;
import com.writeoncereadmany.minstrel.ast.statements.ExpressionStatement;
import com.writeoncereadmany.minstrel.scope.Scopes;

public class ExpressionStatementBuilder implements ASTNodeBuilder<ExpressionStatement> {
	
	private Expression expression;

	@Override
	public void addNode(ASTNode node) {
		if(null==expression)
		{
			expression = (Expression)node;
		}
		else throw new IllegalStateException("One node only please!");
	}

	@Override
	public ExpressionStatement build(Scopes scopes) {
		return new ExpressionStatement(expression);
	}
}
