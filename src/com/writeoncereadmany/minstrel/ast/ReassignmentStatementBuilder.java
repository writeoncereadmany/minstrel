package com.writeoncereadmany.minstrel.ast;

import com.writeoncereadmany.minstrel.scope.Scopes;

public class ReassignmentStatementBuilder implements ASTNodeBuilder{

	private Name name;
	private Expression newValue;
	
	@Override
	public void addNode(ASTNode node) {
		if(name == null) {
			name = (Name)node;
		}
		else
		{
			newValue = (Expression)node;
		}
	}

	@Override
	public ASTNode build(Scopes scopes) {
		return new ReassignmentStatement(name, newValue);
	}

}
