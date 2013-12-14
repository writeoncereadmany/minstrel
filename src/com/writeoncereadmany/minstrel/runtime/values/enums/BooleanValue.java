package com.writeoncereadmany.minstrel.runtime.values.enums;

import com.writeoncereadmany.minstrel.runtime.values.Value;

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

    public static BooleanValue forBoolean(boolean value)
    {
        return value ? TRUE : FALSE;
    }
	
	@Override
	public String show() 
	{
		return value.toString();
	}

}
