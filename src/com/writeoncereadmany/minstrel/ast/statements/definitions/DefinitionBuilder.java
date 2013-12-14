package com.writeoncereadmany.minstrel.ast.statements.definitions;

import com.writeoncereadmany.minstrel.ast.ASTNode;
import com.writeoncereadmany.minstrel.ast.ASTNodeBuilder;
import com.writeoncereadmany.minstrel.ast.statements.Statement;
import com.writeoncereadmany.minstrel.scope.Scopes;

public class DefinitionBuilder implements ASTNodeBuilder<Statement> {

	private Statement statement;

	@Override
	public void addNode(ASTNode node) {
		this.statement = (Statement)node;
	}

	@Override
	public Statement build(Scopes scopes) {
		return statement;
	}
	
}
