package com.writeoncereadmany.minstrel.runtime;

import com.writeoncereadmany.minstrel.runtime.utility.Printer;

public class DefaultSystemContext extends Context {
	
	public DefaultSystemContext()
	{
		super(createDefaultSystemScope());
	}
	
	public static final Scope createDefaultSystemScope()
	{
		Scope systemScope = new Scope();
		systemScope.setVariable("print", new PrintFunction(new Printer() {
			@Override
			public void println(String toPrint) {
				System.out.println(toPrint);
			}
		}));
		systemScope.setVariable("true", BooleanValue.TRUE);
		systemScope.setVariable("false", BooleanValue.FALSE);
		systemScope.setVariable("unit",UnitValue.UNIT);
		
		return systemScope;
	}

}
