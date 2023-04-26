package Day12;

public class UsingRunnable implements Runnable {
	Thread t;
	int h, l;
	String msg;
	 
	public UsingRunnable(int h, int i, String string) {
		this.h=h;
		this.l=l;
		this.msg=msg;
		t=new Thread(this,"Child Thread");
		t.start();
		
	}
    
	public void run() {
    	for(int i=h;i>l;i--) {
    		try {
    		Thread.sleep(20000);
    	}catch (InterruptedException e) {
    		System.err.println(e.getMessage());
    	}
    	System.out.println(msg + i);
    	}
    }
}
