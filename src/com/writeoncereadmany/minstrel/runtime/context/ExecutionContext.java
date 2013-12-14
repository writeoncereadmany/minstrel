package com.writeoncereadmany.minstrel.runtime.context;

import com.writeoncereadmany.minstrel.runtime.values.Value;

public class ExecutionContext {

    private Value returnValue;
	private String errorValue;

	public void setReturnValue(Value returnValue) {
		this.returnValue = returnValue;
	}
	
	public Value getReturnValue()
	{
		Value toReturn = this.returnValue;
		this.returnValue = null;
		return toReturn;
	}
	
	public boolean hasReturned()
	{
		return null != this.returnValue; 
	}

	public void setError(String error)
	{
		this.errorValue = error;
	}
	
	public boolean hasError() {
		return null != this.errorValue;
	}

	public String getError() {
		return this.errorValue;
	}
}
