package com.writeoncereadmany.minstrel.ast;

import com.writeoncereadmany.minstrel.runtime.ExecutionContext;

public class FunctionInterface implements Statement {

	private Name name;
	private ParameterList parameterList;
	private Type returnType;

	public FunctionInterface(Name name, ParameterList parameterList, Type returnType) {
				this.name = name;
				this.parameterList = parameterList;
				this.returnType = returnType;
	}

	@Override
	public void execute(ExecutionContext context) {
		// no need to do anything quite yet!
	}

}
