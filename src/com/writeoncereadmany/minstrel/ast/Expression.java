package com.writeoncereadmany.minstrel.ast;

import com.writeoncereadmany.minstrel.runtime.Context;
import com.writeoncereadmany.minstrel.runtime.Value;

public interface Expression extends ASTNode {

	Value evaluate(Context context);
}
