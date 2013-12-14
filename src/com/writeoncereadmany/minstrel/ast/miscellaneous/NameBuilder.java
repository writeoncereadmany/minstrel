package com.writeoncereadmany.minstrel.ast.miscellaneous;

import com.writeoncereadmany.minstrel.ast.ASTNode;
import com.writeoncereadmany.minstrel.ast.ASTNodeBuilder;
import com.writeoncereadmany.minstrel.ast.miscellaneous.Name;
import com.writeoncereadmany.minstrel.scope.Scopes;

public class NameBuilder implements ASTNodeBuilder<Name> {

	private final String name;
	
	public NameBuilder(final String name)
	{
		this.name = name;
	}
	
	@Override
	public void addNode(ASTNode node) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Name build(Scopes scopes) {
		return new Name(name);
	}
}
