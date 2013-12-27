package com.writeoncereadmany.minstrel.ast.statements.definitions.functions;

import com.writeoncereadmany.minstrel.ast.miscellaneous.Name;
import com.writeoncereadmany.minstrel.ast.miscellaneous.ParameterList;
import com.writeoncereadmany.minstrel.ast.miscellaneous.TypeReference;
import com.writeoncereadmany.minstrel.ast.statements.Statement;
import com.writeoncereadmany.minstrel.runtime.environment.Environments;
import com.writeoncereadmany.minstrel.runtime.context.ExecutionContext;

public class Signature implements Statement {

	private Name name;
	private ParameterList parameterList;
	private TypeReference returnType;

	public Signature(Name name, ParameterList parameterList, TypeReference returnType) {
				this.name = name;
				this.parameterList = parameterList;
				this.returnType = returnType;
	}

	@Override
	public void execute(ExecutionContext context, Environments environment) {
		// no need to do anything quite yet!
	}

    public Name getName() {
        return name;
    }
}
