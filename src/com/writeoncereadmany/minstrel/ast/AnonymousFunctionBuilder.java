package com.writeoncereadmany.minstrel.ast;

import com.writeoncereadmany.minstrel.scope.Scopes;

public class AnonymousFunctionBuilder implements ASTNodeBuilder {

	ParameterList parameterList;
	Type type;
	Block block;

    public AnonymousFunctionBuilder(Scopes scopes)
    {
        scopes.enterScope();
    }
	
	@Override
	public void addNode(ASTNode node) {
		if(null == parameterList)
		{
			parameterList = (ParameterList)node;
		}
		else if(null == type)
		{
			type = (Type)node;
		}
		else
		{
			block = (Block)node;
		}
	}

	@Override
	public ASTNode build(Scopes scopes) {
        scopes.exitScope();
		return new AnonymousFunction(parameterList, type, block);
	}
	
	
}
