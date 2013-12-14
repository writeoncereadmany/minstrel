package com.writeoncereadmany.minstrel.ast.statements;

import com.writeoncereadmany.minstrel.ast.ASTNode;
import com.writeoncereadmany.minstrel.ast.ASTNodeBuilder;
import com.writeoncereadmany.minstrel.ast.expressions.Expression;
import com.writeoncereadmany.minstrel.ast.statements.ReturnStatement;
import com.writeoncereadmany.minstrel.scope.Scopes;

public class ReturnStatementBuilder implements ASTNodeBuilder<ReturnStatement> {

	Expression value;
	
	@Override
	public void addNode(ASTNode node) {
		value = (Expression)node;
	}

	@Override
	public ReturnStatement build(Scopes scopes) {
		return new ReturnStatement(value);
	}

}
