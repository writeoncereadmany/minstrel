package com.writeoncereadmany.minstrel.ast.statements;

import com.writeoncereadmany.minstrel.ast.ASTNode;
import com.writeoncereadmany.minstrel.ast.ASTNodeBuilder;
import com.writeoncereadmany.minstrel.ast.miscellaneous.Name;
import com.writeoncereadmany.minstrel.ast.miscellaneous.TypeReference;
import com.writeoncereadmany.minstrel.ast.expressions.Expression;
import com.writeoncereadmany.minstrel.listeners.exceptions.IllegalOverrideException;
import com.writeoncereadmany.minstrel.listeners.exceptions.TypeMismatchException;
import com.writeoncereadmany.minstrel.scope.Scopes;

public class DeclarationStatementBuilder implements ASTNodeBuilder<DeclarationStatement> {

	private TypeReference type;
	private Name name;
	private Expression value;
	
	@Override
	public void addNode(ASTNode node) {
		if(null == type)
		{
			type = (TypeReference)node;
		} 
		else if (null == name) 
		{
			name = (Name)node;
		} 
		else 
		{
			value = (Expression)node;
		}
	}

	@Override
	public DeclarationStatement build(Scopes scopes) {
        if(scopes.contains(name.getName()) && scopes.getDepth(name.getName()) == -1)
        {
            throw new IllegalOverrideException("Cannot override names in the system scope");
        }
        final TypeReference assignant = value.getType(scopes);
        if(!type.allowsAssignmentOf(assignant))
        {
            throw new TypeMismatchException("Cannot assign " + assignant.getName() + " to " + type.getName());
        }
        scopes.add(type, name);
		return new DeclarationStatement(type, name, value);
	}

}
