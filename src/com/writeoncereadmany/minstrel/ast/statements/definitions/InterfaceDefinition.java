package com.writeoncereadmany.minstrel.ast.statements.definitions;

import com.writeoncereadmany.minstrel.ast.miscellaneous.Name;
import com.writeoncereadmany.minstrel.ast.miscellaneous.Type;
import com.writeoncereadmany.minstrel.ast.statements.Statement;
import com.writeoncereadmany.minstrel.runtime.context.ExecutionContext;
import com.writeoncereadmany.minstrel.runtime.environment.Environments;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by tom on 14/12/2013.
 */
public class InterfaceDefinition implements Statement {

    private Name name;
    private List<Type> extendedInterfaces = new ArrayList<Type>();
    private Map<Name, Signature> methodSignatures;

    public InterfaceDefinition(Name name, List<Type> extendedInterfaces, Map<Name, Signature> methodSignatures)
    {
        this.name = name;
        this.methodSignatures = methodSignatures;
    }

    @Override
    public void execute(ExecutionContext context, Environments environment) {
        // We don't do anything with types yet - but something along the lines of:
        // Note we'll need to look up what interfaces have already been declared that this extends
        // Note also we can fully define interfaces at compile time - so execute should do nothing, we need this
        // in a resolveTypes step or something like that.
        // environment.defineType(new CustomInterface(environment, methodSignatures));
    }
}
