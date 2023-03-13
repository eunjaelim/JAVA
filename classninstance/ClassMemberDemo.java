package org.opentutorials.javatutorials.classninstance;

class c1{
	static int static_variable = 1;
	int instance_variable = 2;
	static void static_static() {
		System.out.println(static_variable);
		// 클래스 메서드에서 클래스 변수에 접근할 수 있다.
	}
	static void static_instance() {
		//System.out.println(instance_variable);
		// 클래스 메소드에서는 인스턴스 변수에 접근할 수 없다 .
		
	}
	void instance_static() {
		System.out.println(static_variable);
		//인스턴스 메소드에서 클래스변수에 접근할 수 있다
	}
	void instance_instance() {
		System.out.println(instance_variable);
	}
	
	
}

public class ClassMemberDemo {
	public static void main(String[] args) {
		c1 c = new c1();
		//c.static_static();//성공
		//c.static_instance(); //실패
		//c.instance_static();//성공
		//c.instance_instance();//성공
		//c1.static_static(); //직접 클래스메소드에서 클래스 변수에 접근 성공
		//c1.static_instance();// 직접 클래스메소드에서 인스턴스 메소드에 접근 실패
		//c1.instance_static();//실패
		//c1.instance_instance();//실패
		
	}
}
