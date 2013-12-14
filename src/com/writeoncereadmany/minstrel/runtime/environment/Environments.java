package com.writeoncereadmany.minstrel.runtime.environment;

import com.writeoncereadmany.minstrel.runtime.values.Value;
import com.writeoncereadmany.minstrel.scope.DeBruijnIndex;

import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.unmodifiableList;

/**
 * Created by tom on 23/11/2013.
 */
public class Environments {

    private final List<Environment> environments;
    private final Environment systemEnvironment;

    private Environments(List<Environment> programEnvironments, Environment systemEnvironment)
    {
        this.environments = unmodifiableList(programEnvironments);
        this.systemEnvironment = systemEnvironment;
    }

    private Environment currentEnvironment()
    {
        return environments.get(0);
    }

    private Environment environmentFor(DeBruijnIndex index)
    {
        int environmentDepth = index.getDepth();
        if(environmentDepth == -1)
        {
            return systemEnvironment;
        }
        if(environmentDepth < 0 || environmentDepth >= environments.size())
        {
            throw new IllegalArgumentException("Environment " + environmentDepth + " does not exist");
        }
        return environments.get(environmentDepth);
    }

    public void defineValue(Value value)
    {
        currentEnvironment().defineValue(value);
    }

    public void reassignValue(DeBruijnIndex index, Value value)
    {
        final Environment environment = environmentFor(index);
        environment.reassignValue(index.getPosition(), value);
    }

    public Value getValue(DeBruijnIndex index)
    {
        final Environment environment = environmentFor(index);
        return environment.getValue(index.getPosition());
    }

    public Environments childEnvironment(Environment environment)
    {
        final List<Environment> environments = new ArrayList<Environment>();
        environments.add(environment);
        environments.addAll(this.environments);
        return new Environments(environments, systemEnvironment);
    }

    public static Environments fromSystemEnvironment(Environment systemEnvironment)
    {
        return new Environments(new ArrayList<Environment>(), systemEnvironment);
    }
}
