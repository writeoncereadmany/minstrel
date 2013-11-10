package com.writeoncereadmany.minstrel.ast;

import java.math.BigInteger;

import com.writeoncereadmany.minstrel.runtime.ExecutionContext;
import com.writeoncereadmany.minstrel.runtime.IntegerValue;
import com.writeoncereadmany.minstrel.runtime.Value;

public class IntegerLiteral implements Expression {

	private final BigInteger integer;
	
	public IntegerLiteral(BigInteger integer)
	{
		this.integer = integer;
	}
	
	@Override
	public Value evaluate(ExecutionContext context) {
		return new IntegerValue(integer);
	}

}
