package com.writeoncereadmany.minstrel.ast;

import com.writeoncereadmany.minstrel.runtime.ExecutionContext;

public class Declaration implements Statement {

	private Expression value;
	private Name name;
	private Type type;
	
	public Declaration(Type type, Name name, Expression value)
	{
		this.type = type;
		this.name = name;
		this.value = value;
	}
	
	@Override
	public void execute(ExecutionContext context) {
		context.setVariable(name.getName(), value.evaluate(context));
	}

}
