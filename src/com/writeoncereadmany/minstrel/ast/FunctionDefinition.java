package com.writeoncereadmany.minstrel.ast;

import com.writeoncereadmany.minstrel.runtime.ExecutionContext;
import com.writeoncereadmany.minstrel.runtime.CustomFunction;

public class FunctionDefinition implements Statement {

	private Name name;
	private ParameterList parameterList;
	private Type returnType;
	private Block block;

	public FunctionDefinition(Name name, ParameterList parameterList, Type returnType, Block functionBlock) {
		this.name = name;
		this.parameterList = parameterList;
		this.returnType = returnType;
		this.block = functionBlock;
	}

	@Override
	public void execute(ExecutionContext context) {
		context.setVariable(name.getName(), new CustomFunction(parameterList, block));
	}

}
