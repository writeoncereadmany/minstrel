package com.writeoncereadmany.minstrel.ast;

public class TypeBuilder implements ASTNodeBuilder {

	@Override
	public void addNode(ASTNode node) {	}

	@Override
	public ASTNode build() {
		return new Type();
	}

}
