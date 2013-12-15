package com.writeoncereadmany.minstrel.runtime.values.enums;

import com.writeoncereadmany.minstrel.runtime.values.Value;

/**
 * Created by tom on 15/12/2013.
 */
public enum UnassignedFieldValue implements Value {

    INSTANCE;

    @Override
    public String show() {
        throw new UnsupportedOperationException("Can't do anything with an unassigned field. Big ol' syntax error!");
    };
}
