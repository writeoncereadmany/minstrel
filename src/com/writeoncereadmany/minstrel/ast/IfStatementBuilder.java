package com.writeoncereadmany.minstrel.ast;

import com.writeoncereadmany.minstrel.scope.Scopes;

public class IfStatementBuilder implements ASTNodeBuilder {

	Operation condition;
	Block block;

    public IfStatementBuilder(Scopes scopes)
    {
        scopes.enterScope();
    }
	
	@Override
	public void addNode(ASTNode node) {
		if(null == condition)
		{
			condition = (Operation)node;
		}
		else
		{
			block = (Block)node;
		}
	}

	@Override
	public ASTNode build(Scopes scopes) {
        scopes.exitScope();
		return new IfStatement(condition, block);
	}

}
