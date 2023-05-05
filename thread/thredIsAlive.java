package javaprograming;

public class thredIsAlive extends Thread {
	public static int amount = 0;
	public static void main(String[] args) {
		thredIsAlive thread = new thredIsAlive();
		thread. start();
		
		while(thread.isAlive()) {
			System.out.println("Waiting...");}
		System.out.println("thredIsAlive: "+amount);
		amount++;
		System.out.println("thredIsAlive:" +amount);
	}
	public void run(){
		amount++;}
	}


