package com.writeoncereadmany.minstrel.ast;

import com.writeoncereadmany.minstrel.scope.Scopes;

import java.util.List;
import java.util.ArrayList;

public class BlockBuilder implements ASTNodeBuilder {

	private final List<Statement> statements = new ArrayList<Statement>();
	
	@Override
	public void addNode(ASTNode node) {
		statements.add((Statement)node);
	}

	@Override
	public ASTNode build(Scopes scopes) {
		return new Block(statements);
	}

}
