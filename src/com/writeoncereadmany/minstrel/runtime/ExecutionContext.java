package com.writeoncereadmany.minstrel.runtime;

import java.util.Stack;

import com.writeoncereadmany.minstrel.listeners.MinstrelParseException;

public class ExecutionContext {

	private Environment systemEnvironment = new Environment();
	private Stack<Environment> environments = new Stack<Environment>();
	private Value returnValue;
	private String errorValue;
	
	public ExecutionContext(Environment systemEnvironment)
	{
		this.systemEnvironment = systemEnvironment;
		pushScope();
	}
	
	public void pushScope()
	{
		environments.push(new Environment());
	}
	
	public void popScope()
	{
		environments.pop();
	}
	
	public Value getVariable(String name) {
		for(int i = environments.size() - 1; i >= 0; i--)
		{
			Value value = environments.get(i).getVariable(name);
			if(null != value)
			{
				return value;
			}
		}
		Value value = systemEnvironment.getVariable(name);
		if(null != value)
		{
			return value;
		}
		throw new IllegalStateException("Variable " + name + " not bound");
	}
	
	public void setVariable(String name, Value value)
	{
		if(systemEnvironment.containsName(name))
		{
			throw new MinstrelParseException("Name " + name + " bound as a systeme name: cannot be rebound.");
		}
		environments.peek().setVariable(name, value);
	}
	
	public void updateVariable(String name, Value value)
	{
		if(systemEnvironment.containsName(name))
		{
			throw new MinstrelParseException("Name " + name + " bound as a systeme name: cannot be rebound.");
		}
		environments.peek().updateVariable(name, value);
	}

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
