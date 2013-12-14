package com.writeoncereadmany.minstrel.runtime.values.objects;


import com.writeoncereadmany.minstrel.runtime.context.ExecutionContext;
import com.writeoncereadmany.minstrel.runtime.environment.Environment;
import com.writeoncereadmany.minstrel.runtime.values.Value;

public class StringValue implements MinstrelObject {
	
	private final String string;
	
	public StringValue(final String string)
	{
		this.string = string;
	}

    @Override
    public String show() {
        return getString();
    }

    @Override
    public Value callMethod(String methodName, ExecutionContext context, Environment methodEnvironment) {
        if(methodName.equals("plus"))
        {
            return plus(methodEnvironment);
        }
        throw new UnsupportedOperationException("Method " + methodName + " not defined for String");
    }

    private Value plus(Environment methodEnvironment) {
        StringValue stringToBeAdded = (StringValue)methodEnvironment.getValue(0);
        return new StringValue(string + stringToBeAdded.getString());
    }

    public String getString() {
        return string;
    }
}
