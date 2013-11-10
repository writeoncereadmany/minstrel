package com.writeoncereadmany.minstrel.ast;

import java.util.List;

import com.writeoncereadmany.minstrel.runtime.ExecutionContext;
import com.writeoncereadmany.minstrel.runtime.Function;
import com.writeoncereadmany.minstrel.runtime.Value;

public class FunctionCall implements Expression {
	
	private Expression functionReference;
	private ArgumentList argumentList;

	public FunctionCall(Expression function, ArgumentList argumentList) {
		this.functionReference = function;
		this.argumentList = argumentList;
	}

	@Override
	public Value evaluate(final ExecutionContext context) {
		Function toExecute = (Function)functionReference.evaluate(context);
		
		List<Value> arguments = argumentList.evaluate(context);
		
		return toExecute.call(context, arguments);
	}

}
