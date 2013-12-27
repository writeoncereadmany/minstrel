package com.writeoncereadmany.minstrel.ast.expressions;

import com.writeoncereadmany.minstrel.ast.miscellaneous.Block;
import com.writeoncereadmany.minstrel.ast.miscellaneous.Name;
import com.writeoncereadmany.minstrel.ast.miscellaneous.ParameterList;
import com.writeoncereadmany.minstrel.ast.miscellaneous.TypeReference;
import com.writeoncereadmany.minstrel.runtime.environment.Environments;
import com.writeoncereadmany.minstrel.runtime.context.ExecutionContext;
import com.writeoncereadmany.minstrel.runtime.values.functions.CustomFunction;
import com.writeoncereadmany.minstrel.runtime.values.Value;
import com.writeoncereadmany.minstrel.scope.Scopes;

public class AnonymousFunction implements Expression {

	private ParameterList parameterList;
    private TypeReference returnType;
    private Block block;
	
	public AnonymousFunction(ParameterList parameterList, TypeReference returnType, Block block) {
		this.parameterList = parameterList;
        this.returnType = returnType;
        this.block = block;
	}

	@Override
	public Value evaluate(ExecutionContext context, Environments environment) {
		return new CustomFunction(environment, block);
	}

    @Override
    public TypeReference getType(Scopes scopes) {
        return new TypeReference(new Name("Unknown"));
    }

}
