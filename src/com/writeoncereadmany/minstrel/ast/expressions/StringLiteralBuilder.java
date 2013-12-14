package com.writeoncereadmany.minstrel.ast.expressions;

import com.writeoncereadmany.minstrel.ast.ASTNode;
import com.writeoncereadmany.minstrel.ast.ASTNodeBuilder;
import com.writeoncereadmany.minstrel.ast.expressions.StringLiteral;
import com.writeoncereadmany.minstrel.scope.Scopes;

public class StringLiteralBuilder implements ASTNodeBuilder<StringLiteral> {
	
	private String string;
	
	public StringLiteralBuilder(final String string)
	{
		this.string = stripQuotes(string);
	}

	@Override
	public void addNode(ASTNode node) {
		throw new UnsupportedOperationException("Can't add anything to a string literal");
	}

	@Override
	public StringLiteral build(Scopes scopes) {
		return new StringLiteral(string);
	}
	
	private String stripQuotes(final String string)
	{
		return string.substring(1, string.length() - 1);
	}

}
