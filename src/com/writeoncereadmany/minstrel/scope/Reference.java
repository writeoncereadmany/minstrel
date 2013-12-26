package com.writeoncereadmany.minstrel.scope;

import com.writeoncereadmany.minstrel.ast.miscellaneous.Name;
import com.writeoncereadmany.minstrel.ast.miscellaneous.Type;

/**
 * Created by tom on 26/12/2013.
 */
public class Reference implements Comparable<Reference> {

    private final Type type;
    private final Name name;

    public Reference(Type type, Name name)
    {
        this.type = type;
        this.name = name;
    }

    public Type getType() {
        return type;
    }

    @Override
    public int compareTo(Reference reference) {
        return this.name.compareTo(reference.getName());
    }

    public Name getName() { return name; }
}
