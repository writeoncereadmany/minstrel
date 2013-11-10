package com.writeoncereadmany.minstrel.ast;

import com.writeoncereadmany.minstrel.scope.Scopes;

public class NameBuilder implements ASTNodeBuilder {

	private final String name;
	
	public NameBuilder(final String name)
	{
		this.name = name;
	}
	
	@Override
	public void addNode(ASTNode node) {
		throw new UnsupportedOperationException();
	}

	@Override
	public ASTNode build(Scopes scopes) {
		return new Name(name);
	}
}
