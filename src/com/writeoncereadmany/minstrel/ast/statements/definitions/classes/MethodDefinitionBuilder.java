package com.writeoncereadmany.minstrel.ast.statements.definitions.classes;

import com.writeoncereadmany.minstrel.ast.ASTNode;
import com.writeoncereadmany.minstrel.ast.ASTNodeBuilder;
import com.writeoncereadmany.minstrel.ast.miscellaneous.Block;
import com.writeoncereadmany.minstrel.ast.miscellaneous.Name;
import com.writeoncereadmany.minstrel.ast.miscellaneous.ParameterList;
import com.writeoncereadmany.minstrel.ast.miscellaneous.Type;
import com.writeoncereadmany.minstrel.scope.Scopes;

/**
 * Created by tom on 15/12/2013.
 */
public class MethodDefinitionBuilder implements ASTNodeBuilder<MethodDefinition> {

    private Name name;
    private ParameterList parameters;
    private Type returnType;
    private Block body;

    public MethodDefinitionBuilder(Scopes scopes)
    {
        scopes.enterScope();
    }

    @Override
    public void addNode(ASTNode node) {
        if(null == name)
        {
            name = (Name)node;
        }
        else if(null == parameters)
        {
            parameters = (ParameterList)node;
        }
        else if(null == returnType)
        {
            returnType = (Type)node;
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
