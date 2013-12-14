package com.writeoncereadmany.minstrel.runtime.values.functions;

import com.writeoncereadmany.minstrel.runtime.context.ExecutionContext;
import com.writeoncereadmany.minstrel.runtime.environment.Environment;
import com.writeoncereadmany.minstrel.runtime.values.Value;
import com.writeoncereadmany.minstrel.runtime.values.enums.BooleanValue;

/**
 * Created by tom on 01/12/2013.
 */
public enum NotFunction implements Function {

    INSTANCE;

    @Override
    public Value call(ExecutionContext context, Environment environment) {
        BooleanValue argument = (BooleanValue)environment.getValue(0);
        return argument == BooleanValue.TRUE ? BooleanValue.FALSE : BooleanValue.TRUE;
    }

    @Override
    public String show() {
        return null;
    }
}
