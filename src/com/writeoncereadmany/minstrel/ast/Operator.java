package com.writeoncereadmany.minstrel.ast;

import com.writeoncereadmany.minstrel.runtime.Context;
import com.writeoncereadmany.minstrel.runtime.Value;

public interface Operator extends ASTNode {
	
	public Value apply(Context context, Expression firstExpression, Expression secondExpression);

}
