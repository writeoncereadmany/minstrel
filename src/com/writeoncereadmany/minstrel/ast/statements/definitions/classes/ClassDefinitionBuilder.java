package com.writeoncereadmany.minstrel.ast.statements.definitions.classes;

import com.writeoncereadmany.minstrel.ast.ASTNode;
import com.writeoncereadmany.minstrel.ast.ASTNodeBuilder;
import com.writeoncereadmany.minstrel.ast.miscellaneous.Name;
import com.writeoncereadmany.minstrel.ast.miscellaneous.Type;
import com.writeoncereadmany.minstrel.ast.statements.Statement;
import com.writeoncereadmany.minstrel.listeners.MinstrelParseException;
import com.writeoncereadmany.minstrel.scope.Scopes;

import java.util.List;
import java.util.Map;

/**
 * Created by tom on 14/12/2013.
 */
public class ClassDefinitionBuilder implements ASTNodeBuilder<ClassDefinition> {

    private Name name;
    private Type classInterface;
    private ClassDefinitionBody body;

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
            body = (ClassDefinitionBody)node;
        }

    }

    @Override
    public ClassDefinition build(Scopes scopes) {
        ConstructorDefinition constructor = body.getConstructor();
        List<Statement> statements = body.getStatements();
        Map<String,MethodDefinition> methods = body.getMethods();

        if(null == constructor)
        {
            throw new MinstrelParseException("A class requires a constructor");
        }

        scopes.exitScope();

        return new ClassDefinition(name, classInterface, constructor, statements, methods);
    }
}
