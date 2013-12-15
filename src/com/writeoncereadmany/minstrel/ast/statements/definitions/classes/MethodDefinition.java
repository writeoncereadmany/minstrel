package com.writeoncereadmany.minstrel.ast.statements.definitions.classes;

import com.writeoncereadmany.minstrel.ast.ASTNode;
import com.writeoncereadmany.minstrel.ast.miscellaneous.Block;
import com.writeoncereadmany.minstrel.ast.miscellaneous.Name;
import com.writeoncereadmany.minstrel.ast.miscellaneous.ParameterList;
import com.writeoncereadmany.minstrel.ast.miscellaneous.Type;

/**
 * Created by tom on 15/12/2013.
 */
public class MethodDefinition implements ASTNode {

    private Name name;
    private ParameterList parameters;
    private Type returnType;
    private Block body;

    public MethodDefinition(Name name, ParameterList parameters, Type returnType, Block body) {
        this.name = name;
        this.parameters = parameters;
        this.returnType = returnType;
        this.body = body;
    }

    public String getName() {
        return name.getName();
    }

    public Block getBody() {
        return body;
    }
}
