package com.writeoncereadmany.minstrel.ast.expressions;

import com.writeoncereadmany.minstrel.ast.miscellaneous.ArgumentList;
import com.writeoncereadmany.minstrel.ast.miscellaneous.Name;
import com.writeoncereadmany.minstrel.ast.miscellaneous.TypeReference;
import com.writeoncereadmany.minstrel.runtime.context.ExecutionContext;
import com.writeoncereadmany.minstrel.runtime.environment.Environment;
import com.writeoncereadmany.minstrel.runtime.environment.Environments;
import com.writeoncereadmany.minstrel.runtime.values.Value;
import com.writeoncereadmany.minstrel.runtime.values.objects.MinstrelObject;
import com.writeoncereadmany.minstrel.scope.Scopes;

import java.util.List;

/**
 * Created by tom on 01/12/2013.
 */
public class MethodCall implements Expression {

    private Expression subject;
    private final Name name;
    private final ArgumentList argumentList;

    public MethodCall(Expression subject, Name name, ArgumentList argumentList)
    {
        this.subject = subject;
        this.name = name;
        this.argumentList = argumentList;
    }

    @Override
    public Value evaluate(ExecutionContext context, Environments environment)
    {
        MinstrelObject subjectValue = (MinstrelObject)subject.evaluate(context, environment);
        List<Value> arguments = argumentList.evaluate(context, environment);
        Environment methodEnvironment = new Environment(arguments);
        return subjectValue.callMethod(name.getName(), context, methodEnvironment);
    }

    @Override
    public TypeReference getType(Scopes scopes) {
        return new TypeReference(new Name("Unknown"));
    }

}
