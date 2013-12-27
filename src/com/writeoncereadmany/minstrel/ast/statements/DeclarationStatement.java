package com.writeoncereadmany.minstrel.ast.statements;

import com.writeoncereadmany.minstrel.ast.miscellaneous.Name;
import com.writeoncereadmany.minstrel.ast.miscellaneous.TypeReference;
import com.writeoncereadmany.minstrel.ast.expressions.Expression;
import com.writeoncereadmany.minstrel.runtime.environment.Environments;
import com.writeoncereadmany.minstrel.runtime.context.ExecutionContext;

public class DeclarationStatement implements Statement {

	private Expression value;
	private Name name;
	private TypeReference type;
	
	public DeclarationStatement(TypeReference type, Name name, Expression value)
	{
		this.type = type;
		this.name = name;
		this.value = value;
	}
	
	@Override
	public void execute(ExecutionContext context, Environments environment) {
        environment.defineValue(value.evaluate(context, environment));
	}

}
