package com.writeoncereadmany.minstrel.ast;

import java.util.List;

import com.writeoncereadmany.minstrel.listeners.MinstrelParseException;
import com.writeoncereadmany.minstrel.runtime.ExecutionContext;
import com.writeoncereadmany.minstrel.runtime.Value;

public class ErrorStatement implements Statement {

	private final ArgumentList argumentList;
	
	public ErrorStatement(final ArgumentList argumentList)
	{
		this.argumentList = argumentList;
	}
	
	@Override
	public void execute(ExecutionContext context) {
		List<Value> arguments = argumentList.evaluate(context);
		if(arguments.size() != 1)
		{
			throw new MinstrelParseException("Error can only have one argument");
		}
		context.setError(arguments.get(0).show());
	}

}
