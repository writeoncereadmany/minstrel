package com.writeoncereadmany.minstrel.ast;

import com.writeoncereadmany.minstrel.scope.Scopes;

public interface ASTNodeBuilder<T extends ASTNode> {

	public void addNode(ASTNode node);
	
	public T build(Scopes scopes);
}
