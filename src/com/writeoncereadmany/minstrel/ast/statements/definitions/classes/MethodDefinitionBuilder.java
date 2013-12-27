package com.writeoncereadmany.minstrel.ast.statements.definitions.classes;

import com.writeoncereadmany.minstrel.ast.ASTNode;
import com.writeoncereadmany.minstrel.ast.ASTNodeBuilder;
import com.writeoncereadmany.minstrel.ast.miscellaneous.*;
import com.writeoncereadmany.minstrel.scope.Scopes;

/**
 * Created by tom on 15/12/2013.
 */
public class MethodDefinitionBuilder implements ASTNodeBuilder<MethodDefinition> {

    private final Scopes scopes;
    private Name name;
    private ParameterList parameters;
    private TypeReference returnType;
    private Block body;

    public MethodDefinitionBuilder(Scopes scopes)
    {
        scopes.enterScope();
        this.scopes = scopes;
    }

    @Override
    public void addNode(ASTNode node) {
        if(null == name)
        {
            name = (Name)node;
            TypeReference methodType = new TypeReference(new Name("Method " + name));
            this.scopes.peekAtDepth(1).add(methodType, name);
        }
        else if(null == parameters)
        {
            parameters = (ParameterList)node;
        }
        else if(null == returnType)
        {
            returnType = (TypeReference)node;
        }
        else
        {
            body = (Block)node;
        }

    }

    @Override
    public MethodDefinition build(Scopes scopes) {
        scopes.exitScope();
        return new MethodDefinition(name, parameters, returnType, body);
    }
}
