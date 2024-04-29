package javatutorial;

public class methodDemo {

	
	static void myFamily(String name , int age){
		System.out.println("My Family's name is "+name + " and age  is "+age );
	}
	
	static int plus(int x, int y) {
		return x+y;
		}
	// Overloding
	static double plus(double x, double y) {
		return x+y;
		}
	
	static void checkAge(int age) {
		if(age<18) {
			System.out.println("Access denied - You are not old enough!");
		}
		else {
			System.out.println("Access granted - You are old enough!");
		}
	}
	
	public static void main(String[] args) {
		myFamily("eunjae",33);
		myFamily("seokjun",29);
		myFamily("seoula",8);
		myFamily("sua",7);
		checkAge(29);
	
		
	    int z1 = plus(3,5);
	    double z2 = plus(3.4,54.5);
	    System.out.println("int : "+z1);
	    System.out.println("double : "+z2);
	    
	    int result = sum(10);
	    System.out.println(result);
	    int result1 = sum(5,10);
	    System.out.println(result1);
	    
	    
	}
	public static int sum(int k) {
		if (k>0) {
			return k + sum(k-1);
		}else {
			return 0;
		}
	}
	
	public static int sum(int start, int end) {
		if(end>start) {
		return start+sum(end-1);
		}
		else {
			return 0;
		}
	}

}
