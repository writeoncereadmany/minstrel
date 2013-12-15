package com.writeoncereadmany.minstrel.ast.statements;

import com.writeoncereadmany.minstrel.ast.ASTNode;
import com.writeoncereadmany.minstrel.ast.ASTNodeBuilder;
import com.writeoncereadmany.minstrel.ast.expressions.Expression;
import com.writeoncereadmany.minstrel.ast.miscellaneous.Name;
import com.writeoncereadmany.minstrel.scope.Scopes;

public class InitialisationStatementBuilder implements ASTNodeBuilder<InitialisationStatement> {

	private Name name;
	private Expression value;
	
	@Override
	public void addNode(ASTNode node) {
		if (null == name)
		{
			name = (Name)node;
		} 
		else 
		{
			value = (Expression)node;
		}
	}

	@Override
	public InitialisationStatement build(Scopes scopes) {
		return new InitialisationStatement(scopes.getDeBruijnIndex(name.getName()), value);
	}

}
