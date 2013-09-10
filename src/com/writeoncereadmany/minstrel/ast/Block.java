package com.writeoncereadmany.minstrel.ast;

import java.util.List;

import com.writeoncereadmany.minstrel.runtime.Context;

public class Block implements ASTNode {

	private final List<Statement> statements;
	
	public Block(List<Statement> statements)
	{
		this.statements = statements;
	}
	
	public void execute(Context context)
	{
		for(Statement statement: statements)
		{
			if(context.hasReturned())
			{
				break;
			}
			statement.execute(context);
		}
	}
}
