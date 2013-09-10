package com.writeoncereadmany.minstrel.runtime;

import java.util.HashMap;
import java.util.Map;

import com.writeoncereadmany.minstrel.listeners.MinstrelParseException;

public class Scope {
	
	private Map<String, Value> boundVariables = new HashMap<String, Value>();

	public Value getVariable(String name) {
		return boundVariables.get(name);
	}
	
	public void setVariable(String name, Value value)
	{
		if(boundVariables.containsKey(name))
		{
			throw new MinstrelParseException("Variable name " + name + " has already been declared");
		}
		boundVariables.put(name, value);
	}
	
	public void updateVariable(String name, Value value)
	{
		if(!boundVariables.containsKey(name))
		{
			throw new MinstrelParseException("Variable name " + name + " does not exist");
		}
		boundVariables.put(name, value);
	}

	public boolean containsName(String name) {
		return boundVariables.containsKey(name);
	}

}
