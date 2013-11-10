package com.writeoncereadmany.minstrel.ast;

import com.writeoncereadmany.minstrel.scope.Scopes;

public class FunctionInterfaceBuilder implements ASTNodeBuilder {
	
	private Name name;
	private ParameterList parameterList;
	private Type returnType;

    public FunctionInterfaceBuilder(final Scopes scopes)
    {
        scopes.enterScope();
    }
	
	@Override
	public void addNode(ASTNode node) {
		if(name == null)
		{
			name = (Name)node;
		}
		else if(parameterList == null)
		{
			parameterList = (ParameterList)node;
		}
		else 
		{
			returnType = (Type)node;
		}
	}
	
	@Override
	public ASTNode build(Scopes scopes) {
        scopes.exitScope();
		return new FunctionInterface(name, parameterList, returnType);
	}

}
