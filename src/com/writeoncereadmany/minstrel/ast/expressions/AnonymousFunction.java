package com.writeoncereadmany.minstrel.ast.expressions;

import com.writeoncereadmany.minstrel.ast.miscellaneous.Block;
import com.writeoncereadmany.minstrel.ast.miscellaneous.ParameterList;
import com.writeoncereadmany.minstrel.ast.miscellaneous.Type;
import com.writeoncereadmany.minstrel.runtime.environment.Environments;
import com.writeoncereadmany.minstrel.runtime.context.ExecutionContext;
import com.writeoncereadmany.minstrel.runtime.values.functions.CustomFunction;
import com.writeoncereadmany.minstrel.runtime.values.Value;

public class AnonymousFunction implements Expression {

	private ParameterList parameterList;
	private Block block;
	
	public AnonymousFunction(ParameterList parameterList, Type type, Block block) {
		this.parameterList = parameterList;
		this.block = block;
	}

	@Override
	public Value evaluate(ExecutionContext context, Environments environment) {
		return new CustomFunction(environment, block);
	}

}
