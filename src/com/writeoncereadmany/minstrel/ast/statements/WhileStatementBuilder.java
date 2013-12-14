package com.writeoncereadmany.minstrel.ast.statements;

import com.writeoncereadmany.minstrel.ast.ASTNode;
import com.writeoncereadmany.minstrel.ast.ASTNodeBuilder;
import com.writeoncereadmany.minstrel.ast.expressions.Expression;
import com.writeoncereadmany.minstrel.ast.miscellaneous.Block;
import com.writeoncereadmany.minstrel.scope.Scopes;

public class WhileStatementBuilder implements ASTNodeBuilder<WhileStatement> {

	Expression condition;
	Block block;

    public WhileStatementBuilder(Scopes scopes)
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
	public WhileStatement build(Scopes scopes) {
        scopes.exitScope();
		return new WhileStatement(condition, block);
	}

}
