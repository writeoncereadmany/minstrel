package com.writeoncereadmany.minstrel.runtime;

import java.util.List;

import com.writeoncereadmany.minstrel.ast.Block;
import com.writeoncereadmany.minstrel.ast.Parameter;
import com.writeoncereadmany.minstrel.ast.ParameterList;

public class CustomFunction implements Function {

	private List<Parameter> parameters;
	private Block block;

	public CustomFunction(ParameterList parameterList, Block block) {
		this.parameters = parameterList.getParameters();
		this.block = block;
	}

	@Override
	public String show() {
		throw new UnsupportedOperationException();
	}

	@Override
	public Value call(Context context, List<Value> arguments) {
		context.pushScope();
		if(arguments.size() != parameters.size())
		{
			throw new IllegalArgumentException("Wrong number of arguments passed");
		}
		bind(context, arguments);
		block.execute(context);
		context.popScope();
		return context.getReturnValue();
	}
	
	private void bind(Context context, List<Value> arguments)
	{
		for(int i = 0; i < arguments.size(); i++)
		{
			context.setVariable(parameters.get(i).getName(), arguments.get(i));
		}
	}
}