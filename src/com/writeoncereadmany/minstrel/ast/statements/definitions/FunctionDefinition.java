package com.writeoncereadmany.minstrel.ast.statements.definitions;

import com.writeoncereadmany.minstrel.ast.miscellaneous.Block;
import com.writeoncereadmany.minstrel.ast.miscellaneous.Name;
import com.writeoncereadmany.minstrel.ast.miscellaneous.ParameterList;
import com.writeoncereadmany.minstrel.ast.miscellaneous.Type;
import com.writeoncereadmany.minstrel.ast.statements.Statement;
import com.writeoncereadmany.minstrel.runtime.environment.Environments;
import com.writeoncereadmany.minstrel.runtime.context.ExecutionContext;
import com.writeoncereadmany.minstrel.runtime.values.functions.CustomFunction;

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
	public void execute(ExecutionContext context, Environments environment) {
        environment.defineValue(new CustomFunction(environment, block));
	}

}
