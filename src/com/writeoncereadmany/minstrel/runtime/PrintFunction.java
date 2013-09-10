package com.writeoncereadmany.minstrel.runtime;

import java.util.List;

import com.writeoncereadmany.minstrel.runtime.utility.Printer;

public class PrintFunction implements Function {

	private final Printer printStream;
	
	public PrintFunction(final Printer printStream) 
	{
		this.printStream = printStream;
	}
	
	@Override
	public Value call(Context context, List<Value> arguments) {
		if(arguments.size() != 1)
		{
			throw new UnsupportedOperationException("Print only takes one parameter");
		}
		Value argument = arguments.get(0);
		printStream.println(argument.show());
		return UnitValue.UNIT;
	}

	@Override
	public String show() {
		throw new UnsupportedOperationException("Cannot show a function");
	}
}
