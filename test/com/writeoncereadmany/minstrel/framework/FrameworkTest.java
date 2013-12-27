package com.writeoncereadmany.minstrel.framework;

import java.util.ArrayList;
import java.util.List;

import com.writeoncereadmany.minstrel.listeners.exceptions.*;
import com.writeoncereadmany.minstrel.runtime.environment.SystemEnvironment;
import com.writeoncereadmany.minstrel.runtime.context.ExecutionContext;
import com.writeoncereadmany.minstrel.runtime.environment.Environment;
import com.writeoncereadmany.minstrel.runtime.values.functions.PrintFunction;
import com.writeoncereadmany.minstrel.scope.Scope;
import org.junit.Assert;
import org.junit.Test;

import com.writeoncereadmany.minstrel.generated.MinstrelBaseListener;
import com.writeoncereadmany.minstrel.listeners.PrintingParseListener;
import com.writeoncereadmany.minstrel.runtime.utility.Printer;

public class FrameworkTest {

	private Framework underTest = new Framework();
	
	private final CapturingPrintStream capturingPrintStream = new CapturingPrintStream();
	
	@Test
	public void shouldParseEmptyProgram() {
		assertOutput("");
	}
	
	@Test(expected=MinstrelParseException.class)
	public void shouldThrowParseExceptionWithInvalidProgram() {
		underTest.parse("Clearly a pile of old bollocks", new MinstrelBaseListener());
	}
	
	@Test
	public void shouldPrintStrings() 
	{
		assertOutput("print[\"Hello world\"];", "Hello world");
	}
	
	@Test
	public void shouldPrintIntegers() 
	{
		assertOutput("print[42];", "42");
	}
	
	@Test
	public void shouldPrintBooleans() 
	{
		assertOutput("print[true];", "true");
		assertOutput("print[false];", "false");
	}
	
	@Test
	public void shouldEvaluateSimpleArithmetic() {
		assertOutput("print[2 + 4];", "6");
		assertOutput("print[3 * 5];", "15");
		assertOutput("print[9 - 3];", "6");
		assertOutput("print[22 / 7];", "22 / 7");
		assertOutput("print[21 / 9];", "7 / 3");
	}

	@Test
	public void canUseMethodNotationForAddition() {
		assertOutput("print[2.plus[4]];", "6");
	}

	@Test
	public void canChainMethods() {
		assertOutput("print[2.plus[4].plus[3]];", "9");
	}

	@Test
	public void canUseMethodNotationForSubtraction() {
		assertOutput("print[10.minus[4]];", "6");
	}

	@Test
	public void canUseMethodNotationForMultiplication() {
		assertOutput("print[2.multipliedBy[4]];", "8");
	}

	@Test
	public void canUseMethodNotationForDivision() {
		assertOutput("print[15.dividedBy[3]];", "5");
	}

	@Test
	public void canUseMethodNotationForStringConcatenation() {
		assertOutput("print[\"hello \".plus[\"world\"]];", "hello world");
	}

	@Test
	public void shouldEvaluateSamePrecedenceOperatorsLeftToRight()
	{
		assertOutput("print[10 - 5 + 3];", "8");
	}
	
	@Test
	public void shouldApplyOperatorPrecedence() 
	{
		assertOutput("print[2 + 3 * 5];", "17");
		assertOutput("print[2 * 3 + 5];", "11");
		assertOutput("print[2 + 3 * 5 + 7];", "24");
		assertOutput("print[2 + 3 * (5 + 7)];", "38");
		assertOutput("print[(2 + 3) * 5 + 7];", "32");
	}
	
	@Test
	public void shouldSupportVariables()
	{
		assertOutput("String name is \"Timothy\"; print[name];", "Timothy");
	}
	
	@Test(expected=NameAlreadyExistsException.class)
	public void shouldNotSupportRedeclaringVariables()
	{
		assertOutput("Number three is 3; Number three is 5;");
	}
	
	@Test
	public void shouldSupportReassigningWhenDeclaredVariable()
	{
		assertOutput("variable Number two is 2; two becomes 5; print[two];", "5");
	}

	@Test(expected=IllegalReassignmentException.class)
	public void shouldNotSupportReassigningWhenNotDeclaredVariable()
	{
		assertOutput("Number two is 2; two becomes 5; print[two];");
	}
	
	@Test(expected=UnrecognisedNameException.class)
	public void shouldNotSupportReassigningVariablesWhichHaveNotBeenDeclared()
	{
		assertOutput("two becomes 5;");
	}
	
	@Test
	public void shouldSupportEqualityComparisons()
	{
		assertOutput("print[3 = 3];", "true");
		assertOutput("print[2 + 2 = 5];", "false");
	}
	
	@Test
	public void shouldSupportInequalityComparisons()
	{
		assertOutput("print[42 =/= 4];", "true");
		assertOutput("print[0 =/= 0];", "false");
	}

	@Test
	public void shouldSupportIfStatements()
	{
		assertOutput("variable Number a is 5; if 2 + 2 = 5 { a becomes 7;} print[a];", "5");
		assertOutput("variable Number a is 5; if 2 + 2 =/= 5 { a becomes 7;} print[a];", "7");
	}

    @Test
    public void shouldAllowAssignmentOfIntegerToIntegerReference()
    {
        assertOutput("Number a is 5; print[a];", "5");
    }

    @Test(expected=TypeMismatchException.class)
    public void shouldNotAllowAssignmentOfStringToIntegerReference()
    {
        assertOutput("Number a is \"Hello world!\";");
    }
	
	@Test
	public void shouldSupportWhileStatements()
	{
		assertOutput("variable Number factorial is 1; " +
					 "Number n is 5; " +
					 "variable Number progress is 1; " +
					 "while progress =/= n " +
					 "{ " +
					 "    progress becomes progress + 1; " +
					 "    factorial becomes factorial * progress;" +
					 "}" +
					 "print[factorial];" 
					 ,
					 "120");
	}
	
	@Test
	public void shouldSupportDefiningAndCallingFunctions()
	{
		assertOutput("function square[Number x] returns Number { return x * x; } print[square[9]];", "81");
	}
	
	@Test
	public void shouldSupportCallingFunctionMultipleTimes()
	{
		assertOutput("function square[Number x] returns Number { return x * x; } " +
				     "print[square[9]]; " +
				     "print[square[2]];", 
				     "81", "4");
	}
	
	@Test
	public void shouldReferToHigherScopesIfVariablesNotBoundInCurrentScope()
	{
		assertOutput("Number a is 5;" +
					 "Number b is 7;" +
					 "function foo[Number a] returns Number { return a * b; } " +
				     "print[foo[11]];",
				     "77");
	}
	
	@Test(expected = IllegalOverrideException.class)
	public void shouldNotBeAbleToOverrideSystemScopeNames()
	{
		assertOutput("Number print is 4;");
	}
	
	@Test
	public void canDeclareFunctionInterfaces()
	{
		assertOutput("signature Foo[] returns Number;");
	}
	
	@Test
	public void canDeclareAnonymousFunctions()
	{
		assertOutput("signature Foo[Number x] returns Number; " +
				     "function makeAFoo[] returns Foo " +
				     "{ " +
				     "   return function[Number x] returns Number " +
				     "   {" +
				     "      return x*2;" +
				     "   };" +
				     "}" +
				     "Foo doubler is makeAFoo[];" +
				     "print[doubler[4]];",
				     "8");
	}
	
	@Test
	public void supportsRecursiveFunctions()
	{
		assertOutput("function factorial[Number n] returns Number " +
					 "{ " +
					 "   if(n = 0) { return 1; }" +
					 "   return n * factorial[n-1];" +
					 "}" +
					 "print[factorial[5]];",
					 "120");
	}
	
	@Test
	public void supportsErrorStatements()
	{
		assertError("error[\"Error statement\"];", "Error statement");
	}
	
	@Test
	public void shouldAllowBoundVariablesToEscapeScope()
	{
		assertOutput("signature Constant[] returns Number;" +
				     "function binder[] returns Constant" +
				     "{" +
				     "    Number a is 5;" +
				     "    return function[] returns Number { return a; };  " +
				     "} " +
				     "function useBinder[Constant func] returns Unit " +
				     "{" +
				     "   Number a is 8;" +
				     "   print[func[]];" +
				     "}" +
				     "useBinder[binder[]];",
				     "5");
	}

    @Test
    public void canDefineInterfaces()
    {
        assertOutput("interface Bouncy \n" +
                     "{ \n " +
                     "   method bounce[] returns Unit; \n" +
                     "   method drop[] returns Unit; \n" +
                     "}");
    }

    @Test
    public void canExtendInterfaces()
    {
        assertOutput("interface Bouncy \n" +
                     "{ \n " +
                     "   method bounce[] returns Unit; \n" +
                     "}  \n" +
                     "interface Shiny \n" +
                     "{ \n" +
                     "   method shine[] returns Unit;  \n" +
                     "}  \n" +
                     "interface LovelyHair extends Bouncy, Shiny {} ");
    }

    @Test
    public void canDefineClassWithEmptyBodyOtherThanConstructor()
    {
        assertOutput("class Complex implements Thingy \n" +
                     "{\n" +
                     "   construct[] {} \n" +
                     "}");
    }

    @Test
    public void canDefineClassWithFieldsAndMethods()
    {
        assertOutput("class Complex implements Thingy \n" +
                     "{\n" +
                     "   Number real;\n" +
                     "   Number imaginary;\n" +
                     "   construct[Number re, Number imag]\n" +
                     "   { \n" +
                     "       real is re;\n" +
                     "       imaginary is imag;\n" +
                     "   } \n" +
                     "   method magnitude[] returns Number { return real * imaginary; } \n" +
                     "} \n" +
                     "Complex i is Complex[3, 4]; \n" +
                     "print[i.magnitude[]]; \n",
                     "12");
    }

    @Test
    public void canCallMethodsFromOtherMethods()
    {
        assertOutput("class Complex implements Thingy \n" +
                "{\n" +
                "   Number real;\n" +
                "   Number imaginary;\n" +
                "   construct[Number re, Number imag]\n" +
                "   { \n" +
                "       real is re;\n" +
                "       imaginary is imag;\n" +
                "   } \n" +
                "   method magnitude[] returns Number { return real * imaginary; } \n" +
                "   method magnitude2[] returns Number { return magnitude[]; } \n " +
                "} \n" +
                "Complex i is Complex[3, 4]; \n" +
                "print[i.magnitude2[]]; \n",
                "12");
    }

    @Test(expected=UnrecognisedNameException.class)
    public void cannotCallMethodsWhichHaventBeenDeclaredYet()
    {
        assertOutput("class Complex implements Thingy \n" +
                "{\n" +
                "   Number real;\n" +
                "   Number imaginary;\n" +
                "   construct[Number re, Number imag]\n" +
                "   { \n" +
                "       real is re;\n" +
                "       imaginary is imag;\n" +
                "   } \n" +
                "   method magnitude2[] returns Number { return magnitude[]; } \n " +
                "   method magnitude[] returns Number { return real * imaginary; } \n" +
                "} \n");
    }

    @Test(expected=UnrecognisedNameException.class)
    public void cannotCallMethodsOutsideAnObject()
    {
        assertOutput("class Complex implements Thingy \n" +
                "{\n" +
                "   Number real;\n" +
                "   Number imaginary;\n" +
                "   construct[Number re, Number imag]\n" +
                "   { \n" +
                "       real is re;\n" +
                "       imaginary is imag;\n" +
                "   } \n" +
                "   method magnitude[] returns Number { return real * imaginary; } \n" +
                "   method magnitude2[] returns Number { return magnitude[]; } \n " +
                "} \n" +
                "Complex i is Complex[3, 4]; \n" +
                "print[magnitude2[]]; \n");
    }
	
	@Test
	public void stopExecutingBlockWhenReturnStatementHit()
	{
		assertOutput("function foo[] returns Unit " +
					 "{" +
					 "    print[\"one\"];" +
					 "    return unit;" +
					 "    print[\"two\"]; " +
					 "}" +
					 "foo[];" +
					 "print[\"three\"];",
					 "one", "three");
	}

	@Test
	public void stopExecutingProgramWhenErrorStatementHit()
	{
		assertError("function foo[] returns Unit " +
                "{" +
                "    print[\"one\"];" +
                "    error[\"fail\"];" +
                "    print[\"two\"]; " +
                "}" +
                "foo[];" +
                "print[\"three\"];",
                "fail",
                "one");
	}
	
	private void explain(String programSource)
	{
		underTest.parse(programSource, new PrintingParseListener());
	}
		
	private void assertOutput(String programSource, String... expectedOutputs)
	{
        ExecutionContext context = new ExecutionContext();

        Environment environment = SystemEnvironment.createSystemEnvironment();
        Scope systemScope = SystemEnvironment.createSystemScope();
        environment.reassignValue(systemScope.indexOf("print"), new PrintFunction(capturingPrintStream));

        underTest.execute(programSource, context, environment);
		
		for(String expectedOutput: expectedOutputs)
		{
			Assert.assertEquals(expectedOutput, capturingPrintStream.next());
		}
		Assert.assertFalse(capturingPrintStream.hasNext());
        Assert.assertFalse(context.hasError());
	}
	
	
	private void assertError(String programSource, String expectedError, String... expectedOutputs) {
        ExecutionContext context = new ExecutionContext();

        Environment environment = SystemEnvironment.createSystemEnvironment();
        Scope systemScope = SystemEnvironment.createSystemScope();
        environment.reassignValue(systemScope.indexOf("print"), new PrintFunction(capturingPrintStream));

        underTest.execute(programSource, context, environment);
		
		Assert.assertTrue(context.hasError());
		Assert.assertEquals(expectedError, context.getError());
        for(String expectedOutput: expectedOutputs)
        {
            Assert.assertEquals(expectedOutput, capturingPrintStream.next());
        }
        Assert.assertFalse(capturingPrintStream.hasNext());
	}


	private static class CapturingPrintStream implements Printer
	{
		private final List<String> printed = new ArrayList<String>();
		private int next = 0;
		
		@Override
		public void println(String toPrint) {
			printed.add(toPrint);
		}

		public String next()
		{
			String toReturn = printed.get(next);
			next++;
			return toReturn;
		}
		
		public boolean hasNext()
		{
			return next < printed.size();
		}
	}
}
