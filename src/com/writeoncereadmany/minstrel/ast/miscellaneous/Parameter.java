package com.writeoncereadmany.minstrel.ast.miscellaneous;

import com.writeoncereadmany.minstrel.ast.ASTNode;

public class Parameter implements ASTNode {

	private final TypeReference type;
	private final Name name;
	
	public Parameter(TypeReference type, Name name)
	{
		this.type = type;
		this.name = name;
	}

    public String getName()
    {
        return name.getName();
    }
	
}
