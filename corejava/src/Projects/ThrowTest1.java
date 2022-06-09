package Projects;

public class ThrowTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			ArithmeticException a=new ArithmeticException("Hello From throw");
			throw a;
		}
		catch (ArithmeticException a)
		{
			System.out.println("arithmetic expression caught" +a);
			System.out.println(a.getMessage());
		}

	}

}
