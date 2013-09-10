package com.writeoncereadmany.minstrel.ast;

public class Parameter implements ASTNode {

	private final Type type;
	private final Name name;
	
	public Parameter(Type type, Name name)
	{
		this.type = type;
		this.name = name;
	}
	
	public String getName()
	{
		return name.getName();
	}
	
}
