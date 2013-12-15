package com.writeoncereadmany.minstrel.ast.statements.definitions.functions;

import com.writeoncereadmany.minstrel.ast.*;
import com.writeoncereadmany.minstrel.ast.miscellaneous.Block;
import com.writeoncereadmany.minstrel.ast.miscellaneous.Name;
import com.writeoncereadmany.minstrel.ast.miscellaneous.ParameterList;
import com.writeoncereadmany.minstrel.ast.miscellaneous.Type;
import com.writeoncereadmany.minstrel.ast.statements.definitions.functions.FunctionDefinition;
import com.writeoncereadmany.minstrel.scope.Scopes;

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
            scopes.peekAtDepth(1).add(name.getName());
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
