package com.writeoncereadmany.minstrel.ast;

import com.writeoncereadmany.minstrel.scope.Scopes;

public class ErrorStatementBuilder implements ASTNodeBuilder {

	private ArgumentList argumentList;

	@Override
	public void addNode(ASTNode node) {
		this.argumentList = (ArgumentList)node;
	}

	@Override
	public ASTNode build(Scopes scopes) {
		return new ErrorStatement(argumentList);
	}
}
