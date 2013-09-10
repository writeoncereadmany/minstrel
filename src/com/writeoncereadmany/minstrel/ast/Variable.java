package com.writeoncereadmany.minstrel.ast;

import com.writeoncereadmany.minstrel.runtime.Context;
import com.writeoncereadmany.minstrel.runtime.Value;

public class Variable implements Expression {

	private final String name;
	
	public Variable(String name) 
	{
		this.name = name;
	}

	@Override
	public Value evaluate(final Context context) {
		return context.getVariable(name);
	}
}
