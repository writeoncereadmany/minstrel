package com.writeoncereadmany.minstrel.scope;

import java.util.Stack;

/**
 * Created by tom on 10/11/2013.
 */
public class Scopes {

    private final Stack<Scope> scopes = new Stack<Scope>();

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
        return scopes.get(lastIndex() - depth);
    }

    public int lastIndex()
    {
        return scopes.size() - 1;
    }

    public void add(String name)
    {
        scopes.peek().add(name);
    }

    public boolean contains(String name)
    {
        return getDepth(name) >= 0;
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
        return -1;
    }

    public DeBruijnIndex getDeBruijnIndex(String name) {
        if(!contains(name))
        {
            throw new IllegalArgumentException("Name " + name + " not found in scopes");
        }
        final int depth = getDepth(name);
        final int position = peekAtDepth(depth).indexOf(name);
        return new DeBruijnIndex(depth, position);
    }

    public boolean isEmpty() {
        return scopes.isEmpty();
    }
}
