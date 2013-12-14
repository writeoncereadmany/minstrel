package com.writeoncereadmany.minstrel.ast.statements;

import java.util.List;

import com.writeoncereadmany.minstrel.ast.miscellaneous.ArgumentList;
import com.writeoncereadmany.minstrel.listeners.MinstrelParseException;
import com.writeoncereadmany.minstrel.runtime.environment.Environments;
import com.writeoncereadmany.minstrel.runtime.context.ExecutionContext;
import com.writeoncereadmany.minstrel.runtime.values.Value;

public class ErrorStatement implements Statement {

	private final ArgumentList argumentList;
	
	public ErrorStatement(final ArgumentList argumentList)
	{
		this.argumentList = argumentList;
	}
	
	@Override
	public void execute(ExecutionContext context, Environments environment) {
		List<Value> arguments = argumentList.evaluate(context, environment);
		if(arguments.size() != 1)
		{
			throw new MinstrelParseException("Error can only have one argument");
		}
		context.setError(arguments.get(0).show());
	}

}
