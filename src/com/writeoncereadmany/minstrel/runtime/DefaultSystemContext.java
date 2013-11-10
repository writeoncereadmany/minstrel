package com.writeoncereadmany.minstrel.runtime;

import com.writeoncereadmany.minstrel.runtime.utility.Printer;
import com.writeoncereadmany.minstrel.scope.Scope;

public class DefaultSystemContext extends ExecutionContext {
	
	private DefaultSystemContext()
	{
		super(null);
	}
	
	public static ExecutionContext create()
	{
		return new ExecutionContext(createDefaultSystemEnvironment());
	}
	
	public static final Environment createDefaultSystemEnvironment()
	{
		Environment systemEnvironment = new Environment();
		systemEnvironment.setVariable("print", new PrintFunction(new Printer() {
			@Override
			public void println(String toPrint) {
				System.out.println(toPrint);
			}
		}));
		systemEnvironment.setVariable("true", BooleanValue.TRUE);
		systemEnvironment.setVariable("false", BooleanValue.FALSE);
		systemEnvironment.setVariable("unit",UnitValue.UNIT);
		
		return systemEnvironment;
	}

    public static final Scope createDefaultSystemScope()
    {
        Scope scope = new Scope();
        scope.add("print");
        scope.add("true");
        scope.add("false");
        scope.add("unit");
        return scope;
    }

}
