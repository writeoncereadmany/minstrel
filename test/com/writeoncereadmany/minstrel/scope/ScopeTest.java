package com.writeoncereadmany.minstrel.scope;

import com.writeoncereadmany.minstrel.ast.miscellaneous.Modifier;
import com.writeoncereadmany.minstrel.ast.miscellaneous.Name;
import com.writeoncereadmany.minstrel.ast.miscellaneous.Type;
import com.writeoncereadmany.minstrel.listeners.exceptions.NameAlreadyExistsException;
import com.writeoncereadmany.minstrel.listeners.exceptions.UnrecognisedNameException;
import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by tom on 10/11/2013.
 */
public class ScopeTest {

    private final static Type TYPE = new Type(new ArrayList<Modifier>(), new Name("Type"));

    @Test
    public void noNamesInEmptyScope()
    {
        Scopes programScopes = new Scopes(new Scope());
        assertThat(programScopes.contains("variable"), is(false));
        assertThat(programScopes.getDepth("variable"), is(Scopes.NOT_PRESENT));
    }

    @Test
    public void nameAddedToCurrentScopeHasDepthOfZero()
    {
        Scopes programScopes = new Scopes(new Scope());
        programScopes.enterScope();
        programScopes.add(TYPE, new Name("variable"));
        assertThat(programScopes.contains("variable"), is(true));
        assertThat(programScopes.getDepth("variable"), is(0));
    }

    @Test
    public void nameAddedToPriorScopeHasDepthOfOne()
    {
        Scopes programScopes = new Scopes(new Scope());
        programScopes.enterScope();
        programScopes.add(TYPE, new Name("variable"));
        programScopes.enterScope();
        assertThat(programScopes.contains("variable"), is(true));
        assertThat(programScopes.getDepth("variable"), is(1));
    }

    @Test
    public void shadowedNamesReportTheClosestDepthOnly()
    {
        Scopes programScopes = new Scopes(new Scope());
        programScopes.enterScope();
        programScopes.add(TYPE, new Name("variable"));
        programScopes.enterScope();
        programScopes.add(TYPE, new Name("variable"));
        assertThat(programScopes.contains("variable"), is(true));
        assertThat(programScopes.getDepth("variable"), is(0));
    }

    @Test
    public void namesCanFallOutOfScope()
    {
        Scopes programScopes = new Scopes(new Scope());
        programScopes.enterScope();
        programScopes.enterScope();
        programScopes.add(TYPE, new Name("variable"));
        programScopes.exitScope();
        assertThat(programScopes.contains("variable"), is(false));
    }

    @Test
    public void reportsDeBruijnIndicesCorrectly()
    {
        Scopes programScopes = new Scopes(new Scope());
        programScopes.enterScope();
        programScopes.add(TYPE, new Name("x"));
        programScopes.add(TYPE, new Name("y"));
        programScopes.enterScope();
        programScopes.add(TYPE, new Name("x"));
        programScopes.add(TYPE, new Name("z"));
        assertThat(programScopes.getDeBruijnIndex("x"), is(new DeBruijnIndex(0, 0)));
        assertThat(programScopes.getDeBruijnIndex("y"), is(new DeBruijnIndex(1, 1)));
        assertThat(programScopes.getDeBruijnIndex("z"), is(new DeBruijnIndex(0, 1)));
    }

    @Test(expected=NameAlreadyExistsException.class)
    public void cannotAddTheSameVariableToTheSameScopeTwice()
    {
        Scopes programScopes = new Scopes(new Scope());
        programScopes.enterScope();
        programScopes.add(TYPE, new Name("x"));
        programScopes.add(TYPE, new Name("x"));
    }

    @Test(expected=UnrecognisedNameException.class)
    public void gettingDeBruijnIndexOfNonexistentVariableThrowsException()
    {
        Scopes programScopes = new Scopes(new Scope());
        programScopes.getDeBruijnIndex("notHere");
    }

}
