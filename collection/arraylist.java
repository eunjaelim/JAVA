package collection;

import java.util.ArrayList;

public class arraylist {

	public static void main(String[] args) {
		String[] arrayObj = new String[2];
		arrayObj[0] = "one";
		arrayObj[1] = "two";
		//arrayObj[3] = "three"; // 범위를 넘어서는 오류
		for(int i = 0; i < arrayObj.length;i++) {
			System.out.println(arrayObj[i]);
		}
		
		
		ArrayList<String> a1 = new ArrayList<String> (); // 제네릭과 함께 사용
		a1.add("one");
		a1.add("two");
		a1.add("three");
		for(int i = 0; i<a1.size();i++) {
			String value = a1.get(i); // 디폴트 object 값이므로 string과 호환되지 않음,형변환필요
			System.out.println(value);
		}
	}
	

}
