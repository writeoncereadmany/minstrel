package com.writeoncereadmany.minstrel.ast.miscellaneous;

import com.writeoncereadmany.minstrel.ast.ASTNode;

public class Name implements ASTNode {

	private final String name;

    public Name(String name)
	{
		this.name = name;
	}

    public String getName()
	{
		return name;
	}

    public boolean equals(Object o)
    {
        if(this==o) return true;
        if(!(o instanceof Name)) return false;
        Name otherName = (Name)o;
        return name.equals(otherName.name);
    }

    public int hashCode()
    {
        return name.hashCode();
    }
}
