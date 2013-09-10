package com.writeoncereadmany.minstrel.ast;

public class ExpressionStatementBuilder implements ASTNodeBuilder {
	
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
	public ASTNode build() {
		return new ExpressionStatement(expression);
	}
}
