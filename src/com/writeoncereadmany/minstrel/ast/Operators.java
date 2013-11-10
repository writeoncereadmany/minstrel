package com.writeoncereadmany.minstrel.ast;

import java.math.BigInteger;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import com.writeoncereadmany.minstrel.runtime.BooleanValue;
import com.writeoncereadmany.minstrel.runtime.ExecutionContext;
import com.writeoncereadmany.minstrel.runtime.IntegerValue;
import com.writeoncereadmany.minstrel.runtime.Value;

public enum Operators implements Operator {
	ADDITION("+") {

		@Override
		public Value apply(ExecutionContext context, Expression first, Expression second) {
			BigInteger product = intValue(first, context).add(intValue(second, context));
			return new IntegerValue(product);
		}
		
	},
	SUBTRACTION("-") {

		@Override
		public Value apply(ExecutionContext context, Expression first, Expression second) {
			BigInteger difference = intValue(first, context).subtract(intValue(second, context));
			return new IntegerValue(difference);
		}
		
	},
	MULTIPLICATION("*") {

		@Override
		public Value apply(ExecutionContext context, Expression first, Expression second) {
			BigInteger product = intValue(first, context).multiply(intValue(second, context));
			return new IntegerValue(product);
		}
		
	},
	DIVISION("/") {
		@Override
		public Value apply(ExecutionContext context, Expression first, Expression second) {
			BigInteger ratio = intValue(first, context).divide(intValue(second, context));
			return new IntegerValue(ratio);
		}
	},
	EQUAL_TO("=") {

		@Override
		public Value apply(ExecutionContext context, Expression first, Expression second) {
			boolean equal = intValue(first, context).equals(intValue(second, context));
			return equal ? BooleanValue.TRUE : BooleanValue.FALSE;
		}
		
	}, NOT_EQUAL_TO("=/=") {

		@Override
		public Value apply(ExecutionContext context, Expression first, Expression second) {
			boolean equal = intValue(first, context).equals(intValue(second, context));
			return equal ? BooleanValue.FALSE: BooleanValue.TRUE;
		}
	}
	;

    private static Map<String, Operators> operatorsBySymbol;

    static {
        Map<String, Operators> operatorsBySymbolBuilder = new HashMap<String, Operators>();
        for(Operators operator: Operators.values())
        {
            operatorsBySymbolBuilder.put(operator.symbol, operator);
        }
        operatorsBySymbol = Collections.unmodifiableMap(operatorsBySymbolBuilder);
    }

    private final String symbol;

    private Operators(String symbol)
    {
        this.symbol = symbol;
    }

    public static Operators forSymbol(String symbol)
    {
        if(operatorsBySymbol.containsKey(symbol))
        {
            return operatorsBySymbol.get(symbol);
        }
        else
        {
            throw new IllegalArgumentException("No operator exists for the symbol " + symbol);
        }
    }

    public static boolean isOperator(String symbol)
    {
        return operatorsBySymbol.containsKey(symbol);
    }

    public String symbol()
    {
        return symbol;
    }

	private static BigInteger intValue(Expression expression, ExecutionContext context)
	{
		return ((IntegerValue)expression.evaluate(context)).getInteger();
	}

}
