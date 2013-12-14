package com.writeoncereadmany.minstrel.ast.miscellaneous;

import com.writeoncereadmany.minstrel.ast.ASTNode;
import com.writeoncereadmany.minstrel.ast.ASTNodeBuilder;
import com.writeoncereadmany.minstrel.ast.miscellaneous.Parameter;
import com.writeoncereadmany.minstrel.ast.miscellaneous.ParameterList;
import com.writeoncereadmany.minstrel.scope.Scopes;

import java.util.ArrayList;
import java.util.List;

public class ParameterListBuilder implements ASTNodeBuilder<ParameterList> {

	private final List<Parameter> parameters = new ArrayList<Parameter>();
	
	@Override
	public void addNode(ASTNode node) {
		parameters.add((Parameter)node);
	}

	@Override
	public ParameterList build(Scopes scopes) {
		return new ParameterList(parameters);
	}

}
