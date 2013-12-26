package com.writeoncereadmany.minstrel.runtime.values.classes;

import com.writeoncereadmany.minstrel.ast.statements.Statement;
import com.writeoncereadmany.minstrel.ast.statements.definitions.classes.ConstructorDefinition;
import com.writeoncereadmany.minstrel.ast.statements.definitions.classes.MethodDefinition;
import com.writeoncereadmany.minstrel.runtime.context.ExecutionContext;
import com.writeoncereadmany.minstrel.runtime.environment.Environment;
import com.writeoncereadmany.minstrel.runtime.environment.Environments;
import com.writeoncereadmany.minstrel.runtime.values.Value;
import com.writeoncereadmany.minstrel.runtime.values.functions.Function;

import java.util.List;
import java.util.Map;

/**
 * Created by tom on 14/12/2013.
 */
public class Constructor implements Function {

    private final Environments boundEnvironments;
    private final ConstructorDefinition constructor;
    private final List<Statement> statements;
    private final Map<String, MethodDefinition> methods;

    public Constructor(Environments environments, ConstructorDefinition constructor, List<Statement> statements, Map<String, MethodDefinition> methods) {
        this.boundEnvironments = environments;
        this.constructor = constructor;
        this.statements = statements;
        this.methods = methods;
    }

    @Override
    public Value call(ExecutionContext context, Environment environment) {
        Environment objectEnvironment = new Environment();
        Environments objectEnvironments = boundEnvironments.childEnvironment(objectEnvironment);
        for(Statement field: statements)
        {
            field.execute(context, objectEnvironments);
        }
        Environments constructorEnvironment = objectEnvironments.childEnvironment(environment);
        constructor.getBlock().execute(context, constructorEnvironment);
        return new CustomObject(objectEnvironments, methods);
    }

    @Override
    public String show() {
        throw new UnsupportedOperationException();
    }
}
