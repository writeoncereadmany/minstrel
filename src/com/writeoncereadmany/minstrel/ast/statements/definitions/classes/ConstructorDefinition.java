package com.writeoncereadmany.minstrel.ast.statements.definitions.classes;

import com.writeoncereadmany.minstrel.ast.ASTNode;
import com.writeoncereadmany.minstrel.ast.miscellaneous.Block;
import com.writeoncereadmany.minstrel.ast.miscellaneous.ParameterList;

/**
 * Created by tom on 15/12/2013.
 */
public class ConstructorDefinition implements ASTNode {


    private final ParameterList parameters;
    private final Block block;

    public ConstructorDefinition(ParameterList parameters, Block block) {

        this.parameters = parameters;
        this.block = block;
    }

    public Block getBlock() {
        return block;
    }
}
