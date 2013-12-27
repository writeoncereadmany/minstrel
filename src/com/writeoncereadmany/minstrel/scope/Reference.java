package com.writeoncereadmany.minstrel.scope;

import com.writeoncereadmany.minstrel.ast.miscellaneous.Name;
import com.writeoncereadmany.minstrel.ast.miscellaneous.TypeReference;

/**
 * Created by tom on 26/12/2013.
 */
public class Reference implements Comparable<Reference> {

    private final TypeReference type;
    private final Name name;

    public Reference(TypeReference type, Name name)
    {
        this.type = type;
        this.name = name;
    }

    public TypeReference getType() {
        return type;
    }

    @Override
    public int compareTo(Reference reference) {
        return this.name.compareTo(reference.getName());
    }

    public Name getName() { return name; }
}
