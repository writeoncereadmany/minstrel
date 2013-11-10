package com.writeoncereadmany.minstrel.ast;

import com.writeoncereadmany.minstrel.runtime.ExecutionContext;
import com.writeoncereadmany.minstrel.runtime.Value;

public interface Expression extends ASTNode {

	Value evaluate(ExecutionContext context);
}
