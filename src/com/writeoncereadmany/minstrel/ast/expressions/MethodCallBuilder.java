package com.writeoncereadmany.minstrel.ast.expressions;

import com.writeoncereadmany.minstrel.ast.ASTNode;
import com.writeoncereadmany.minstrel.ast.ASTNodeBuilder;
import com.writeoncereadmany.minstrel.ast.miscellaneous.ArgumentList;
import com.writeoncereadmany.minstrel.ast.miscellaneous.Name;
import com.writeoncereadmany.minstrel.scope.Scopes;

/**
 * Created by tom on 01/12/2013.
 */
public class MethodCallBuilder implements ASTNodeBuilder<MethodCall> {

    private Expression subject;
    private Name name;
    private ArgumentList argumentList;

    @Override
    public void addNode(ASTNode node) {
        if(subject == null)
        {
            subject = (Expression)node;
        }
        else if(name == null)
        {
            name = (Name)node;
        }
        else if(argumentList == null)
        {
            argumentList = (ArgumentList)node;
        }

    }

    @Override
    public MethodCall build(Scopes scopes) {
        return new MethodCall(subject, name, argumentList);
    }
}
