package org.opentutorials.javatutorials.conditionaloperator;

public class LoginDemo4 {

	public static void main(String[] args) {
		String id = args[0];
		String password = args[1];
		if((id.equals("lim") || id.equals("Kim") || id.equals("Jin"))
			&& password.equals("351153")){
			System.out.println("right");
			
		}
		else {
			System.out.println("Wrong");
		}

	}

}
