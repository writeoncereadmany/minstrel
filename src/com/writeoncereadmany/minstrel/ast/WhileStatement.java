package com.writeoncereadmany.minstrel.ast;

import com.writeoncereadmany.minstrel.runtime.BooleanValue;
import com.writeoncereadmany.minstrel.runtime.Context;

public class WhileStatement implements Statement {

	private Operation condition;
	private Block block;

	public WhileStatement(final Operation condition, final Block block)
	{
		this.condition = condition;
		this.block = block;
	}
	
	@Override
	public void execute(Context context) {
		while(((BooleanValue)condition.evaluate(context)).asBoolean()) {
			block.execute(context);
		}
	}

}
