package com.writeoncereadmany.minstrel.ast;

import com.writeoncereadmany.minstrel.runtime.ExecutionContext;
import com.writeoncereadmany.minstrel.runtime.Value;

public interface Operator extends ASTNode {
	
	public Value apply(ExecutionContext context, Expression firstExpression, Expression secondExpression);

}
