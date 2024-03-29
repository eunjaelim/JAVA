package collection;

import java.util.*;

public class Maps {

	public static void main(String[] args) {
		HashMap<String,Integer> empIds = new HashMap<>();
		
		empIds.put("Jhon", 12345);
		empIds.put("Carl", 54321);
		empIds.put("Jerry", 8675309);
		
		System.out.println(empIds);
		System.out.println(empIds.get("Carl"));
		System.out.println(empIds.containsKey("George"));
		System.out.println(empIds.containsValue(8675309));
		
		empIds.put("Jhon", 98765);
		System.out.println(empIds);
		empIds.replace("Jhon", 7777);
		System.out.println(empIds);
		
		empIds.putIfAbsent("Steve", 222);
		System.out.println(empIds);
		
		empIds.remove("Steve");
		System.out.println(empIds);
	}

}
