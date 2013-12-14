package com.writeoncereadmany.minstrel.ast.statements;

import com.writeoncereadmany.minstrel.ast.ASTNode;
import com.writeoncereadmany.minstrel.ast.ASTNodeBuilder;
import com.writeoncereadmany.minstrel.ast.miscellaneous.Name;
import com.writeoncereadmany.minstrel.ast.expressions.Expression;
import com.writeoncereadmany.minstrel.scope.Scopes;

public class ReassignmentStatementBuilder implements ASTNodeBuilder<ReassignmentStatement> {

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
	public ReassignmentStatement build(Scopes scopes) {
		return new ReassignmentStatement(name, scopes.getDeBruijnIndex(name.getName()), newValue);
	}

}
