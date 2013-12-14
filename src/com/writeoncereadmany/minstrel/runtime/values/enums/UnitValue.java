package com.writeoncereadmany.minstrel.runtime.values.enums;


import com.writeoncereadmany.minstrel.runtime.values.Value;

public enum UnitValue implements Value {

	UNIT;

	@Override
	public String show() {
		return "unit";
	}
}
