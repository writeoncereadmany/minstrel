package com.writeoncereadmany.minstrel.ast;

public interface ASTNodeBuilder {

	public void addNode(ASTNode node);
	
	public ASTNode build();
}
