package com.writeoncereadmany.minstrel.ast.expressions;

import com.writeoncereadmany.minstrel.ast.expressions.Expression;
import com.writeoncereadmany.minstrel.ast.miscellaneous.Name;
import com.writeoncereadmany.minstrel.ast.miscellaneous.Type;
import com.writeoncereadmany.minstrel.runtime.environment.Environments;
import com.writeoncereadmany.minstrel.runtime.context.ExecutionContext;
import com.writeoncereadmany.minstrel.runtime.numbers.Rational;
import com.writeoncereadmany.minstrel.runtime.values.objects.NumberValue;
import com.writeoncereadmany.minstrel.runtime.values.Value;
import com.writeoncereadmany.minstrel.scope.Scopes;

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

    @Override
    public Type getType(Scopes scopes) {
        return new Type(new Name("Number"));
    }


}
