package javatutorial;

public class arrays {

	public static void main(String[] args) {
		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		int[] myNum = {10,20,30,40};
		
		System.out.println(cars[1]);
		
		cars[0] = "Opel";
		System.out.println(cars[0]);
		System.out.println(cars.length);
		for(String i:cars) {
			System.out.println(i);
			
			
		}
		
		int[][] myNumbers = {{1,2,3,4},{5,6,7}};
//		myNumbers[1][2]=9;
//		System.out.println(myNumbers[1][2]);
//		
//		for(int i = 0; i < myNumbers.length;i++) {
//			for(int j=0; j < myNumbers[i].length;++j) {
//				System.out.println(myNumbers[i][j]);
//			}
		for(int[] row : myNumbers) {
			for(int i : row) {
				System.out.println(i);
			}
				
		}
		
		}

	}


