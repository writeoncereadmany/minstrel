package com.writeoncereadmany.minstrel.ast;

import com.writeoncereadmany.minstrel.scope.Scopes;

public class ReturnStatementBuilder implements ASTNodeBuilder {

	Expression value;
	
	@Override
	public void addNode(ASTNode node) {
		value = (Expression)node;
	}

	@Override
	public ASTNode build(Scopes scopes) {
		return new ReturnStatement(value);
	}

}
