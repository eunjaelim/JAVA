package org.opentutorials.javatutorials.abstractclass.example1;

/* abstract */

abstract class A{
	public abstract int b();
	// 메소드 없이 추상적인 구조
	// public abstract int c(){System.out,println("Hello");} // 구체적 내용 컨테이너 오류
	
	public void d() {
		System.out.println("World"); // abstract 없는 메소드 로직을 가질 수도 있음
	}
}

class B extends A{ // abstract 클래스는 상속해서 사용해야 함 // 상속을 강제함
	public int b() { // 오버라이딩 해야 함 본체를 구체적으로 적어줘서 사용
		return 1;
	}
}

public class AbstractDemo {
	public static void main(String[] args) {
		// A obj = new A(); // 상속하지 않은 메소드 사용 오류
		B obj = new B();
		obj.d();
	}
}
