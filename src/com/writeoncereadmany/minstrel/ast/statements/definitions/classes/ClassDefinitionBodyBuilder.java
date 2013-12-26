package com.writeoncereadmany.minstrel.ast.statements.definitions.classes;

import com.writeoncereadmany.minstrel.ast.ASTNode;
import com.writeoncereadmany.minstrel.ast.ASTNodeBuilder;
import com.writeoncereadmany.minstrel.ast.statements.Statement;
import com.writeoncereadmany.minstrel.scope.Scopes;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by tom on 15/12/2013.
 */
public class ClassDefinitionBodyBuilder implements ASTNodeBuilder<ClassDefinitionBody> {

    private ConstructorDefinition constructor;
    private List<Statement> statements = new ArrayList<Statement>();
    private Map<String, MethodDefinition> methods = new LinkedHashMap<String, MethodDefinition>();

    @Override
    public void addNode(ASTNode node) {
        if(node instanceof FieldDefinition)
        {
            statements.add((FieldDefinition) node);
        }
        else if(node instanceof MethodDefinition)
        {
            MethodDefinition method = (MethodDefinition)node;
            methods.put(method.getName(), method);
            statements.add(method);
        }
        else
        {
            constructor = (ConstructorDefinition)node;
        }
    }

    @Override
    public ClassDefinitionBody build(Scopes scopes) {
        return new ClassDefinitionBody(constructor, statements, methods);
    }
}
