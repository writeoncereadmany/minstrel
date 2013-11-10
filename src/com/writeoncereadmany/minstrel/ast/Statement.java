package com.writeoncereadmany.minstrel.ast;

import com.writeoncereadmany.minstrel.runtime.ExecutionContext;

public interface Statement extends ASTNode {

	void execute(ExecutionContext context);
}
