package com.writeoncereadmany.minstrel.ast.expressions;

import com.writeoncereadmany.minstrel.ast.ASTNode;
import com.writeoncereadmany.minstrel.ast.ASTNodeBuilder;
import com.writeoncereadmany.minstrel.ast.operators.Operator;
import com.writeoncereadmany.minstrel.scope.Scopes;

public class OperationBuilder implements ASTNodeBuilder<Expression> {

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
	public Expression build(Scopes scopes) {
        return operator.build(firstArgument, secondArgument, scopes);
	}
}
