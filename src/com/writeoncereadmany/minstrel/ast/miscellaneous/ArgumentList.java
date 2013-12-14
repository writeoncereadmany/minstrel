package com.writeoncereadmany.minstrel.ast.miscellaneous;

import java.util.ArrayList;
import java.util.List;

import com.writeoncereadmany.minstrel.ast.ASTNode;
import com.writeoncereadmany.minstrel.ast.expressions.Expression;
import com.writeoncereadmany.minstrel.runtime.environment.Environments;
import com.writeoncereadmany.minstrel.runtime.context.ExecutionContext;
import com.writeoncereadmany.minstrel.runtime.values.Value;

public class ArgumentList implements ASTNode {

	private List<Expression> arguments;

    public ArgumentList(Expression... providedArguments)
    {
        this.arguments = new ArrayList<Expression>();
        for(Expression argument: providedArguments)
        {
            this.arguments.add(argument);
        }
    }

	public ArgumentList(List<Expression> arguments)
	{
		this.arguments = arguments;
	}
	
	public List<Value> evaluate(final ExecutionContext context, Environments environment) {
		List<Value> values = new ArrayList<Value>();
		for(Expression argument: arguments)
		{
			values.add(argument.evaluate(context, environment));
		}
		return values;
	}

}
