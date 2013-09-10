package com.writeoncereadmany.minstrel.runtime;

import java.util.List;

public interface Function extends Value {
	
	public Value call(Context context, List<Value> arguments);

}
