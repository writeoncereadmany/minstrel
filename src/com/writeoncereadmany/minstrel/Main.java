package com.writeoncereadmany.minstrel;

import com.writeoncereadmany.minstrel.framework.Framework;
import com.writeoncereadmany.minstrel.runtime.context.ExecutionContext;
import com.writeoncereadmany.minstrel.runtime.environment.Environment;
import com.writeoncereadmany.minstrel.runtime.environment.SystemEnvironment;
import com.writeoncereadmany.minstrel.runtime.utility.Printer;
import com.writeoncereadmany.minstrel.runtime.values.functions.PrintFunction;
import com.writeoncereadmany.minstrel.scope.Scope;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException
    {
		if(args.length != 1) 
		{
			System.out.println("Usage: java -jar minstrel.jar <filename>");
			return;
		}

		Scanner scanner = new Scanner(new File(args[0]));
		scanner.useDelimiter("\\z");
		String program = scanner.next();

        ExecutionContext context = new ExecutionContext();

        Environment environment = SystemEnvironment.createSystemEnvironment();
        Scope systemScope = SystemEnvironment.createSystemScope();
        environment.reassignValue(systemScope.indexOf("print"), new PrintFunction(printer()));

        Framework framework = new Framework();
        framework.execute(program, context, environment);
	}

    private static Printer printer()
    {
        return new Printer()
        {

            @Override
            public void println(String toPrint) {
                System.out.println(toPrint);
            }
        };
    }

}
