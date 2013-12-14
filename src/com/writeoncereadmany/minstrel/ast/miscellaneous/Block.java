package com.writeoncereadmany.minstrel.ast.miscellaneous;

import java.util.List;

import com.writeoncereadmany.minstrel.ast.ASTNode;
import com.writeoncereadmany.minstrel.ast.statements.Statement;
import com.writeoncereadmany.minstrel.runtime.environment.Environments;
import com.writeoncereadmany.minstrel.runtime.context.ExecutionContext;

public class Block implements ASTNode {

	private final List<Statement> statements;
	
	public Block(List<Statement> statements)
	{
		this.statements = statements;
	}
	
	public void execute(ExecutionContext context, Environments environment)
	{
		for(Statement statement: statements)
		{
			if(context.hasReturned() || context.hasError())
			{
				return;
			}
			statement.execute(context, environment);
		}
	}

}
