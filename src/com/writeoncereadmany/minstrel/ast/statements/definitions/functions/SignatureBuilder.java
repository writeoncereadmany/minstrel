package com.writeoncereadmany.minstrel.ast.statements.definitions.functions;

import com.writeoncereadmany.minstrel.ast.*;
import com.writeoncereadmany.minstrel.ast.miscellaneous.Name;
import com.writeoncereadmany.minstrel.ast.miscellaneous.ParameterList;
import com.writeoncereadmany.minstrel.ast.miscellaneous.TypeReference;
import com.writeoncereadmany.minstrel.scope.Scopes;

public class SignatureBuilder implements ASTNodeBuilder<Signature> {
	
	private Name name;
	private ParameterList parameterList;
	private TypeReference returnType;

    public SignatureBuilder(final Scopes scopes)
    {
        scopes.enterScope();
    }
	
	@Override
	public void addNode(ASTNode node) {
		if(name == null)
		{
			name = (Name)node;
		}
		else if(parameterList == null)
		{
			parameterList = (ParameterList)node;
		}
		else 
		{
			returnType = (TypeReference)node;
		}
	}
	
	@Override
	public Signature build(Scopes scopes) {
        scopes.exitScope();
		return new Signature(name, parameterList, returnType);
	}

}
