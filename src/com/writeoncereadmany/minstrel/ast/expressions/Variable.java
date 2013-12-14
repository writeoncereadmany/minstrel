package com.writeoncereadmany.minstrel.ast.expressions;

import com.writeoncereadmany.minstrel.ast.expressions.Expression;
import com.writeoncereadmany.minstrel.runtime.environment.Environments;
import com.writeoncereadmany.minstrel.runtime.context.ExecutionContext;
import com.writeoncereadmany.minstrel.runtime.values.Value;
import com.writeoncereadmany.minstrel.scope.DeBruijnIndex;

public class Variable implements Expression {

	private final String name;
    private final DeBruijnIndex index;
	
	public Variable(String name, DeBruijnIndex index)
	{
		this.name = name;
        this.index = index;
	}

	@Override
	public Value evaluate(final ExecutionContext context, Environments environment) {
		return environment.getValue(index);
	}

}
