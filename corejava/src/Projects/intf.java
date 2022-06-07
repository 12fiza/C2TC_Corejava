package Projects;

interface frst{
	public void method1();
	public void method2();
}
class intf implements frst{
	public void method1()
	{
		System.out.println("implements method1");
	}
	public void method2()
	{
		System.out.println("implements method2");
	}


	public static void main(String[] args) {
		intf i = new intf();
		i.method1();
		i.method2();
		// TODO Auto-generated method stub

	}
	}

