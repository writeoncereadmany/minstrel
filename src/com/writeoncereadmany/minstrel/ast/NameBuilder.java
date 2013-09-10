package com.writeoncereadmany.minstrel.ast;

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
	public ASTNode build() {
		return new Name(name);
	}
}
