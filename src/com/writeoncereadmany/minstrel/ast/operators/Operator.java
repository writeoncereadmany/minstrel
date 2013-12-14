package com.writeoncereadmany.minstrel.ast.operators;

import com.writeoncereadmany.minstrel.ast.ASTNode;
import com.writeoncereadmany.minstrel.ast.expressions.Expression;
import com.writeoncereadmany.minstrel.scope.Scopes;

public interface Operator extends ASTNode {

    Expression build(Expression firstArgument, Expression secondArgument, Scopes scopes);
}
