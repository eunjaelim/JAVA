package org.opentutorials.javatutorials.finals;

class Calculator {
	static final double PI = 3.14; // 3.14라는 값은 모든 인스턴스에서 공유할 수 있는 바뀌지 않는 값 // 상속금지
	int left, right;
	
	public void setOperands(int left, int right) {
		this.left = left;
		this.right = right;
		//Calculator.PI = 6; // error
	}
	public void sum() {
		System.out.println(this.left+this.right);
	}
	public void avg() {
		System.out.println((this.left+this.right)/2);
	}
	
}

public class Final {

	public static void main(String[] args) {
		
	}

}
