package org.opentutorials.javatutorials.conditionaloperator;

public class AndDemo {

	public static void main(String[] args) {
		if(true && true) {
			System.out.println(1); // 실행
		}
		if(true && false) {
			System.out.println(2);  // out
		}
		if(false && true) {
			System.out.println(3); // out
		}
		if(false && false) {
			System.out.println(4); // out
		}

	}

}
