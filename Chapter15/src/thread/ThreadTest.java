package thread;

class MyThread implements Runnable{

	
	public void run() {
		int i;
		
		for( i=0; i<=200; i++) {
			System.out.print(i + "\t");
			
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}


public class ThreadTest {

	public static void main(String[] args) {

		System.out.println("start");
		/*MyThread th1 = new MyThread();
		MyThread th2 = new MyThread();
		
		th1.start();
		th2.start();*/
		
		/*MyThread runner1 = new MyThread();
		Thread th1 = new Thread(runner1);
		th1.start();
		
		
		MyThread runner2 = new MyThread();
		Thread th2 = new Thread(runner2);
		th2.start();*/
		
		Thread t = Thread.currentThread();
		System.out.println(t);
		
		System.out.println("end");
		
	}

}
