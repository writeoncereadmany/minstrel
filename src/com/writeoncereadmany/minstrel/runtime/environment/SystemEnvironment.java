package com.writeoncereadmany.minstrel.runtime.environment;

import com.writeoncereadmany.minstrel.ast.miscellaneous.Modifier;
import com.writeoncereadmany.minstrel.ast.miscellaneous.Name;
import com.writeoncereadmany.minstrel.ast.miscellaneous.Type;
import com.writeoncereadmany.minstrel.runtime.utility.Printer;
import com.writeoncereadmany.minstrel.runtime.values.enums.BooleanValue;
import com.writeoncereadmany.minstrel.runtime.values.enums.UnitValue;
import com.writeoncereadmany.minstrel.runtime.values.Value;
import com.writeoncereadmany.minstrel.runtime.values.functions.NotFunction;
import com.writeoncereadmany.minstrel.runtime.values.functions.PrintFunction;
import com.writeoncereadmany.minstrel.scope.Reference;
import com.writeoncereadmany.minstrel.scope.Scope;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class SystemEnvironment {

    private static final Map<Reference, Value> systemValues = new TreeMap<Reference, Value>();

    // Doesn't matter what order these are iterated over in, as long as it's consistent when iterating over keys and values
    static
    {
        systemValues.put(forName("print"), new PrintFunction(new Printer() {
            @Override
            public void println(String toPrint) {
                System.out.println(toPrint);
            }
        }));
        systemValues.put(forName("not"), NotFunction.INSTANCE);
        systemValues.put(forName("true"), BooleanValue.TRUE);
        systemValues.put(forName("false"), BooleanValue.FALSE);
        systemValues.put(forName("unit"), UnitValue.UNIT);
    }

    public static Environment createSystemEnvironment()
    {
        Environment environment = new Environment();
        for(Value value : systemValues.values())
        {
            environment.defineValue(value);
        }
        return environment;
    }

    public static Scope createSystemScope()
    {
        Scope scope = new Scope();
        for(Reference reference: systemValues.keySet())
        {
            scope.add(reference);
        }
        return scope;
    }

    private static Reference forName(String name)
    {
        return new Reference(new Type(new Name("Don't care")), new Name(name));
    }

}
