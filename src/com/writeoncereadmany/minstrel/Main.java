package com.writeoncereadmany.minstrel;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		if(args.length != 1) 
		{
			System.out.println("Usage: minstrel <filename>");
			return;
		}
		Scanner scanner = new Scanner(new File(args[0]));
		scanner.useDelimiter("\\z");
		String program = scanner.next();
	}

}
