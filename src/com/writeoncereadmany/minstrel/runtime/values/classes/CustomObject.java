package com.writeoncereadmany.minstrel.runtime.values.classes;

import com.writeoncereadmany.minstrel.ast.miscellaneous.Block;
import com.writeoncereadmany.minstrel.ast.statements.definitions.classes.MethodDefinition;
import com.writeoncereadmany.minstrel.runtime.context.ExecutionContext;
import com.writeoncereadmany.minstrel.runtime.environment.Environment;
import com.writeoncereadmany.minstrel.runtime.environment.Environments;
import com.writeoncereadmany.minstrel.runtime.values.Value;
import com.writeoncereadmany.minstrel.runtime.values.objects.MinstrelObject;

import java.util.Map;

/**
 * Created by tom on 15/12/2013.
 */
public class CustomObject implements MinstrelObject {

    private final Environments objectEnvironments;
    private final Map<String, MethodDefinition> methods;

    public CustomObject(Environments objectEnvironments, Map<String, MethodDefinition> methods) {
        this.objectEnvironments = objectEnvironments;
        this.methods = methods;
    }

    @Override
    public Value callMethod(String methodName, ExecutionContext context, Environment methodEnvironment) {
        final Block methodBody = methods.get(methodName).getBody();
        methodBody.execute(context, objectEnvironments.childEnvironment(methodEnvironment));
        return context.getReturnValue();
    }

    @Override
    public String show() {
        return null;
    }
}
