package com.writeoncereadmany.minstrel.ast;

import com.writeoncereadmany.minstrel.runtime.ExecutionContext;
import com.writeoncereadmany.minstrel.runtime.Value;

public class Operation implements Expression {
	
	private Expression firstArgument;
	private Operator operator;
	private Expression secondArgument;
	
	public Operation(Expression firstArgument, Operator operator, Expression secondArgument)
	{
		this.firstArgument = firstArgument;
		this.operator = operator;
		this.secondArgument = secondArgument;
	}
	
	@Override
	public Value evaluate(ExecutionContext context) {
		return operator.apply(context, firstArgument, secondArgument);
	}

}
