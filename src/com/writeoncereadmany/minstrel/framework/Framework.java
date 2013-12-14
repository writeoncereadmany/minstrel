package com.writeoncereadmany.minstrel.framework;

import com.writeoncereadmany.minstrel.runtime.environment.Environment;
import com.writeoncereadmany.minstrel.runtime.environment.Environments;
import com.writeoncereadmany.minstrel.runtime.environment.SystemEnvironment;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import com.writeoncereadmany.minstrel.ast.Program;
import com.writeoncereadmany.minstrel.generated.MinstrelLexer;
import com.writeoncereadmany.minstrel.generated.MinstrelListener;
import com.writeoncereadmany.minstrel.generated.MinstrelParser;
import com.writeoncereadmany.minstrel.listeners.ASTBuildingParseListener;
import com.writeoncereadmany.minstrel.listeners.ExceptionThrowingErrorListener;
import com.writeoncereadmany.minstrel.runtime.context.ExecutionContext;

public class Framework 
{
	public void parse(final String programText, final MinstrelListener listener)
	{
		final CharStream programStream = new ANTLRInputStream(programText);
		final MinstrelLexer programLexer = new MinstrelLexer(programStream);
		final TokenStream programTokens = new CommonTokenStream(programLexer);
		final MinstrelParser programParser = new MinstrelParser(programTokens);
		programParser.addErrorListener(new ExceptionThrowingErrorListener());
		final ParseTreeWalker walker = new ParseTreeWalker();
		
		walker.walk(listener, programParser.program());
	}
	
	public Program getProgram(final String programText)
	{
		final ASTBuildingParseListener builder = new ASTBuildingParseListener(SystemEnvironment.createSystemScope());
		parse(programText, builder);
		return builder.getProgram();
	}
	
	public void execute(final String programText)
	{
        ExecutionContext defaultContext = new ExecutionContext();

		execute(programText, defaultContext, SystemEnvironment.createSystemEnvironment());
	}
	
	public void execute(final String programText, final ExecutionContext customContext, final Environment systemEnvironment)
	{
		getProgram(programText).execute(customContext, Environments.fromSystemEnvironment(systemEnvironment));
	}
}
