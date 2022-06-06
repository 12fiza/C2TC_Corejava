package Projects;
import java.util.Scanner;

public class Commission {
	String Name;
	String Address;
	int phone;
	float sales_amt;
	
	void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name");
		Name = sc.nextLine();
		
		System.out.println("Enter the Address");
		Address = sc.nextLine();
		
		System.out.println("Enter the Phone number");
		phone = sc.nextInt();
	}
	void compute()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Sales Amount");
		sales_amt = sc.nextFloat();
	if(sales_amt>=100000)
	{
		System.out.println("Commission = 10%");
	}
	else if(sales_amt < 100000 && sales_amt>=50000)
	{
		System.out.println("Commision = 5%");
	}
	else if( sales_amt < 50000 && sales_amt>=30000)
	{
		System.out.println("Commission = 3%");
	}
	else
	{
		System.out.println("No Commission");
	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Commission com = new Commission();
		com.input();
		com.compute();

	}

}
