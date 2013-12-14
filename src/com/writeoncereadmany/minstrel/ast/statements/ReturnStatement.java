package com.writeoncereadmany.minstrel.ast.statements;

import com.writeoncereadmany.minstrel.ast.expressions.Expression;
import com.writeoncereadmany.minstrel.runtime.environment.Environments;
import com.writeoncereadmany.minstrel.runtime.context.ExecutionContext;
import com.writeoncereadmany.minstrel.runtime.values.Value;

public class ReturnStatement implements Statement {
	
	Expression value;
	
	public ReturnStatement(Expression value)
	{
		this.value = value;
	}

	@Override
	public void execute(ExecutionContext context, Environments environment) {
		Value returnValue = value.evaluate(context, environment);
		context.setReturnValue(returnValue);
	}

}
