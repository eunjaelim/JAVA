package org.opentutorials.javatutorials.array;

public class DefineDemo {
	public static void main(String[] args) {
		//String[] ClassGroup = {"최진혁","최유빈","한이람","이고잉"};	
		String[] ClassGroup = new String[4];
		ClassGroup[0] = "최진혁";
		System.out.println(ClassGroup.length); // 몇개의 값을 수용?
		ClassGroup[1] = "최유빈";
		System.out.println(ClassGroup.length);
		ClassGroup[2] = "한이람";
		System.out.println(ClassGroup.length);
		ClassGroup[3] = "이고잉";
		System.out.println(ClassGroup.length);
		}
}
