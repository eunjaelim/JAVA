package org.opentutorials.javatutorials.polymorphism;

interface father{}
interface mother{}
interface programmer{// 부모
	public void coding();
}

interface believer{}

class Steve implements father,programmer,believer{

	public void coding() {	
		System.out.println("fast");  // 오버라이딩
	}
	
}

class Rachel implements mother,programmer{
	public void coding() {
		System.out.println("elegance"); // 오버라이딩
	}
}

public class Workspace {

	public static void main(String[] args) {
		programmer employee1 = new Steve();
		programmer employee2 = new Rachel();
		
		employee1.coding();
		employee2.coding();
		
	}

}
