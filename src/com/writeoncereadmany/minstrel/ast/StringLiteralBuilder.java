package com.writeoncereadmany.minstrel.ast;

import com.writeoncereadmany.minstrel.scope.Scopes;

public class StringLiteralBuilder implements ASTNodeBuilder {
	
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
	public ASTNode build(Scopes scopes) {
		return new StringLiteral(string);
	}
	
	private String stripQuotes(final String string)
	{
		return string.substring(1, string.length() - 1);
	}

}
