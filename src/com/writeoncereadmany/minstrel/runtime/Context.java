package com.writeoncereadmany.minstrel.runtime;

import java.util.Stack;

import com.writeoncereadmany.minstrel.listeners.MinstrelParseException;

public class Context {

	private Scope systemScope = new Scope();
	private Stack<Scope> scopes = new Stack<Scope>();
	private Value returnValue;
	
	public Context(Scope systemScope)
	{
		this.systemScope = systemScope;
		pushScope();
	}
	
	public void pushScope()
	{
		scopes.push(new Scope());
	}
	
	public void popScope()
	{
		scopes.pop();
	}
	
	public Value getVariable(String name) {
		for(int i = scopes.size() - 1; i >= 0; i--)
		{
			Value value = scopes.get(i).getVariable(name);
			if(null != value)
			{
				return value;
			}
		}
		Value value = systemScope.getVariable(name);
		if(null != value)
		{
			return value;
		}
		throw new IllegalStateException("Variable " + name + " not bound");
	}
	
	public void setVariable(String name, Value value)
	{
		if(systemScope.containsName(name)) 
		{
			throw new MinstrelParseException("Name " + name + " bound as a systeme name: cannot be rebound.");
		}
		scopes.peek().setVariable(name, value);
	}
	
	public void updateVariable(String name, Value value)
	{
		if(systemScope.containsName(name)) 
		{
			throw new MinstrelParseException("Name " + name + " bound as a systeme name: cannot be rebound.");
		}
		scopes.peek().updateVariable(name, value);
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
}
