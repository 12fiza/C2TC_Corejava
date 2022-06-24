package Projects;

public class runnable  implements Runnable
{
	public void run()
	{
		System.out.println("hello");
	
	try
	{
		Thread.sleep(2000);
	}
	catch(InterruptedException ie) {
		System.out.println(ie.getMessage());
	}System.out.println("java");
	System.out.println(Thread.currentThread());
}
void m1()
{
	System.out.println("m1 method");
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		runnable a= new runnable();
		Thread t=new Thread(a,"child Thread");
		t.start();
		System.out.println("number of active threads:"+Thread.activeCount());
		a.m1();
		

	}

}
