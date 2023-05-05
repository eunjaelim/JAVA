package javaprograming;

public class thred extends Thread {
	
  public static void main(String[] args) {	
	 thred obj = new thred();
	 Thread thread = new Thread(obj);
	 thread.start(); // 스레드의 시작
	 System.out.println("This code is running in a thread");
	
  }
	
  public void run() {
		System.out.println("This code is running in a thread");
	}	
}
