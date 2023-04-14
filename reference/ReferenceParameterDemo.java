package org.opentutorials.javatutorials.reference;

public class ReferenceParameterDemo {

	static void _value(int b) {
		b = 2;
		System.out.println("_Value:"+b);
	}
	
	public static void runValue() {
		int a = 1;
		_value(a);
		System.out.println("runValue:"+a);
	}
	
	static void _reference1(A b) {
		b = new A(2);
	}
	
	public static void runReference1() {
		A a = new A(1);
		_reference1(a);
		System.out.println("runReference1, "+a.id); 
	}
	
	public static void mian(String[] args) {
		runValue();
		runReference1();
		
	}
}
