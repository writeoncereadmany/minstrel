package com.writeoncereadmany.minstrel.ast.expressions;

import com.writeoncereadmany.minstrel.ast.expressions.Expression;
import com.writeoncereadmany.minstrel.runtime.environment.Environments;
import com.writeoncereadmany.minstrel.runtime.context.ExecutionContext;
import com.writeoncereadmany.minstrel.runtime.numbers.Rational;
import com.writeoncereadmany.minstrel.runtime.values.objects.NumberValue;
import com.writeoncereadmany.minstrel.runtime.values.Value;

public class NumberLiteral implements Expression {

	private final Rational number;
	
	public NumberLiteral(Rational number)
	{
		this.number = number;
	}
	
	@Override
	public Value evaluate(ExecutionContext context, Environments environment) {
		return new NumberValue(number);
	}

}
