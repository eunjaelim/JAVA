package javatutorial;

public class StringType {

	public static void main(java.lang.String[] args) {
		
		String txt = "ASDFASDFASDFASDFASDFSAF";
		System.out.println("The length of the txt string is " + txt.length());
		
		String txt1 = "Hello World";
		System.out.println(txt1.toUpperCase());
		System.out.println(txt1.toLowerCase());
		
		String txt2 = "please locate where 'locate' occurs!";
		System.out.println(txt2.indexOf("locate"));

	}

}
