package com.writeoncereadmany.minstrel.ast;

public class ParameterBuilder implements ASTNodeBuilder {

	private Type type;
	private Name name;
	
	@Override
	public void addNode(ASTNode node) {
		if(null == type)
		{
			this.type = (Type)node;
		}
		else 
		{
			this.name = (Name)node;
		}
	}

	@Override
	public ASTNode build() {
		return new Parameter(type, name);
	}

}
