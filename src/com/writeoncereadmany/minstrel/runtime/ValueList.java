package com.writeoncereadmany.minstrel.runtime;

import java.util.List;

public class ValueList implements Value {

	private final List<Value> values;
	
	public ValueList(List<Value> values) {
		this.values = values;
	}

	@Override
	public String show() {
		StringBuilder toShow = new StringBuilder("[");
		for(Value value: values)
		{
			toShow.append(value.show());
			toShow.append(",");
		}
		toShow.replace(toShow.length() - 1, toShow.length(), "]");
		return toShow.toString();
	}
	
	public Value[] values() 
	{
		return values.toArray(new Value[values.size()]);
	}

}
