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
}
