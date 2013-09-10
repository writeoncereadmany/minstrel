package com.writeoncereadmany.minstrel.runtime;


public class StringValue implements Value {
	
	private final String string;
	
	public StringValue(final String string)
	{
		this.string = string;
	}

	@Override
	public String show() {
		return string;
	}

}
