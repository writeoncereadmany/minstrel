package com.writeoncereadmany.minstrel.runtime.values.objects;

import com.writeoncereadmany.minstrel.runtime.context.ExecutionContext;
import com.writeoncereadmany.minstrel.runtime.environment.Environment;
import com.writeoncereadmany.minstrel.runtime.numbers.Rational;
import com.writeoncereadmany.minstrel.runtime.numbers.formatter.Formatter;
import com.writeoncereadmany.minstrel.runtime.numbers.formatter.FractionFormatter;
import com.writeoncereadmany.minstrel.runtime.values.Value;
import com.writeoncereadmany.minstrel.runtime.values.enums.BooleanValue;

public class NumberValue implements MinstrelObject {

    public static final Formatter<Rational> FORMATTER = new FractionFormatter();
    private final Rational number;
	
	public NumberValue(Rational number)
	{
		this.number = number;
	}
	
	public Rational getNumber()
	{
		return number;
	}
	
	@Override
	public String show()
    {
		return FORMATTER.format(number);
	}

    @Override
    public Value callMethod(String methodName, ExecutionContext context, Environment methodEnvironment) {
        if(methodName.equals("plus"))
        {
            return plus(methodEnvironment);
        }
        if(methodName.equals("minus"))
        {
            return minus(methodEnvironment);
        }
        if(methodName.equals("multipliedBy"))
        {
            return multipliedBy(methodEnvironment);
        }
        if(methodName.equals("dividedBy"))
        {
            return dividedBy(methodEnvironment);
        }
        if(methodName.equals("equals"))
        {
            return equalityCheck(methodEnvironment);
        }
        throw new UnsupportedOperationException("Number does not support method " + methodName);
    }

    private Value plus(Environment methodEnvironment) {
        NumberValue otherNumber = (NumberValue)methodEnvironment.getValue(0);
        return new NumberValue(number.plus(otherNumber.getNumber()));
    }

    private Value minus(Environment methodEnvironment) {
        NumberValue otherNumber = (NumberValue)methodEnvironment.getValue(0);
        return new NumberValue(number.minus(otherNumber.getNumber()));
    }

    private Value multipliedBy(Environment methodEnvironment) {
        NumberValue otherNumber = (NumberValue)methodEnvironment.getValue(0);
        return new NumberValue(number.multipliedBy(otherNumber.getNumber()));
    }

    private Value dividedBy(Environment methodEnvironment) {
        NumberValue otherNumber = (NumberValue)methodEnvironment.getValue(0);
        return new NumberValue(number.dividedBy(otherNumber.getNumber()));
    }

    private Value equalityCheck(Environment methodEnvironment)
    {
        NumberValue otherNumber = (NumberValue)methodEnvironment.getValue(0);
        return BooleanValue.forBoolean(number.equals(otherNumber.getNumber()));
    }
}
