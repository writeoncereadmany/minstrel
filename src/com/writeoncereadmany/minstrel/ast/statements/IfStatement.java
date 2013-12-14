package com.writeoncereadmany.minstrel.ast.statements;

import com.writeoncereadmany.minstrel.ast.expressions.Expression;
import com.writeoncereadmany.minstrel.ast.miscellaneous.Block;
import com.writeoncereadmany.minstrel.runtime.context.ExecutionContext;
import com.writeoncereadmany.minstrel.runtime.environment.Environment;
import com.writeoncereadmany.minstrel.runtime.environment.Environments;
import com.writeoncereadmany.minstrel.runtime.values.enums.BooleanValue;

public class IfStatement implements Statement {

	private Expression condition;
	private Block block;

	public IfStatement(final Expression condition, final Block block)
	{
		this.condition = condition;
		this.block = block;
	}
	
	@Override
	public void execute(ExecutionContext context, Environments environment) {
        Environments ifEnvironment = environment.childEnvironment(new Environment());
		BooleanValue conditionOutcome = (BooleanValue)condition.evaluate(context, ifEnvironment);
		if(conditionOutcome.asBoolean()) {
            block.execute(context, ifEnvironment);
		}
	}

}
