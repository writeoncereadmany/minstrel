package com.writeoncereadmany.minstrel.ast;

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
	public ASTNode build() {
		return new Variable(name);
	}
}
