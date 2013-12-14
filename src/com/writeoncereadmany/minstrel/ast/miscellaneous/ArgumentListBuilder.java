package com.writeoncereadmany.minstrel.ast.miscellaneous;

import com.writeoncereadmany.minstrel.ast.ASTNode;
import com.writeoncereadmany.minstrel.ast.ASTNodeBuilder;
import com.writeoncereadmany.minstrel.ast.expressions.Expression;
import com.writeoncereadmany.minstrel.ast.miscellaneous.ArgumentList;
import com.writeoncereadmany.minstrel.scope.Scopes;

import java.util.ArrayList;
import java.util.List;

public class ArgumentListBuilder implements ASTNodeBuilder<ArgumentList> {

	private List<Expression> arguments = new ArrayList<Expression>();
	
	@Override
	public void addNode(ASTNode node) {
		arguments.add((Expression)node);
	}

	@Override
	public ArgumentList build(Scopes scopes) {
		return new ArgumentList(arguments);
	}

}
