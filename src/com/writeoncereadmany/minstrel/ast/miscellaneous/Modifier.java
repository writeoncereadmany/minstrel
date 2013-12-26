package com.writeoncereadmany.minstrel.ast.miscellaneous;

import com.writeoncereadmany.minstrel.ast.ASTNode;

public class Modifier implements ASTNode
{
    private Name name;

    public Modifier(Name name)
    {
        this.name = name;
    }

    public Name getName()
    {
        return name;
    }

    public boolean permitsReassignment()
    {
        return name.getName().equals("variable");
    }
}
