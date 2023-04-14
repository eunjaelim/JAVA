package org.opentutorials.javatutorials.generic;



public class GenericExample {	

	
	private static <T,V> void shout (T ThingToShout,V otherThingToShout) {
		System.out.println(ThingToShout+"!!!");
		System.out.println(otherThingToShout+"@@@@");
	}
	
	private static void printList(List<?> myList) {
		System.out.println();
}
	
	
	public static void main(String[] args) {	
		shout("John",74);
	}
	
	List<Integer> intList = new ArrayList<>();

	

}
