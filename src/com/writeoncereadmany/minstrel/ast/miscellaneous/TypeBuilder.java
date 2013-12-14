package com.writeoncereadmany.minstrel.ast.miscellaneous;

import com.writeoncereadmany.minstrel.ast.ASTNode;
import com.writeoncereadmany.minstrel.ast.ASTNodeBuilder;
import com.writeoncereadmany.minstrel.ast.miscellaneous.Type;
import com.writeoncereadmany.minstrel.scope.Scopes;

public class TypeBuilder implements ASTNodeBuilder<Type> {

	@Override
	public void addNode(ASTNode node) {	}

	@Override
	public Type build(Scopes scopes) {
		return new Type();
	}

}
