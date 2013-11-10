package com.writeoncereadmany.minstrel.ast;

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
