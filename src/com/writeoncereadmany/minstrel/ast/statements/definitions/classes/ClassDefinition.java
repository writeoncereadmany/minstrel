package com.writeoncereadmany.minstrel.ast.statements.definitions.classes;

import com.writeoncereadmany.minstrel.ast.miscellaneous.Name;
import com.writeoncereadmany.minstrel.ast.miscellaneous.Type;
import com.writeoncereadmany.minstrel.ast.statements.Statement;
import com.writeoncereadmany.minstrel.runtime.context.ExecutionContext;
import com.writeoncereadmany.minstrel.runtime.environment.Environments;
import com.writeoncereadmany.minstrel.runtime.values.classes.Constructor;

import java.util.List;
import java.util.Map;

/**
 * Created by tom on 14/12/2013.
 */
public class ClassDefinition implements Statement {

    private Name name;
    private Type classInterface;
    private ConstructorDefinition constructor;
    private List<FieldDefinition> fields;
    private Map<String, MethodDefinition> methods;

    public ClassDefinition(Name name, Type classInterface, ConstructorDefinition constructor, List<FieldDefinition> fields, Map<String, MethodDefinition> methods) {
        this.name = name;
        this.classInterface = classInterface;
        this.constructor = constructor;
        this.fields = fields;
        this.methods = methods;
    }

    @Override
    public void execute(ExecutionContext context, Environments environment) {
        environment.defineValue(new Constructor());
    }
}
