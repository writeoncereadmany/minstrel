package com.writeoncereadmany.minstrel.ast.expressions;

import com.writeoncereadmany.minstrel.ast.ASTNode;
import com.writeoncereadmany.minstrel.ast.ASTNodeBuilder;
import com.writeoncereadmany.minstrel.ast.expressions.Variable;
import com.writeoncereadmany.minstrel.scope.Scopes;

public class VariableBuilder implements ASTNodeBuilder<Variable> {
	
	private String name;
	
	public VariableBuilder(final String name)
	{
		this.name = name;
	}

	@Override
	public void addNode(ASTNode node) {
	
	}

	@Override
	public Variable build(Scopes scopes) {
		return new Variable(name, scopes.getDeBruijnIndex(name));
	}
}
