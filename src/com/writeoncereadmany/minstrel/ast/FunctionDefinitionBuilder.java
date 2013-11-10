package com.writeoncereadmany.minstrel.ast;

import com.writeoncereadmany.minstrel.scope.Scopes;

public class FunctionDefinitionBuilder implements ASTNodeBuilder {

	private Name name;
	private ParameterList parameterList;
	private Type returnType;
	private Block functionBlock;

    public FunctionDefinitionBuilder(Scopes scopes)
    {
        scopes.enterScope();
    }
	
	@Override
	public void addNode(ASTNode node) {
		if(null == name)
		{
			name = (Name)node;
		}
		else if(null == parameterList)
		{
			parameterList = (ParameterList)node;
		}
		else if(null == returnType)
		{
			returnType = (Type)node;
		}
		else functionBlock = (Block)node;
	}

	@Override
	public ASTNode build(Scopes scopes) {
        scopes.exitScope();
        scopes.add(name.getName());
		return new FunctionDefinition(name, parameterList, returnType, functionBlock);
	}

}
