package com.writeoncereadmany.minstrel.ast;

import com.writeoncereadmany.minstrel.scope.Scopes;

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
	public ASTNode build(Scopes scopes) {
        scopes.add(name.getName());
		return new Declaration(type, name, value);
	}

}
