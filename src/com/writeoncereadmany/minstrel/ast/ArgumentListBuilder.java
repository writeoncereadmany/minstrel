package com.writeoncereadmany.minstrel.ast;

import com.writeoncereadmany.minstrel.scope.Scopes;

import java.util.ArrayList;
import java.util.List;

public class ArgumentListBuilder implements ASTNodeBuilder {

	private List<Expression> arguments = new ArrayList<Expression>();
	
	@Override
	public void addNode(ASTNode node) {
		arguments.add((Expression)node);
	}

	@Override
	public ASTNode build(Scopes scopes) {
		return new ArgumentList(arguments);
	}

}
