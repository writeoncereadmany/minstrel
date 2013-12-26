package com.writeoncereadmany.minstrel.ast.miscellaneous;

import com.writeoncereadmany.minstrel.ast.ASTNode;
import com.writeoncereadmany.minstrel.ast.ASTNodeBuilder;
import com.writeoncereadmany.minstrel.scope.Scopes;

public class ParameterBuilder implements ASTNodeBuilder<Parameter> {

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
	public Parameter build(Scopes scopes) {
        scopes.add(type, name);
		return new Parameter(type, name);
	}

}
