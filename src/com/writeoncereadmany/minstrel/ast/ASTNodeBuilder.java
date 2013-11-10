package com.writeoncereadmany.minstrel.ast;

import com.writeoncereadmany.minstrel.scope.Scopes;

public interface ASTNodeBuilder {

	public void addNode(ASTNode node);
	
	public ASTNode build(Scopes scopes);
}
