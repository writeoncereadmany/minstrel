package com.writeoncereadmany.minstrel.ast.statements.definitions.classes;

import com.writeoncereadmany.minstrel.ast.ASTNode;
import com.writeoncereadmany.minstrel.ast.ASTNodeBuilder;
import com.writeoncereadmany.minstrel.ast.miscellaneous.Name;
import com.writeoncereadmany.minstrel.ast.miscellaneous.Type;
import com.writeoncereadmany.minstrel.ast.statements.definitions.classes.ClassDefinition;
import com.writeoncereadmany.minstrel.scope.Scopes;

/**
 * Created by tom on 14/12/2013.
 */
public class ClassDefinitionBuilder implements ASTNodeBuilder<ClassDefinition> {

    private Name name;
    private Type classInterface;
//    private List<Field> fields;
//    private Constructor constructor;
//    private List<Method> methods;

    private Scopes scopes;

    public ClassDefinitionBuilder(Scopes scopes)
    {
        scopes.enterScope();
        this.scopes = scopes;
    }


    @Override
    public void addNode(ASTNode node) {
        if(name == null)
        {
            name = (Name)node;
            scopes.peekAtDepth(1).add(name.getName());
        }
        else if (classInterface == null)
        {
            classInterface = (Type)node;
        }
        else
        {
//            ClassBodyDefinition body = (ClassBodyDefinition)node;
        }

    }

    @Override
    public ClassDefinition build(Scopes scopes) {
        scopes.exitScope();
        return new ClassDefinition(name, classInterface);
    }
}
