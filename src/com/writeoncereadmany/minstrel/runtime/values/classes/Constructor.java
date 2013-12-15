package com.writeoncereadmany.minstrel.runtime.values.classes;

import com.writeoncereadmany.minstrel.runtime.context.ExecutionContext;
import com.writeoncereadmany.minstrel.runtime.environment.Environment;
import com.writeoncereadmany.minstrel.runtime.values.Value;
import com.writeoncereadmany.minstrel.runtime.values.functions.Function;

/**
 * Created by tom on 14/12/2013.
 */
public class Constructor implements Function {
    @Override
    public Value call(ExecutionContext context, Environment environment) {
        return null;
    }

    @Override
    public String show() {
        throw new UnsupportedOperationException();
    }
}
