package com.writeoncereadmany.minstrel.ast;

import com.writeoncereadmany.minstrel.ast.statements.Statement;
import com.writeoncereadmany.minstrel.listeners.MinstrelParseException;
import com.writeoncereadmany.minstrel.scope.Scopes;

import java.util.ArrayList;
import java.util.List;

public class ProgramBuilder implements ASTNodeBuilder<Program> {

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
	public Program build(Scopes scopes) {
        scopes.exitScope();
        if(!scopes.isEmpty())
        {
            throw new MinstrelParseException("Scope mismatch");
        }
		return new Program(nodes);
	}

}
