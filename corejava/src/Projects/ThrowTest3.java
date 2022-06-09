package Projects;
import java.io.IOException;
public class ThrowTest3 {
	static void display() throws IOException
	{
		System.out.println("hello java");
		throw new IOException();
	}

	public static void main(String[] args) {
			// TODO Auto-generated method stub
		ThrowTest3 obj=new ThrowTest3();
		try {
			obj.display();
		}
		catch(IOException e)
		{
			System.out.println("caught an exception\n" +e);
		}

	}

}
