package Day12;

public class ThreadLifeCycleDemo {
	public void run() throws InterruptedException {
		System.out.println("Inside run()thread is alive or not?"+this.isAlive());
		int num=0;
		while(num<4)
		{
			num++;
			System.out.println("num ="+num);
			sleep(1000);
			System.out.println("Inside runnable()thread is alive or not?"+this.isAlive());
			}
		}
	private void sleep(int i) {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[]args) {
		ThreadLifeCycleDemo myThread = new ThreadLifeCycleDemo();
		System.out.println("Before runnable() thread is alive or not?"+myThread.isAlive());
		myThread.start();
		try {
			Thread.sleep(2000);
		}catch (InterruptedException e) {
			System.err.println(e.getMessage());
			
		}
		System.out.println("After complition thread is alive or not?"+myThread.isAlive());
		
	}
	private void start() {
		// TODO Auto-generated method stub
		
	}
	private String isAlive() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
