package com.writeoncereadmany.minstrel.ast.statements;

import com.writeoncereadmany.minstrel.ast.miscellaneous.Name;
import com.writeoncereadmany.minstrel.ast.expressions.Expression;
import com.writeoncereadmany.minstrel.listeners.exceptions.MinstrelParseException;
import com.writeoncereadmany.minstrel.runtime.environment.Environments;
import com.writeoncereadmany.minstrel.runtime.context.ExecutionContext;
import com.writeoncereadmany.minstrel.scope.DeBruijnIndex;

public class ReassignmentStatement implements Statement {

	private final Name name;
    private final DeBruijnIndex index;
	private final Expression newValue;
	
	public ReassignmentStatement(Name name, DeBruijnIndex index, Expression newValue)
	{
		this.name = name;
        this.index = index;
        this.newValue = newValue;
        if(index.getDepth() == -1)
        {
            throw new MinstrelParseException("Cannot reassign to names in the system scope");
        }
	}
	
	@Override
	public void execute(ExecutionContext context, Environments environment) {
        environment.reassignValue(index, newValue.evaluate(context, environment));
	}

}
