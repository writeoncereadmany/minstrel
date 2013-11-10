package com.writeoncereadmany.minstrel.ast;

import java.util.List;

public class ParameterList implements ASTNode {

	private List<Parameter> parameters;
	
	public ParameterList(List<Parameter> parameters)
	{
		this.parameters = parameters;
	}
	
	public List<Parameter> getParameters()
	{
		return parameters;
	}

}
