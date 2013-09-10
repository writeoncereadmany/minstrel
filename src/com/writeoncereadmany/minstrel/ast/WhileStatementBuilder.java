package com.writeoncereadmany.minstrel.ast;

public class WhileStatementBuilder implements ASTNodeBuilder {

	Operation condition;
	Block block;
	
	@Override
	public void addNode(ASTNode node) {
		if(null == condition)
		{
			condition = (Operation)node;
		}
		else
		{
			block = (Block)node;
		}
	}

	@Override
	public ASTNode build() {
		return new WhileStatement(condition, block);
	}

}
