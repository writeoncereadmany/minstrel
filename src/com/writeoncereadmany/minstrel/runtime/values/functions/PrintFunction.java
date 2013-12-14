package com.writeoncereadmany.minstrel.runtime.values.functions;

import com.writeoncereadmany.minstrel.runtime.context.ExecutionContext;
import com.writeoncereadmany.minstrel.runtime.environment.Environment;
import com.writeoncereadmany.minstrel.runtime.utility.Printer;
import com.writeoncereadmany.minstrel.runtime.values.enums.UnitValue;
import com.writeoncereadmany.minstrel.runtime.values.Value;

public class PrintFunction implements Function {

	private final Printer printStream;
	
	public PrintFunction(final Printer printStream) 
	{
		this.printStream = printStream;
	}
	
	@Override
	public Value call(ExecutionContext context, Environment functionEnvironment) {
		Value argument = functionEnvironment.getValue(0);
		printStream.println(argument.show());
		return UnitValue.UNIT;
	}

    @Override
    public String show() {
        throw new UnsupportedOperationException();
    }
}