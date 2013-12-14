package com.writeoncereadmany.minstrel.ast.miscellaneous;

import com.writeoncereadmany.minstrel.ast.ASTNode;
import com.writeoncereadmany.minstrel.ast.ASTNodeBuilder;
import com.writeoncereadmany.minstrel.ast.statements.Statement;
import com.writeoncereadmany.minstrel.scope.Scopes;

import java.util.List;
import java.util.ArrayList;

public class BlockBuilder implements ASTNodeBuilder<Block> {

	private final List<Statement> statements = new ArrayList<Statement>();
	
	@Override
	public void addNode(ASTNode node) {
		statements.add((Statement)node);
	}

	@Override
	public Block build(Scopes scopes) {
		return new Block(statements);
	}

}
