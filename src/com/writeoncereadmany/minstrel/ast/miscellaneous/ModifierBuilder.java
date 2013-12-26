package com.writeoncereadmany.minstrel.ast.miscellaneous;


import com.writeoncereadmany.minstrel.ast.ASTNode;
import com.writeoncereadmany.minstrel.ast.ASTNodeBuilder;
import com.writeoncereadmany.minstrel.scope.Scopes;

public class ModifierBuilder implements ASTNodeBuilder<Modifier>
{
    private Name name;

    @Override
    public void addNode(ASTNode node)
    {
        this.name = (Name)node;
    }

    @Override
    public Modifier build(Scopes scopes) {
        return new Modifier(name);
    }
}
