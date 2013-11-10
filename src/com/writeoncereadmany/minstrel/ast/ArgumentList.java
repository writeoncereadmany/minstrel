package com.writeoncereadmany.minstrel.ast;

import java.util.ArrayList;
import java.util.List;

import com.writeoncereadmany.minstrel.runtime.ExecutionContext;
import com.writeoncereadmany.minstrel.runtime.Value;

public class ArgumentList implements ASTNode {

	private List<Expression> arguments;
	
	public ArgumentList(List<Expression> arguments)
	{
		this.arguments = arguments;
	}
	
	public List<Value> evaluate(final ExecutionContext context) {
		List<Value> values = new ArrayList<Value>();
		for(Expression argument: arguments)
		{
			values.add(argument.evaluate(context));
		}
		return values;
	}

}
