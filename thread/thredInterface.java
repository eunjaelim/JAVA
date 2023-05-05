package javaprograming;

public class thredInterface implements Runnable {
	public static void main(String[] args) {
		thredInterface obj = new thredInterface();
		Thread thread = new Thread(obj);
		thread.start();
		System.out.println("This code is running in a thread");
		
	}

	
	public void run() {
		System.out.println("This code is running in a thread");		
	}
}
