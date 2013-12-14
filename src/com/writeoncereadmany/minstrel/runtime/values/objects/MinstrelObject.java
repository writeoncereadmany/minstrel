package com.writeoncereadmany.minstrel.runtime.values.objects;

import com.writeoncereadmany.minstrel.runtime.context.ExecutionContext;
import com.writeoncereadmany.minstrel.runtime.environment.Environment;
import com.writeoncereadmany.minstrel.runtime.values.Value;

/**
 * Created by tom on 01/12/2013.
 */
public interface MinstrelObject extends Value {

    Value callMethod(String methodName, ExecutionContext context, Environment methodEnvironment);
}
