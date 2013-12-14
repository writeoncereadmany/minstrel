package com.writeoncereadmany.minstrel.ast.expressions;

import com.writeoncereadmany.minstrel.ast.ASTNode;
import com.writeoncereadmany.minstrel.ast.ASTNodeBuilder;
import com.writeoncereadmany.minstrel.ast.miscellaneous.ArgumentList;
import com.writeoncereadmany.minstrel.scope.Scopes;

public class FunctionCallBuilder implements ASTNodeBuilder<FunctionCall> {

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
	public FunctionCall build(Scopes scopes) {
		return new FunctionCall(function, argumentList);
	}
	
	
}
