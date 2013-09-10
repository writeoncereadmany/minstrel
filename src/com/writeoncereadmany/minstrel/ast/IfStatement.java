package com.writeoncereadmany.minstrel.ast;

import com.writeoncereadmany.minstrel.runtime.BooleanValue;
import com.writeoncereadmany.minstrel.runtime.Context;

public class IfStatement implements Statement {

	private Operation condition;
	private Block block;

	public IfStatement(final Operation condition, final Block block)
	{
		this.condition = condition;
		this.block = block;
	}
	
	@Override
	public void execute(Context context) {
		BooleanValue conditionOutcome = (BooleanValue)condition.evaluate(context);
		if(conditionOutcome.asBoolean()) {
			block.execute(context);
		}
	}

}
