package com.writeoncereadmany.minstrel.ast;


import com.writeoncereadmany.minstrel.runtime.ExecutionContext;
import com.writeoncereadmany.minstrel.runtime.StringValue;
import com.writeoncereadmany.minstrel.runtime.Value;

public class StringLiteral implements Expression {
	
	private String string;
	
	public StringLiteral(final String string)
	{
		this.string = string;
	}

	@Override
	public Value evaluate(final ExecutionContext context) {
		return new StringValue(string);
	}

}
