package com.writeoncereadmany.minstrel.scope;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by tom on 10/11/2013.
 */
public class ScopeTest {

    @Test
    public void noNamesInEmptyScope()
    {
        Scopes programScopes = new Scopes();
        assertThat(programScopes.contains("variable"), is(false));
        assertThat(programScopes.getDepth("variable"), is(-1));
    }

    @Test
    public void nameAddedToCurrentScopeHasDepthOfZero()
    {
        Scopes programScopes = new Scopes();
        programScopes.enterScope();
        programScopes.add("variable");
        assertThat(programScopes.contains("variable"), is(true));
        assertThat(programScopes.getDepth("variable"), is(0));
    }

    @Test
    public void nameAddedToPriorScopeHasDepthOfOne()
    {
        Scopes programScopes = new Scopes();
        programScopes.enterScope();
        programScopes.add("variable");
        programScopes.enterScope();
        assertThat(programScopes.contains("variable"), is(true));
        assertThat(programScopes.getDepth("variable"), is(1));
    }

    @Test
    public void shadowedNamesReportTheClosestDepthOnly()
    {
        Scopes programScopes = new Scopes();
        programScopes.enterScope();
        programScopes.add("variable");
        programScopes.enterScope();
        programScopes.add("variable");
        assertThat(programScopes.contains("variable"), is(true));
        assertThat(programScopes.getDepth("variable"), is(0));
    }

    @Test
    public void namesCanFallOutOfScope()
    {
        Scopes programScopes = new Scopes();
        programScopes.enterScope();
        programScopes.enterScope();
        programScopes.add("variable");
        programScopes.exitScope();
        assertThat(programScopes.contains("variable"), is(false));
    }

    @Test
    public void reportsDeBruijnIndicesCorrectly()
    {
        Scopes programScopes = new Scopes();
        programScopes.enterScope();
        programScopes.add("x");
        programScopes.add("y");
        programScopes.enterScope();
        programScopes.add("x");
        programScopes.add("z");
        assertThat(programScopes.getDeBruijnIndex("x"), is(new DeBruijnIndex(0, 0)));
        assertThat(programScopes.getDeBruijnIndex("y"), is(new DeBruijnIndex(1, 1)));
        assertThat(programScopes.getDeBruijnIndex("z"), is(new DeBruijnIndex(0, 1)));
    }

    @Test(expected=IllegalArgumentException.class)
    public void cannotAddTheSameVariableToTheSameScopeTwice()
    {
        Scopes programScopes = new Scopes();
        programScopes.enterScope();
        programScopes.add("x");
        programScopes.add("x");
    }

    @Test(expected=IllegalArgumentException.class)
    public void gettingDeBruijnIndexOfNonexistentVariableThrowsException()
    {
        Scopes programScopes = new Scopes();
        programScopes.getDeBruijnIndex("notHere");
    }

}
