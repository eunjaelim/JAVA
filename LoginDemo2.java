package org.opentutorials.javatutorials.condition;

public class LoginDemo2 {

	public static void main(String[] args) {
		String id = args[0];
		String password = args[1];
		if (id.equals("eunjaelim")) {
			System.out.println("right");
			if (password.equals("3511")) {
				System.out.println("right");
			}
			else {
				System.out.println("Wrong");
			}
	}else {
		System.out.println("Wrong");
	}

	}
}