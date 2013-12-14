package com.writeoncereadmany.minstrel.ast.expressions;

import java.util.List;

import com.writeoncereadmany.minstrel.ast.miscellaneous.ArgumentList;
import com.writeoncereadmany.minstrel.runtime.environment.Environment;
import com.writeoncereadmany.minstrel.runtime.environment.Environments;
import com.writeoncereadmany.minstrel.runtime.context.ExecutionContext;
import com.writeoncereadmany.minstrel.runtime.values.functions.Function;
import com.writeoncereadmany.minstrel.runtime.values.Value;

public class FunctionCall implements Expression {
	
	private Expression functionReference;
	private ArgumentList argumentList;

	public FunctionCall(Expression function, ArgumentList argumentList) {
		this.functionReference = function;
		this.argumentList = argumentList;
	}

	@Override
	public Value evaluate(final ExecutionContext context, Environments environment) {
		Function toExecute = (Function)functionReference.evaluate(context, environment);
		
		List<Value> arguments = argumentList.evaluate(context, environment);

        Environment functionEnvironment = new Environment(arguments);

		return toExecute.call(context, functionEnvironment);
	}

}
