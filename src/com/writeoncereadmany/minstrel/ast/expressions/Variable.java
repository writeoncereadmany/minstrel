package com.writeoncereadmany.minstrel.ast.expressions;

import com.writeoncereadmany.minstrel.ast.expressions.Expression;
import com.writeoncereadmany.minstrel.ast.miscellaneous.Type;
import com.writeoncereadmany.minstrel.runtime.environment.Environments;
import com.writeoncereadmany.minstrel.runtime.context.ExecutionContext;
import com.writeoncereadmany.minstrel.runtime.values.Value;
import com.writeoncereadmany.minstrel.scope.DeBruijnIndex;
import com.writeoncereadmany.minstrel.scope.Scopes;

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

    @Override
    public Type getType(Scopes scopes) {
        return scopes.typeOf(index);
    }

}
