package com.writeoncereadmany.minstrel.scope;

import com.writeoncereadmany.minstrel.ast.miscellaneous.Name;
import com.writeoncereadmany.minstrel.ast.miscellaneous.Type;
import com.writeoncereadmany.minstrel.listeners.exceptions.MinstrelParseException;
import com.writeoncereadmany.minstrel.listeners.exceptions.NameAlreadyExistsException;

import java.util.ArrayList;
import java.util.List;

public class Scope {

    // defined names are an ordered list:
    private final List<Reference> references = new ArrayList<Reference>();
    private List<String> names = new ArrayList<String>();

    public void add(Type type, Name name)
    {
        add(new Reference(type, name));
    }

    public void add(Reference reference)
    {
        Name name = reference.getName();
        if(names.contains(name.getName()))
        {
            throw new NameAlreadyExistsException("Name " + name + " already exists in this environment");
        }
        references.add(reference);
        names.add(name.getName());
    }

    public boolean contains(String name)
    {
        return names.contains(name);
    }

    public int indexOf(String name)
    {
        return names.indexOf(name);
    }

    public Type typeOf(String name)
    {
        return references.get(indexOf(name)).getType();
    }
}
