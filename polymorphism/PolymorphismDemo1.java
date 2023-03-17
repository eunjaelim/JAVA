package org.opentutorials.javatutorials.polymorphism;

class A{
	
	public String x(){
		return "A.x";  // 부모
	}
}

class B extends A{  // 자식 - 부모 오버라이딩
	public String x() {return "B.x";}  // A의 형식을 따르나 A의 형식으로 오버라이딩 된 메소드는 호출 가능
}

class B2 extends A{
	public String x() {return "y";} // 자식 - 부모 오버라이딩
}


public class PolymorphismDemo1 {
	public static void main(String[] args) {
		A obj = new B();
		A obj2 = new B2();
		System.out.println(obj.x());
		System.out.println(obj2.x());
	}
}
