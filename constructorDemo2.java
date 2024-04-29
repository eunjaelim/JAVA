package javatutorial;
   
public class constructorDemo2 {
	
	int modelYear;
	String modelName;
	public constructorDemo2(int year, String name) {
		modelYear = year;
		modelName = name;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		constructorDemo2 myCar = new constructorDemo2(1992,"Mustang");
		System.out.println(myCar.modelYear+" "+myCar.modelName);
	}

}
