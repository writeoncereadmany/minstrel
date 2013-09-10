package com.writeoncereadmany.minstrel.ast;

import java.math.BigInteger;

public class IntegerLiteralBuilder implements ASTNodeBuilder {

	private final BigInteger value;
	
	public IntegerLiteralBuilder(BigInteger value)
	{
		this.value = value;
	}
	
	@Override
	public void addNode(ASTNode node) {
		throw new UnsupportedOperationException();
	}

	@Override
	public ASTNode build() {
		return new IntegerLiteral(value);
	}

}
