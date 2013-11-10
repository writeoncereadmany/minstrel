package com.writeoncereadmany.minstrel.ast;

import com.writeoncereadmany.minstrel.scope.Scopes;

public class VariableBuilder implements ASTNodeBuilder{
	
	private String name;
	
	public VariableBuilder(final String name)
	{
		this.name = name;
	}

	@Override
	public void addNode(ASTNode node) {
	
	}

	@Override
	public ASTNode build(Scopes scopes) {
		return new Variable(name);
	}
}
