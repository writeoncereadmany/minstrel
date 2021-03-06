package com.writeoncereadmany.minstrel.ast.statements.definitions.classes;

import com.writeoncereadmany.minstrel.ast.miscellaneous.Block;
import com.writeoncereadmany.minstrel.ast.miscellaneous.Name;
import com.writeoncereadmany.minstrel.ast.miscellaneous.ParameterList;
import com.writeoncereadmany.minstrel.ast.miscellaneous.TypeReference;
import com.writeoncereadmany.minstrel.ast.statements.Statement;
import com.writeoncereadmany.minstrel.runtime.context.ExecutionContext;
import com.writeoncereadmany.minstrel.runtime.environment.Environments;
import com.writeoncereadmany.minstrel.runtime.values.functions.CustomFunction;

/**
 * Created by tom on 15/12/2013.
 */
public class MethodDefinition implements Statement {

    private Name name;
    private ParameterList parameters;
    private TypeReference returnType;
    private Block body;

    public MethodDefinition(Name name, ParameterList parameters, TypeReference returnType, Block body) {
        this.name = name;
        this.parameters = parameters;
        this.returnType = returnType;
        this.body = body;
    }

    public String getName() {
        return name.getName();
    }

    public Block getBody() {
        return body;
    }

    @Override
    public void execute(ExecutionContext context, Environments environment) {
        environment.defineValue(new CustomFunction(environment, body));
    }
}
