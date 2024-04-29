package javatutorial;

public class classAttributes {
		int x = 5;
		int y = 3;
		int z;
		String fname = "Jhon";
		String lname = "Doe";
		int age =24;
		
	public static void main(String[] args) {
		classAttributes myObj3 = new classAttributes();
		System.out.println(myObj3.x);
		classAttributes myObj4  = new classAttributes();
		classAttributes myObj5 = new classAttributes();
		myObj4.z = 6;
		System.out.println(myObj4.z);
		myObj4.x = 25;
		System.out.println(myObj4.x);
	
		
		myObj4.x =10000;
		System.out.println(myObj3.x);
		System.out.println(myObj4.x);
		
		System.out.println("Name: "+ myObj4.fname+" "+myObj4.lname);
		System.out.println("Age : "+ myObj4.age);
		
	}

}
