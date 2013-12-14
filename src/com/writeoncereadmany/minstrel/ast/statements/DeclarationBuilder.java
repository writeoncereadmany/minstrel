package com.writeoncereadmany.minstrel.ast.statements;

import com.writeoncereadmany.minstrel.ast.ASTNode;
import com.writeoncereadmany.minstrel.ast.ASTNodeBuilder;
import com.writeoncereadmany.minstrel.ast.miscellaneous.Name;
import com.writeoncereadmany.minstrel.ast.miscellaneous.Type;
import com.writeoncereadmany.minstrel.ast.expressions.Expression;
import com.writeoncereadmany.minstrel.listeners.MinstrelParseException;
import com.writeoncereadmany.minstrel.scope.Scopes;

public class DeclarationBuilder implements ASTNodeBuilder<Declaration> {

	private Type type;
	private Name name;
	private Expression value;
	
	@Override
	public void addNode(ASTNode node) {
		if(null == type)
		{
			type = (Type)node;
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
	public Declaration build(Scopes scopes) {
        if(scopes.contains(name.getName()) && scopes.getDepth(name.getName()) == -1)
        {
            throw new MinstrelParseException("Cannot redeclare names in the system scope");
        }
        scopes.add(name.getName());
		return new Declaration(type, name, value);
	}

}
