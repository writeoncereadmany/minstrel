package com.writeoncereadmany.minstrel.ast.operators;

import java.util.*;

import com.writeoncereadmany.minstrel.ast.expressions.Expression;
import com.writeoncereadmany.minstrel.ast.expressions.MethodCall;
import com.writeoncereadmany.minstrel.ast.miscellaneous.ArgumentList;
import com.writeoncereadmany.minstrel.ast.miscellaneous.Name;
import com.writeoncereadmany.minstrel.scope.Scopes;

public enum SimpleBinaryOperators implements Operator {

	ADDITION("+", "plus"),
	SUBTRACTION("-", "minus"),
	MULTIPLICATION("*", "multipliedBy"),
	DIVISION("/", "dividedBy"),
	EQUAL_TO("=", "equals");

    private final String symbol;
    private final Name name;

    private SimpleBinaryOperators(String symbol, String methodName)
    {
        this.symbol = symbol;
        this.name = new Name(methodName);
    }

    @Override
    public Expression build(Expression firstArgument, Expression secondArgument, Scopes scopes) {
        return new MethodCall(firstArgument, getMethodName(), new ArgumentList(secondArgument));
    }

    private static Map<String, SimpleBinaryOperators> operatorsBySymbol;

    static {
        Map<String, SimpleBinaryOperators> operatorsBySymbolBuilder = new HashMap<String, SimpleBinaryOperators>();
        for(SimpleBinaryOperators operator: SimpleBinaryOperators.values())
        {
            operatorsBySymbolBuilder.put(operator.symbol, operator);
        }
        operatorsBySymbol = Collections.unmodifiableMap(operatorsBySymbolBuilder);
    }

    public String symbol()
    {
        return symbol;
    }

    private Name getMethodName() {
        return name;
    }

    public static SimpleBinaryOperators forSymbol(String symbol)
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

}
