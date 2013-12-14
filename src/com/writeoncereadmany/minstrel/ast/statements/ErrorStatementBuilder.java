package com.writeoncereadmany.minstrel.ast.statements;

import com.writeoncereadmany.minstrel.ast.ASTNode;
import com.writeoncereadmany.minstrel.ast.ASTNodeBuilder;
import com.writeoncereadmany.minstrel.ast.miscellaneous.ArgumentList;
import com.writeoncereadmany.minstrel.scope.Scopes;

public class ErrorStatementBuilder implements ASTNodeBuilder<ErrorStatement> {

	private ArgumentList argumentList;

	@Override
	public void addNode(ASTNode node) {
		this.argumentList = (ArgumentList)node;
	}

	@Override
	public ErrorStatement build(Scopes scopes) {
		return new ErrorStatement(argumentList);
	}
}
