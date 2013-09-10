package com.writeoncereadmany.minstrel.runtime;


public enum UnitValue implements Value {

	UNIT;

	@Override
	public String show() {
		return "unit";
	}
}
