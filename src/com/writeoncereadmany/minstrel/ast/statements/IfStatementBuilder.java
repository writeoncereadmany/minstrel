package com.writeoncereadmany.minstrel.ast.statements;

import com.writeoncereadmany.minstrel.ast.ASTNode;
import com.writeoncereadmany.minstrel.ast.ASTNodeBuilder;
import com.writeoncereadmany.minstrel.ast.expressions.Expression;
import com.writeoncereadmany.minstrel.ast.miscellaneous.Block;
import com.writeoncereadmany.minstrel.scope.Scopes;

public class IfStatementBuilder implements ASTNodeBuilder<IfStatement> {

	Expression condition;
	Block block;

    public IfStatementBuilder(Scopes scopes)
    {
        scopes.enterScope();
    }
	
	@Override
	public void addNode(ASTNode node) {
		if(null == condition)
		{
			condition = (Expression)node;
		}
		else
		{
			block = (Block)node;
		}
	}

	@Override
	public IfStatement build(Scopes scopes) {
        scopes.exitScope();
		return new IfStatement(condition, block);
	}

}
