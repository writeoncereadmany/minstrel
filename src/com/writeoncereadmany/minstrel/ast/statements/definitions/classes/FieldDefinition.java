package com.writeoncereadmany.minstrel.ast.statements.definitions.classes;

import com.writeoncereadmany.minstrel.ast.ASTNode;
import com.writeoncereadmany.minstrel.ast.miscellaneous.Name;
import com.writeoncereadmany.minstrel.ast.miscellaneous.Type;
import com.writeoncereadmany.minstrel.ast.statements.Statement;
import com.writeoncereadmany.minstrel.runtime.context.ExecutionContext;
import com.writeoncereadmany.minstrel.runtime.environment.Environments;
import com.writeoncereadmany.minstrel.runtime.values.enums.UnassignedFieldValue;

/**
 * Created by tom on 15/12/2013.
 */
public class FieldDefinition implements Statement {

    private final Type type;
    private final Name name;

    public FieldDefinition(Type type, Name name) {
        this.type = type;
        this.name = name;
    }

    @Override
    public void execute(ExecutionContext context, Environments environment) {
        environment.defineValue(UnassignedFieldValue.INSTANCE);
    }
}
