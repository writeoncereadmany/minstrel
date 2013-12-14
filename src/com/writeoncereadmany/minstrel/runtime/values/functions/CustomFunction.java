package com.writeoncereadmany.minstrel.runtime.values.functions;

import com.writeoncereadmany.minstrel.ast.miscellaneous.Block;
import com.writeoncereadmany.minstrel.runtime.context.ExecutionContext;
import com.writeoncereadmany.minstrel.runtime.environment.Environment;
import com.writeoncereadmany.minstrel.runtime.environment.Environments;
import com.writeoncereadmany.minstrel.runtime.values.Value;

public class CustomFunction implements Function {

    private Environments boundEnvironments;
	private Block block;

	public CustomFunction(Environments boundEnvironments, Block block) {
        this.boundEnvironments = boundEnvironments;
		this.block = block;
	}

	@Override
	public Value call(ExecutionContext context, Environment functionEnvironment) {
		block.execute(context, boundEnvironments.childEnvironment(functionEnvironment));
		return context.getReturnValue();
	}

    @Override
    public String show() {
        throw new UnsupportedOperationException();
    }

}