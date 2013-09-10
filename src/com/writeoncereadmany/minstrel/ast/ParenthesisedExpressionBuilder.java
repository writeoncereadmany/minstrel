package com.writeoncereadmany.minstrel.ast;

public class ParenthesisedExpressionBuilder implements ASTNodeBuilder {

	private Expression expression;
	
	@Override
	public void addNode(ASTNode node) {
		expression = (Expression)node;
	}

	@Override
	public ASTNode build() {
		return expression;
	}
}
