package com.writeoncereadmany.minstrel.ast.statements.definitions.classes;

import com.writeoncereadmany.minstrel.ast.ASTNode;
import com.writeoncereadmany.minstrel.ast.ASTNodeBuilder;
import com.writeoncereadmany.minstrel.ast.miscellaneous.Name;
import com.writeoncereadmany.minstrel.ast.miscellaneous.TypeReference;
import com.writeoncereadmany.minstrel.scope.Scopes;

/**
 * Created by tom on 15/12/2013.
 */
public class FieldDefinitionBuilder implements ASTNodeBuilder<FieldDefinition> {

    private TypeReference type;
    private Name name;


    @Override
    public void addNode(ASTNode node) {
        if(null == type)
        {
            type = (TypeReference) node;
        }
        else
        {
            name = (Name) node;
        }

    }

    @Override
    public FieldDefinition build(Scopes scopes) {
        scopes.add(type, name);
        return new FieldDefinition(type, name);
    }
}
