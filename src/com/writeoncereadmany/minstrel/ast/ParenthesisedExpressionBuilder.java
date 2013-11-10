package com.writeoncereadmany.minstrel.ast;

import com.writeoncereadmany.minstrel.scope.Scopes;

public class ParenthesisedExpressionBuilder implements ASTNodeBuilder {

	private Expression expression;
	
	@Override
	public void addNode(ASTNode node) {
		expression = (Expression)node;
	}

	@Override
	public ASTNode build(Scopes scopes) {
		return expression;
	}
}
