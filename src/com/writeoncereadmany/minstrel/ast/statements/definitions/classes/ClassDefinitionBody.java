package com.writeoncereadmany.minstrel.ast.statements.definitions.classes;

import com.writeoncereadmany.minstrel.ast.ASTNode;
import com.writeoncereadmany.minstrel.ast.statements.Statement;

import java.util.List;
import java.util.Map;

/**
 * Created by tom on 15/12/2013.
 */
public class ClassDefinitionBody implements ASTNode {

    private final ConstructorDefinition constructor;
    private final List<Statement> statements;
    private final Map<String, MethodDefinition> methods;

    public ClassDefinitionBody(ConstructorDefinition constructor, List<Statement> statements, Map<String, MethodDefinition> methods) {
        this.constructor = constructor;
        this.statements = statements;
        this.methods = methods;
    }

    public ConstructorDefinition getConstructor() {
        return constructor;
    }

    public List<Statement> getStatements() {
        return statements;
    }

    public Map<String, MethodDefinition> getMethods() {
        return methods;
    }
}
