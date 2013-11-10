package com.writeoncereadmany.minstrel.ast;

import com.writeoncereadmany.minstrel.scope.Scopes;

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
	public ASTNode build(Scopes scopes) {
        scopes.add(name.getName());
		return new Parameter(type, name);
	}

}
