package org.opentutorials.javatutorials.classninstance;

public class Calculator {
	static double PI = 3.14;
	static int base = 0;
	int left ,right;
	
	public void setOperands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void sum() {
		System.out.println(this.left+this.right+base);
	}
	
	public void avg() {
		System.out.println((this.left+this.right+base)/2);
	}
	
	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		c1.setOperands(10, 20);
		Calculator.base = 10;
		c1.sum();
	
	}

}
