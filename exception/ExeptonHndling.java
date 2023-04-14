package org.opentutorials.javatutorials.exception;

public class ExeptonHndling {

	public static void main(String[] args) {
		
		
		try {
			int myInt = Integer.parseInt("1");
		}
		catch(Exception e) {
			System.out.println("Hey dude, you can't make an int");
		}
		finally {
			System.out.println("in the finally block");
		}
		System.out.println("End here");
	}

}
