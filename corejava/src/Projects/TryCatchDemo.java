package Projects;

public class TryCatchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=null;
		try {
			str.equals("hello");
		}catch(NullPointerException ne) {
			str=new String("hello");
					System.out.println(str.equals("hello"));
		}
		System.out.println("continuing the program");

	}

}
