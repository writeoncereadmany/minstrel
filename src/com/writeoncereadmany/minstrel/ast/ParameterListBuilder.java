package com.writeoncereadmany.minstrel.ast;

import java.util.ArrayList;
import java.util.List;

public class ParameterListBuilder implements ASTNodeBuilder {

	private final List<Parameter> parameters = new ArrayList<Parameter>();
	
	@Override
	public void addNode(ASTNode node) {
		parameters.add((Parameter)node);
	}

	@Override
	public ASTNode build() {
		return new ParameterList(parameters);
	}

}
