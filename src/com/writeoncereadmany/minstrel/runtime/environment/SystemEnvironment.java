package com.writeoncereadmany.minstrel.runtime.environment;

import com.writeoncereadmany.minstrel.runtime.utility.Printer;
import com.writeoncereadmany.minstrel.runtime.values.enums.BooleanValue;
import com.writeoncereadmany.minstrel.runtime.values.enums.UnitValue;
import com.writeoncereadmany.minstrel.runtime.values.Value;
import com.writeoncereadmany.minstrel.runtime.values.functions.NotFunction;
import com.writeoncereadmany.minstrel.runtime.values.functions.PrintFunction;
import com.writeoncereadmany.minstrel.scope.Scope;

import java.util.Map;
import java.util.TreeMap;

public class SystemEnvironment {

    private static final Map<String, Value> systemValues = new TreeMap<String, Value>();

    // Doesn't matter what order these are iterated over in, as long as it's consistent when iterating over keys and values
    static
    {
        systemValues.put("print", new PrintFunction(new Printer() {
            @Override
            public void println(String toPrint) {
                System.out.println(toPrint);
            }
        }));
        systemValues.put("not", NotFunction.INSTANCE);
        systemValues.put("true", BooleanValue.TRUE);
        systemValues.put("false", BooleanValue.FALSE);
        systemValues.put("unit", UnitValue.UNIT);
    }

    public static final Environment createSystemEnvironment()
    {
        Environment environment = new Environment();
        for(Value value : systemValues.values())
        {
            environment.defineValue(value);
        }
        return environment;
    }

    public static final Scope createSystemScope()
    {
        Scope scope = new Scope();
        for(String name: systemValues.keySet())
        {
            scope.add(name);
        }
        return scope;
    }

}
