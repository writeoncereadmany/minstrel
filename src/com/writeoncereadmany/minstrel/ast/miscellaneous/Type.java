package com.writeoncereadmany.minstrel.ast.miscellaneous;

import com.writeoncereadmany.minstrel.ast.ASTNode;

import java.util.ArrayList;
import java.util.List;

public class Type implements ASTNode {

    public static final Name UNKNOWN = new Name("Unknown");
    private final List<Modifier> modifiers;
    private final Name name;

    public Type(Name name)
    {
        this.modifiers = new ArrayList<Modifier>();
        this.name = name;
    }

    public Type(List<Modifier> modifiers, Name name)
    {
        this.modifiers = modifiers;
        this.name = name;
    }

    public boolean permitsReassignment()
    {
        for(Modifier modifier: modifiers)
        {
            if(modifier.permitsReassignment())
            {
                return true;
            }
        }
        return false;
    }

    public boolean allowsAssignmentOf(Type type) {
        return name.equals(type.getName()) || UNKNOWN.equals(type.getName());
    }

    public Name getName() {
        return name;
    }
}
