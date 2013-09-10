package com.writeoncereadmany.minstrel.ast;

import com.writeoncereadmany.minstrel.runtime.Context;

public interface Definition extends ASTNode {
	
	public void define(Context context);

}
