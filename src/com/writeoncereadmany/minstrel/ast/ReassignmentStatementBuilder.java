package com.writeoncereadmany.minstrel.ast;

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
	public ASTNode build() {
		return new ReassignmentStatement(name, newValue);
	}

}
