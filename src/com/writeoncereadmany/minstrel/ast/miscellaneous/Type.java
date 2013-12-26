package com.writeoncereadmany.minstrel.ast.miscellaneous;

import com.writeoncereadmany.minstrel.ast.ASTNode;

import java.util.List;

public class Type implements ASTNode {

    private final List<Modifier> modifiers;
    private final Name name;

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
}
