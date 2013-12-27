package com.writeoncereadmany.minstrel.scope;

import com.writeoncereadmany.minstrel.ast.miscellaneous.Name;
import com.writeoncereadmany.minstrel.ast.miscellaneous.TypeReference;
import com.writeoncereadmany.minstrel.listeners.exceptions.UnrecognisedNameException;

import java.util.Stack;

public class Scopes {

    public static final int NOT_PRESENT = Integer.MIN_VALUE;
    private final Stack<Scope> scopes = new Stack<Scope>();
    private final Scope systemScope;

    public Scopes(Scope systemScope)
    {
        this.systemScope = systemScope;
    }

    public void enterScope()
    {
        scopes.push(new Scope());
    }

    public void exitScope()
    {
        scopes.pop();
    }

    public Scope peekAtDepth(int depth)
    {
        if(depth == -1)
        {
            return systemScope;
        }
        return scopes.get(lastIndex() - depth);
    }

    public int lastIndex()
    {
        return scopes.size() - 1;
    }

    public void add(TypeReference type, Name name)
    {
        scopes.peek().add(type, name);
    }

    public boolean contains(String name)
    {
        return getDepth(name) >= -1;
    }

    public int getDepth(String name)
    {
        for(int i = lastIndex(); i >= 0; i--)
        {
            if(scopes.get(i).contains(name))
            {
                return lastIndex() - i;
            }
        }
        if(systemScope.contains(name))
        {
            return -1;
        }
        return NOT_PRESENT;
    }

    public DeBruijnIndex getDeBruijnIndex(String name) {
        if(!contains(name))
        {
            throw new UnrecognisedNameException("Name " + name + " not found in scopes");
        }
        final int depth = getDepth(name);
        final int position = peekAtDepth(depth).indexOf(name);
        return new DeBruijnIndex(depth, position);
    }

    public TypeReference typeOf(String name)
    {
        if(!contains(name))
        {
            throw new UnrecognisedNameException("Name " + name + " not found in scopes");
        }
        final int depth = getDepth(name);
        return peekAtDepth(depth).typeOf(name);
    }

    public TypeReference typeOf(DeBruijnIndex index)
    {
        return peekAtDepth(index.getDepth()).typeOf(index.getPosition());
    }

    public boolean isEmpty() {
        return scopes.isEmpty();
    }
}
