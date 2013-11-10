package com.writeoncereadmany.minstrel.ast;

import com.writeoncereadmany.minstrel.runtime.ExecutionContext;

public interface Definition extends ASTNode {
	
	public void define(ExecutionContext context);

}
