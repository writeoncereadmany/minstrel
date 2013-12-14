package com.writeoncereadmany.minstrel.ast.miscellaneous;

import com.writeoncereadmany.minstrel.ast.ASTNode;
import com.writeoncereadmany.minstrel.ast.miscellaneous.Parameter;

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
