package com.writeoncereadmany.minstrel.ast.miscellaneous;

import com.writeoncereadmany.minstrel.ast.ASTNode;

public class Name implements ASTNode, Comparable<Name> {

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
        boolean areEqual = name.equals(otherName.name);
        return areEqual;
    }

    public int hashCode()
    {
        return name.hashCode();
    }

    @Override
    public int compareTo(final Name other) {
        return name.compareTo(other.getName());
    }

    public String toString()
    {
        return name;
    }
}
