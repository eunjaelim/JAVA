package org.opentutorials.javatutorials.exception;
import java.io.*;

class CharInput{
	int nInput = 0;
	public char getInput() throws IOException {
		nInput = System.in.read();
		return (char)nInput;
	}
}

public class MyExceptionTest {
	public static void main(String args[]) {
		CharInput CharInput = new CharInput();
		try {
			System.out.println(CharInput.getInput());
		} catch(IOException ex){
			System.out.println(ex);
		}
		
		
		}
	}

