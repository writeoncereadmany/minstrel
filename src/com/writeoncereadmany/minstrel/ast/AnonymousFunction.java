package com.writeoncereadmany.minstrel.ast;

import com.writeoncereadmany.minstrel.runtime.ExecutionContext;
import com.writeoncereadmany.minstrel.runtime.CustomFunction;
import com.writeoncereadmany.minstrel.runtime.Value;

public class AnonymousFunction implements Expression {

	private ParameterList parameterList;
	private Block block;
	
	public AnonymousFunction(ParameterList parameterList, Type type, Block block) {
		this.parameterList = parameterList;
		this.block = block;
	}

	@Override
	public Value evaluate(ExecutionContext context) {
		return new CustomFunction(parameterList, block);
	}

}
