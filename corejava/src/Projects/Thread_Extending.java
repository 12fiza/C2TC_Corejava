package Projects;

public class Thread_Extending extends Thread {
	public void run()
	{
		System.out.println("hello");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread t=new Thread_Extending();
		t.start();
	}

}
