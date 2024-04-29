package javatutorial;

public class classMethod {
	
	static void myStaticMethod() {
	    System.out.println("Hello World");
	}
	
	public void myPublicMethod() {
		System.out.println("Public method be called by creating objects");
	}
	
		
public static void main(String[] args) {
	myStaticMethod();
	
	classMethod myObj = new classMethod();
	myObj.myPublicMethod();

	}

}
