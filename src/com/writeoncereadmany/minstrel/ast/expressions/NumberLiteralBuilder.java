package com.writeoncereadmany.minstrel.ast.expressions;

import com.writeoncereadmany.minstrel.ast.ASTNode;
import com.writeoncereadmany.minstrel.ast.ASTNodeBuilder;
import com.writeoncereadmany.minstrel.ast.expressions.NumberLiteral;
import com.writeoncereadmany.minstrel.runtime.numbers.Rational;
import com.writeoncereadmany.minstrel.scope.Scopes;

public class NumberLiteralBuilder implements ASTNodeBuilder<NumberLiteral> {

	private final Rational value;
	
	public NumberLiteralBuilder(String value)
	{
		this.value = Rational.parseRational(value);
	}
	
	@Override
	public void addNode(ASTNode node) {
		throw new UnsupportedOperationException();
	}

	@Override
	public NumberLiteral build(Scopes scopes) {
		return new NumberLiteral(value);
	}
}
