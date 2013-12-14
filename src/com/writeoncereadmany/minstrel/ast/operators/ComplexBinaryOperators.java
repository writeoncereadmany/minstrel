package com.writeoncereadmany.minstrel.ast.operators;

import com.writeoncereadmany.minstrel.ast.expressions.Expression;
import com.writeoncereadmany.minstrel.ast.expressions.FunctionCall;
import com.writeoncereadmany.minstrel.ast.expressions.Variable;
import com.writeoncereadmany.minstrel.ast.miscellaneous.ArgumentList;
import com.writeoncereadmany.minstrel.scope.Scopes;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import static com.writeoncereadmany.minstrel.ast.operators.SimpleBinaryOperators.EQUAL_TO;

public enum ComplexBinaryOperators implements Operator {

    NOT_EQUALS("=/=")
            {
        @Override
        public Expression build(Expression firstArgument, Expression secondArgument, Scopes scopes) {
            final Variable notFunction = new Variable("not", scopes.getDeBruijnIndex("not"));
            final Expression equals = EQUAL_TO.build(firstArgument, secondArgument, scopes);
            return new FunctionCall(notFunction, new ArgumentList(equals));
        }
    };

    private String symbol;

    ComplexBinaryOperators(String symbol)
    {
        this.symbol = symbol;
    }

    public String symbol()
    {
        return symbol;
    }

    private static Map<String, ComplexBinaryOperators> operatorsBySymbol;

    static {
        Map<String, ComplexBinaryOperators> operatorsBySymbolBuilder = new HashMap<String, ComplexBinaryOperators>();
        for(ComplexBinaryOperators operator: ComplexBinaryOperators.values())
        {
            operatorsBySymbolBuilder.put(operator.symbol, operator);
        }
        operatorsBySymbol = Collections.unmodifiableMap(operatorsBySymbolBuilder);
    }

    public static ComplexBinaryOperators forSymbol(String symbol)
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

    public static boolean isOperator(String terminal)
    {
        return operatorsBySymbol.containsKey(terminal);
    }
}
