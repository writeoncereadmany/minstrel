package com.writeoncereadmany.minstrel.ast.statements.definitions;

import com.writeoncereadmany.minstrel.ast.ASTNode;
import com.writeoncereadmany.minstrel.ast.ASTNodeBuilder;
import com.writeoncereadmany.minstrel.ast.miscellaneous.Name;
import com.writeoncereadmany.minstrel.scope.Scopes;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by tom on 14/12/2013.
 */
public class InterfaceBodyBuilder implements ASTNodeBuilder<InterfaceBody>{

    Map<Name, Signature> methodSignatures = new HashMap<Name, Signature>();

    @Override
    public void addNode(ASTNode node) {
        Signature signature = (Signature)node;
        methodSignatures.put(signature.getName(), signature);
    }

    @Override
    public InterfaceBody build(Scopes scopes) {
        return new InterfaceBody(methodSignatures);
    }
}
