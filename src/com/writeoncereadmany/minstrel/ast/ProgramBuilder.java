package com.writeoncereadmany.minstrel.ast;

import com.writeoncereadmany.minstrel.listeners.MinstrelParseException;
import com.writeoncereadmany.minstrel.scope.Scopes;

import java.util.ArrayList;
import java.util.List;

public class ProgramBuilder implements ASTNodeBuilder {

	private List<Statement> nodes = new ArrayList<Statement>();

    public ProgramBuilder(Scopes scopes)
    {
        scopes.enterScope();
    }

	@Override
	public void addNode(ASTNode node) {
		nodes.add((Statement)node);
	}

	@Override
	public ASTNode build(Scopes scopes) {
        scopes.exitScope();
        if(!scopes.isEmpty())
        {
            throw new MinstrelParseException("Scope mismatch");
        }
		return new Program(nodes);
	}

}
