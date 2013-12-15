package com.writeoncereadmany.minstrel.ast.statements.definitions;

import com.writeoncereadmany.minstrel.ast.ASTNode;
import com.writeoncereadmany.minstrel.ast.ASTNodeBuilder;
import com.writeoncereadmany.minstrel.ast.miscellaneous.Name;
import com.writeoncereadmany.minstrel.ast.miscellaneous.Type;
import com.writeoncereadmany.minstrel.scope.Scopes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by tom on 14/12/2013.
 */
public class InterfaceDefinitionBuilder implements ASTNodeBuilder<InterfaceDefinition> {


    private Name name;
    private List<Type> extendedInterfaces = new ArrayList<Type>();
    private Map<Name, Signature> methodSignatures = new HashMap<Name, Signature>();

    @Override
    public void addNode(ASTNode node) {
        if(node instanceof Name)
        {
            this.name = (Name)node;
        }
        if(node instanceof Type) {
            this.extendedInterfaces.add((Type)node);
        }
        if(node instanceof InterfaceDefinitionBody)
        {
            methodSignatures = ((InterfaceDefinitionBody)node).getMethodSignatures();
        }
    }

    @Override
    public InterfaceDefinition build(Scopes scopes) {
        return new InterfaceDefinition(name, extendedInterfaces, methodSignatures);
    }
}
