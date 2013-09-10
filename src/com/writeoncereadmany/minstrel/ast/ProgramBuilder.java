package com.writeoncereadmany.minstrel.ast;

import java.util.ArrayList;
import java.util.List;

public class ProgramBuilder implements ASTNodeBuilder {

	private List<Statement> nodes = new ArrayList<Statement>();
	
	@Override
	public void addNode(ASTNode node) {
		nodes.add((Statement)node);
	}

	@Override
	public ASTNode build() {
		return new Program(nodes);
	}

}
