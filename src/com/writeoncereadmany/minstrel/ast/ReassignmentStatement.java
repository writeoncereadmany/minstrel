package com.writeoncereadmany.minstrel.ast;

import com.writeoncereadmany.minstrel.runtime.ExecutionContext;

public class ReassignmentStatement implements Statement {

	private final Name name;
	private final Expression newValue;
	
	public ReassignmentStatement(Name name, Expression newValue)
	{
		this.name = name;
		this.newValue = newValue;
	}
	
	@Override
	public void execute(ExecutionContext context) {
		context.updateVariable(name.getName(), newValue.evaluate(context));
	}

}
