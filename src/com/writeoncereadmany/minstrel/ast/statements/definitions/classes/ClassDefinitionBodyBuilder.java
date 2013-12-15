package com.writeoncereadmany.minstrel.ast.statements.definitions.classes;

import com.writeoncereadmany.minstrel.ast.ASTNode;
import com.writeoncereadmany.minstrel.ast.ASTNodeBuilder;
import com.writeoncereadmany.minstrel.scope.Scopes;
import org.hamcrest.generator.qdox.parser.structs.FieldDef;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by tom on 15/12/2013.
 */
public class ClassDefinitionBodyBuilder implements ASTNodeBuilder<ClassDefinitionBody> {

    private ConstructorDefinition constructor;
    private List<FieldDefinition> fields = new ArrayList<FieldDefinition>();
    private Map<String, MethodDefinition> methods = new HashMap<String, MethodDefinition>();

    @Override
    public void addNode(ASTNode node) {
        if(node instanceof FieldDefinition)
        {
            fields.add((FieldDefinition)node);
        }
        else if(node instanceof MethodDefinition)
        {
            MethodDefinition method = (MethodDefinition)node;
            methods.put(method.getName(), method);
        }
        else
        {
            constructor = (ConstructorDefinition)node;
        }
    }

    @Override
    public ClassDefinitionBody build(Scopes scopes) {
        return new ClassDefinitionBody(constructor, fields, methods);
    }
}
