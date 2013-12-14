package com.writeoncereadmany.minstrel.ast.expressions;

import com.writeoncereadmany.minstrel.ast.*;
import com.writeoncereadmany.minstrel.ast.miscellaneous.Block;
import com.writeoncereadmany.minstrel.ast.miscellaneous.ParameterList;
import com.writeoncereadmany.minstrel.ast.miscellaneous.Type;
import com.writeoncereadmany.minstrel.scope.Scopes;

public class AnonymousFunctionBuilder implements ASTNodeBuilder<AnonymousFunction> {

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
	public AnonymousFunction build(Scopes scopes) {
        scopes.exitScope();
		return new AnonymousFunction(parameterList, type, block);
	}
	
	
}
