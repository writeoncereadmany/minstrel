package com.writeoncereadmany.minstrel.ast.statements.definitions.functions;

import com.writeoncereadmany.minstrel.ast.*;
import com.writeoncereadmany.minstrel.ast.miscellaneous.*;
import com.writeoncereadmany.minstrel.ast.statements.definitions.functions.FunctionDefinition;
import com.writeoncereadmany.minstrel.scope.Scopes;

import java.util.ArrayList;

public class FunctionDefinitionBuilder implements ASTNodeBuilder<FunctionDefinition> {

    private final Scopes scopes;
    private Name name;
	private ParameterList parameterList;
	private Type returnType;
	private Block functionBlock;

    public FunctionDefinitionBuilder(Scopes scopes)
    {
        scopes.enterScope();
        this.scopes = scopes;
    }
	
	@Override
	public void addNode(ASTNode node) {
		if(null == name)
		{
			name = (Name)node;
            Type functionType = new Type(new Name("Function " + name.getName()));
            scopes.peekAtDepth(1).add(functionType, name);
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
	public FunctionDefinition build(Scopes scopes) {
        scopes.exitScope();
		return new FunctionDefinition(name, parameterList, returnType, functionBlock);
	}

}
