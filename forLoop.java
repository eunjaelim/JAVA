package javatutorial;

public class forLoop {

	public static void main(String[] args) {
//		for(int i = 0; i<=10;i+=2) {
//			System.out.println(i);
//		}
		
		for (int i = 1; i<=2;i++) {
			
			System.out.println("Outer : " + i);
			
			for (int j = 1; j <= 3; j++) {
				
				System.out.print("Inner : " +j);
			}
		}

	}

}
