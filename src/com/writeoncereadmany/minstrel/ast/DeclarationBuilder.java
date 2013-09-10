package com.writeoncereadmany.minstrel.ast;

public class DeclarationBuilder implements ASTNodeBuilder {

	private Type type;
	private Name name;
	private Expression value;
	
	@Override
	public void addNode(ASTNode node) {
		if(null == type)
		{
			type = (Type)node;
		} 
		else if (null == name) 
		{
			name = (Name)node;
		} 
		else 
		{
			value = (Expression)node;
		}
	}

	@Override
	public ASTNode build() {
		return new Declaration(type, name, value);
	}

}
