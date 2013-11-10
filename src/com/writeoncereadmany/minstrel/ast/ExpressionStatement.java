package com.writeoncereadmany.minstrel.ast;

import com.writeoncereadmany.minstrel.runtime.ExecutionContext;

public class ExpressionStatement implements Statement {

	private Expression expression;

	public ExpressionStatement(Expression expression) {
		this.expression = expression;
	}

	@Override
	public void execute(final ExecutionContext context) {
		expression.evaluate(context);
	}

}