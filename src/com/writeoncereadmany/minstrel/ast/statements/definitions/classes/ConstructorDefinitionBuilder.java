package com.writeoncereadmany.minstrel.ast.statements.definitions.classes;

import com.writeoncereadmany.minstrel.ast.ASTNode;
import com.writeoncereadmany.minstrel.ast.ASTNodeBuilder;
import com.writeoncereadmany.minstrel.ast.miscellaneous.Block;
import com.writeoncereadmany.minstrel.ast.miscellaneous.ParameterList;
import com.writeoncereadmany.minstrel.scope.Scopes;

/**
 * Created by tom on 15/12/2013.
 */
public class ConstructorDefinitionBuilder implements ASTNodeBuilder<ConstructorDefinition> {

    private ParameterList parameters;
    private Block block;


    public ConstructorDefinitionBuilder(Scopes scopes)
    {
        scopes.enterScope();
    }

    @Override
    public void addNode(ASTNode node) {
        if(null == parameters)
        {
            parameters = (ParameterList)node;
        }
        else
        {
            block = (Block)node;
        }
    }

    @Override
    public ConstructorDefinition build(Scopes scopes) {
        scopes.exitScope();
        return new ConstructorDefinition(parameters, block);
    }
}
