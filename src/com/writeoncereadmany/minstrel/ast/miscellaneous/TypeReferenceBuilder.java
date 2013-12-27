package com.writeoncereadmany.minstrel.ast.miscellaneous;

import com.writeoncereadmany.minstrel.ast.ASTNode;
import com.writeoncereadmany.minstrel.ast.ASTNodeBuilder;
import com.writeoncereadmany.minstrel.scope.Scopes;

import java.util.ArrayList;
import java.util.List;

public class TypeReferenceBuilder implements ASTNodeBuilder<TypeReference> {

    private List<Modifier> modifiers = new ArrayList<Modifier>();
    private Name name;

    @Override
	public void addNode(ASTNode node)
    {
        if(node instanceof Modifier)
        {
            modifiers.add((Modifier)node);
        }
        if(node instanceof Name)
        {
            this.name = (Name)node;
        }
    }

	@Override
	public TypeReference build(Scopes scopes) {
		return new TypeReference(modifiers, name);
	}

}
