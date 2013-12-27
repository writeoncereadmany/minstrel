package com.writeoncereadmany.minstrel.ast.expressions;


import com.writeoncereadmany.minstrel.ast.miscellaneous.Name;
import com.writeoncereadmany.minstrel.ast.miscellaneous.TypeReference;
import com.writeoncereadmany.minstrel.runtime.environment.Environments;
import com.writeoncereadmany.minstrel.runtime.context.ExecutionContext;
import com.writeoncereadmany.minstrel.runtime.values.objects.StringValue;
import com.writeoncereadmany.minstrel.runtime.values.Value;
import com.writeoncereadmany.minstrel.scope.Scopes;

public class StringLiteral implements Expression {
	
	private String string;
	
	public StringLiteral(final String string)
	{
		this.string = string;
	}

	@Override
	public Value evaluate(final ExecutionContext context, Environments environment) {
		return new StringValue(string);
	}

    @Override
    public TypeReference getType(Scopes scopes) {
        return new TypeReference(new Name("String"));
    }

}
