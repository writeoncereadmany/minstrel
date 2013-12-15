package com.writeoncereadmany.minstrel.ast.statements.definitions.classes;

import com.writeoncereadmany.minstrel.ast.ASTNode;

import java.util.List;
import java.util.Map;

/**
 * Created by tom on 15/12/2013.
 */
public class ClassDefinitionBody implements ASTNode {

    private final ConstructorDefinition constructor;
    private final List<FieldDefinition> fields;
    private final Map<String, MethodDefinition> methods;

    public ClassDefinitionBody(ConstructorDefinition constructor, List<FieldDefinition> fields, Map<String, MethodDefinition> methods) {
        this.constructor = constructor;
        this.fields = fields;
        this.methods = methods;
    }

    public ConstructorDefinition getConstructor() {
        return constructor;
    }

    public List<FieldDefinition> getFields() {
        return fields;
    }

    public Map<String, MethodDefinition> getMethods() {
        return methods;
    }
}
