package com.writeoncereadmany.minstrel.ast.statements.definitions;

import com.writeoncereadmany.minstrel.ast.miscellaneous.Name;
import com.writeoncereadmany.minstrel.ast.miscellaneous.Type;
import com.writeoncereadmany.minstrel.ast.statements.Statement;
import com.writeoncereadmany.minstrel.runtime.context.ExecutionContext;
import com.writeoncereadmany.minstrel.runtime.environment.Environments;
import com.writeoncereadmany.minstrel.runtime.values.classes.Constructor;

/**
 * Created by tom on 14/12/2013.
 */
public class ClassDefinition implements Statement {

    private Name name;
    private Type classInterface;

    public ClassDefinition(Name name, Type classInterface) {
        this.name = name;
        this.classInterface = classInterface;
    }

    @Override
    public void execute(ExecutionContext context, Environments environment) {
        environment.defineValue(new Constructor());
    }
}
