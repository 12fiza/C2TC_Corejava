package BufferedReader;

import java.util.Scanner;
public class Day3_P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//InputStreamReader=new InputStreamReader(System.in);
		//BufferedReader br=new BufferedReader(System.in);
		//System.out.println("enter your name");
		//System.out.println();
		Scanner reader= new Scanner(System.in);
		System.out.println("enter an integer");
		boolean b=reader.hasNextInt();
		System.out.println("you entered an integer "+b);

	}

}
