package com.writeoncereadmany.minstrel.runtime;

public class BooleanValue implements Value {

	private final Boolean value;
	
	public final static BooleanValue TRUE = new BooleanValue(true);
	public final static BooleanValue FALSE = new BooleanValue(false);
	
	private BooleanValue(Boolean value)
	{
		this.value = value;
	}
	
	public boolean asBoolean() {
		return value;
	}
	
	@Override
	public String show() 
	{
		return value.toString();
	}

}
