package com.writeoncereadmany.minstrel.ast.expressions;

import com.writeoncereadmany.minstrel.ast.ASTNode;
import com.writeoncereadmany.minstrel.ast.ASTNodeBuilder;
import com.writeoncereadmany.minstrel.ast.expressions.Expression;
import com.writeoncereadmany.minstrel.scope.Scopes;

public class ParenthesisedExpressionBuilder implements ASTNodeBuilder<Expression> {

	private Expression expression;
	
	@Override
	public void addNode(ASTNode node) {
		expression = (Expression)node;
	}

	@Override
	public Expression build(Scopes scopes) {
		return expression;
	}
}
