package com.writeoncereadmany.minstrel.ast;

import java.util.List;

import com.writeoncereadmany.minstrel.ast.statements.Statement;
import com.writeoncereadmany.minstrel.runtime.environment.Environment;
import com.writeoncereadmany.minstrel.runtime.environment.Environments;
import com.writeoncereadmany.minstrel.runtime.context.ExecutionContext;

public class Program implements ASTNode {
	
	private List<Statement> nodes;

	public Program(List<Statement> nodes)
	{
		this.nodes = nodes;
	}
	
	public void execute(final ExecutionContext context, Environments environment)
	{
        Environments programEnvironment = environment.childEnvironment(new Environment());
		for(Statement statement: nodes)
		{
            if(context.hasReturned() || context.hasError())
            {
                return;
            }
			statement.execute(context, programEnvironment);
		}
	}

}
