package com.writeoncereadmany.minstrel.ast;

import java.math.BigInteger;

import com.writeoncereadmany.minstrel.runtime.BooleanValue;
import com.writeoncereadmany.minstrel.runtime.Context;
import com.writeoncereadmany.minstrel.runtime.IntegerValue;
import com.writeoncereadmany.minstrel.runtime.Value;

public enum Operators implements Operator {
	ADDITION {

		@Override
		public Value apply(Context context, Expression first, Expression second) {
			BigInteger product = intValue(first, context).add(intValue(second, context));
			return new IntegerValue(product);
		}
		
	},
	SUBTRACTION {

		@Override
		public Value apply(Context context, Expression first, Expression second) {
			BigInteger difference = intValue(first, context).subtract(intValue(second, context));
			return new IntegerValue(difference);
		}
		
	},
	MULTIPLICATION {

		@Override
		public Value apply(Context context, Expression first, Expression second) {
			BigInteger product = intValue(first, context).multiply(intValue(second, context));
			return new IntegerValue(product);
		}
		
	},
	DIVISION {
		@Override
		public Value apply(Context context, Expression first, Expression second) {
			BigInteger ratio = intValue(first, context).divide(intValue(second, context));
			return new IntegerValue(ratio);
		}
	},
	EQUAL_TO {

		@Override
		public Value apply(Context context, Expression first, Expression second) {
			boolean equal = intValue(first, context).equals(intValue(second, context));
			return equal ? BooleanValue.TRUE : BooleanValue.FALSE;
		}
		
	}, NOT_EQUAL_TO {

		@Override
		public Value apply(Context context, Expression first, Expression second) {
			boolean equal = intValue(first, context).equals(intValue(second, context));
			return equal ? BooleanValue.FALSE: BooleanValue.TRUE;
		}
	}
	;

	private static BigInteger intValue(Expression expression, Context context)
	{
		return ((IntegerValue)expression.evaluate(context)).getInteger();
	}
}
