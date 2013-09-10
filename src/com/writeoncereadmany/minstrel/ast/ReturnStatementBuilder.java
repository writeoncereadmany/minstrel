package com.writeoncereadmany.minstrel.ast;

public class ReturnStatementBuilder implements ASTNodeBuilder {

	Expression value;
	
	@Override
	public void addNode(ASTNode node) {
		value = (Expression)node;
	}

	@Override
	public ASTNode build() {
		return new ReturnStatement(value);
	}

}
