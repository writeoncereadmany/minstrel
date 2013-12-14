package com.writeoncereadmany.minstrel.ast.statements;

import com.writeoncereadmany.minstrel.ast.expressions.Expression;
import com.writeoncereadmany.minstrel.ast.miscellaneous.Block;
import com.writeoncereadmany.minstrel.runtime.context.ExecutionContext;
import com.writeoncereadmany.minstrel.runtime.environment.Environment;
import com.writeoncereadmany.minstrel.runtime.environment.Environments;
import com.writeoncereadmany.minstrel.runtime.values.enums.BooleanValue;

public class WhileStatement implements Statement {

	private Expression condition;
	private Block block;

	public WhileStatement(final Expression condition, final Block block)
	{
		this.condition = condition;
		this.block = block;
	}
	
	@Override
	public void execute(ExecutionContext context, Environments environment) {
        Environments loopEnvironment = environment.childEnvironment(new Environment());
        while(((BooleanValue)condition.evaluate(context, loopEnvironment)).asBoolean()) {
            block.execute(context, loopEnvironment);
		}
	}

}
