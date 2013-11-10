package com.writeoncereadmany.minstrel.ast;

import com.writeoncereadmany.minstrel.scope.Scopes;

public class OperationBuilder implements ASTNodeBuilder {

	private Expression firstArgument;
	private Operator operator;
	private Expression secondArgument;
	
	@Override
	public void addNode(ASTNode node) {
		if(null == firstArgument)
		{
			firstArgument = (Expression)node;
		}
		else if(null == operator)
		{
			operator = (Operator)node;
		}
		else
		{
			secondArgument = (Expression)node;
		}
	}

	@Override
	public ASTNode build(Scopes scopes) {
		return new Operation(firstArgument, operator, secondArgument);
	}
}
