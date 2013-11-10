package com.writeoncereadmany.minstrel.runtime;

import java.math.BigInteger;

public class IntegerValue implements Value {

	private final BigInteger integer;
	
	public IntegerValue(BigInteger integer)
	{
		this.integer = integer;
	}
	
	public BigInteger getInteger()
	{
		return integer;
	}
	
	@Override
	public String show() {
		return integer.toString();
	} 

}
