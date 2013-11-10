package com.writeoncereadmany.minstrel.scope;

import com.writeoncereadmany.minstrel.listeners.MinstrelParseException;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tom on 10/11/2013.
 */
public class Scope {
    // defined names are an ordered list:
    private final List<String> names = new ArrayList<String>();

    public void add(String name)
    {
        if(names.contains(name))
        {
            throw new MinstrelParseException("Name " + name + " already exists in this environment");
        }
        names.add(name);
    }

    public boolean contains(String name)
    {
        return names.contains(name);
    }

    public int indexOf(String name)
    {
        return names.indexOf(name);
    }
}
