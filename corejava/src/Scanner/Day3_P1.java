package Scanner;
import java.util.*;

public class Day3_P1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name");
		String n= sc.nextLine();
		System.out.println("my name is"  +n);
		System.out.println("enter your id" );
		int i =sc.nextInt();
		System.out.println("id is :"+i);
		System.out.println("enter your marks");
		float a ,b  =sc.nextFloat();
		//float b=sc.nextFloat();
		System.out.println("enter the character");
		char c=sc.next().charAt(1);
		System.out.println("C="+c);

	}

}
