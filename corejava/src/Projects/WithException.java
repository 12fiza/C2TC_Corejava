package Projects;

public class WithException {

	public static void main(String[] args) {
		int d=0,a;
		try {
			a=42/d;
			System.out.println("This will not be printed");
		}catch(ArithmeticException e) {
			System.out.println("Division by zero");
		}
		System.out.println("this will be printed");
		
		// TODO Auto-generated method stub

	}

}
