package com.writeoncereadmany.minstrel.ast.statements.definitions;

import com.writeoncereadmany.minstrel.ast.ASTNode;
import com.writeoncereadmany.minstrel.ast.ASTNodeBuilder;
import com.writeoncereadmany.minstrel.scope.Scopes;

/**
 * Created by tom on 15/12/2013.
 */
public class ClassDefinitionBodyBuilder implements ASTNodeBuilder<ClassDefinitionBody> {

    @Override
    public void addNode(ASTNode node) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ClassDefinitionBody build(Scopes scopes) {
        return new ClassDefinitionBody();
    }
}
