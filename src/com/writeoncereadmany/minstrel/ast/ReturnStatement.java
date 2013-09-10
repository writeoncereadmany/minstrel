package com.writeoncereadmany.minstrel.ast;

import com.writeoncereadmany.minstrel.runtime.Context;
import com.writeoncereadmany.minstrel.runtime.Value;

public class ReturnStatement implements Statement {
	
	Expression value;
	
	public ReturnStatement(Expression value)
	{
		this.value = value;
	}

	@Override
	public void execute(Context context) {
		Value returnValue = value.evaluate(context);
		context.setReturnValue(returnValue);
	}

}
