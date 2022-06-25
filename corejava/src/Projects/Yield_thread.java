package Projects;

public class Yield_thread implements Runnable{
public void run()
	{
		System.out.println(Thread.currentThread());
		Thread.yield();
		System.out.println(Thread.currentThread());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Yield_thread a=new Yield_thread ();
		Thread t=new Thread(a,"chlid1");
		Yield_thread  b=new Yield_thread ();
		Thread t1=new Thread(b,"chlid2");
		t.start();
		t1.start();
		
	}

}