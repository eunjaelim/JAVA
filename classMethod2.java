package javatutorial;

public class classMethod2 {
    public void fullThrottle() {
    	System.out.println("The car is going as fast as it can!");
    }
    
    public void speed(int maxSpeed) {
    	System.out.println("Max speed is : " + maxSpeed);
    }
    
    
    
	public static void main(String[] args) {
		classMethod2 myCar = new classMethod2();
		myCar.fullThrottle();
		myCar.speed(200);

	}

}
