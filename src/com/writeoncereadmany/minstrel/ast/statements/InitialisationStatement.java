package com.writeoncereadmany.minstrel.ast.statements;

import com.writeoncereadmany.minstrel.ast.expressions.Expression;
import com.writeoncereadmany.minstrel.runtime.context.ExecutionContext;
import com.writeoncereadmany.minstrel.runtime.environment.Environments;
import com.writeoncereadmany.minstrel.scope.DeBruijnIndex;

public class InitialisationStatement implements Statement {

	private Expression value;
	private DeBruijnIndex index;

	public InitialisationStatement(DeBruijnIndex index, Expression value)
	{
        this.index = index;
        this.value = value;
	}
	
	@Override
	public void execute(ExecutionContext context, Environments environment) {
        environment.reassignValue(index, value.evaluate(context, environment));
	}

}
