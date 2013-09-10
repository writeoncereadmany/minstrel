package com.writeoncereadmany.minstrel.ast;

import java.util.List;

import com.writeoncereadmany.minstrel.runtime.Context;

public class Program implements ASTNode {
	
	private List<Statement> nodes;

	public Program(List<Statement> nodes)
	{
		this.nodes = nodes;
	}
	
	public void execute(final Context context)
	{
		for(Statement statement: nodes)
		{
			statement.execute(context);
		}
	}
}
