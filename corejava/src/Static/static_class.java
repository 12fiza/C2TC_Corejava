package Static;

public class static_class {
	static int age;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		static_class ob=new static_class();
		static_class ob1= new static_class();
		ob.age=20;
		ob1.age=30;
		System.out.println("age is:"+ob.age);
		System.out.println("age is:"+ob1.age);

	}

}
