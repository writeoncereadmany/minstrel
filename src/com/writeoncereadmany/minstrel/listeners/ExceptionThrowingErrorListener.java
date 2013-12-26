package com.writeoncereadmany.minstrel.listeners;

import java.util.BitSet;

import com.writeoncereadmany.minstrel.listeners.exceptions.MinstrelParseException;
import org.antlr.v4.runtime.ANTLRErrorListener;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.misc.Nullable;

public class ExceptionThrowingErrorListener implements ANTLRErrorListener {

	@Override
	public void reportAmbiguity(@NotNull Parser arg0, @NotNull DFA arg1,
			int arg2, int arg3, boolean arg4, @NotNull BitSet arg5,
			@NotNull ATNConfigSet arg6) {
	}

	@Override
	public void reportAttemptingFullContext(@NotNull Parser arg0,
			@NotNull DFA arg1, int arg2, int arg3, @Nullable BitSet arg4,
			@NotNull ATNConfigSet arg5) {
	}

	@Override
	public void reportContextSensitivity(@NotNull Parser arg0,
			@NotNull DFA arg1, int arg2, int arg3, int arg4,
			@NotNull ATNConfigSet arg5) {
	}

	@Override
	public void syntaxError(Recognizer<?, ?> arg0, @Nullable Object arg1,
			int line, int column, String errorMessage, @Nullable RecognitionException arg5) {
		throw new MinstrelParseException(errorMessage + " at line " + line + ":" + column);
	}

}
