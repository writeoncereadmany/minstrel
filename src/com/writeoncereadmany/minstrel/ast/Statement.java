package com.writeoncereadmany.minstrel.ast;

import com.writeoncereadmany.minstrel.runtime.Context;

public interface Statement extends ASTNode {

	void execute(Context context);
}
