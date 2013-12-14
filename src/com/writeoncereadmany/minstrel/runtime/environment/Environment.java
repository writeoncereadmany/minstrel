package com.writeoncereadmany.minstrel.runtime.environment;

import com.writeoncereadmany.minstrel.runtime.values.Value;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tom on 23/11/2013.
 */
public class Environment {

    private List<Value> values = new ArrayList<Value>();

    public Environment()
    {
        values = new ArrayList<Value>();
    }

    public Environment(List<Value> values)
    {
        this.values = values;
    }

    public void defineValue(Value value)
    {
        values.add(value);
    }

    public void reassignValue(int index, Value value)
    {
        if(values.size() <= index)
        {
            throw new IllegalArgumentException("Value with index " + index + " has not yet been defined");
        }
        values.set(index, value);
    }

    public Value getValue(int index)
    {
        return values.get(index);
    }
}
