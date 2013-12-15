package com.writeoncereadmany.minstrel.ast.statements.definitions;

import com.writeoncereadmany.minstrel.ast.ASTNode;
import com.writeoncereadmany.minstrel.ast.miscellaneous.Name;

import java.util.Map;

/**
 * Created by tom on 14/12/2013.
 */
public class InterfaceDefinitionBody implements ASTNode {

    private Map<Name, Signature> methodSignatures;

    public InterfaceDefinitionBody(Map<Name, Signature> signatures) {
        methodSignatures = signatures;
    }

    public Map<Name, Signature> getMethodSignatures() {
        return methodSignatures;
    }
}
