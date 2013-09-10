package com.writeoncereadmany.minstrel.ast;

public class DefinitionBuilder implements ASTNodeBuilder {

	private Statement statement;

	@Override
	public void addNode(ASTNode node) {
		this.statement = (Statement)node;
	}

	@Override
	public ASTNode build() {
		return statement;
	}
	
}
