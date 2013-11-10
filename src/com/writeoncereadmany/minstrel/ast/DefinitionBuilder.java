package com.writeoncereadmany.minstrel.ast;

import com.writeoncereadmany.minstrel.scope.Scopes;

public class DefinitionBuilder implements ASTNodeBuilder {

	private Statement statement;

	@Override
	public void addNode(ASTNode node) {
		this.statement = (Statement)node;
	}

	@Override
	public ASTNode build(Scopes scopes) {
		return statement;
	}
	
}
