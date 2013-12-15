package com.writeoncereadmany.minstrel.ast.statements.definitions.classes;

import com.writeoncereadmany.minstrel.ast.ASTNode;
import com.writeoncereadmany.minstrel.ast.ASTNodeBuilder;
import com.writeoncereadmany.minstrel.ast.miscellaneous.Name;
import com.writeoncereadmany.minstrel.ast.miscellaneous.Type;
import com.writeoncereadmany.minstrel.scope.Scopes;

/**
 * Created by tom on 15/12/2013.
 */
public class FieldDefinitionBuilder implements ASTNodeBuilder<FieldDefinition> {

    private Type type;
    private Name name;


    @Override
    public void addNode(ASTNode node) {
        if(null == type)
        {
            type = (Type) node;
        }
        else
        {
            name = (Name) node;
        }

    }

    @Override
    public FieldDefinition build(Scopes scopes) {
        scopes.add(name.getName());
        return new FieldDefinition(type, name);
    }
}
