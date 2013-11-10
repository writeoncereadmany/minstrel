package com.writeoncereadmany.minstrel.ast;

import com.writeoncereadmany.minstrel.scope.Scopes;

public class TypeBuilder implements ASTNodeBuilder {

	@Override
	public void addNode(ASTNode node) {	}

	@Override
	public ASTNode build(Scopes scopes) {
		return new Type();
	}

}
