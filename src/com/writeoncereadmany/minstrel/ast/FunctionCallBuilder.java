package com.writeoncereadmany.minstrel.ast;

public class FunctionCallBuilder implements ASTNodeBuilder {

	private Expression function;
	private ArgumentList argumentList;
	
	@Override
	public void addNode(ASTNode node) {
		if(null==function) 
		{
			function = (Expression)node;
		}
		else if(null==argumentList)
		{
			argumentList = (ArgumentList)node;
		}
		else
		{
			throw new IllegalStateException("Cannot add more nodes to this function call");
		}
	}
	@Override
	public ASTNode build() {
		return new FunctionCall(function, argumentList);
	}
	
	
}
