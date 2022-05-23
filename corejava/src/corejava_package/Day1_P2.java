package corejava_package;
class withdraw
{
	int amt_withdraw=2000;
}

public class Day1_P2 extends withdraw{
	int amt_left=5000;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Day1_P2 ob1=new Day1_P2();
		System.out.println("withdraw amount:"+ob1.amt_withdraw);
		System.out.println("balance amount:"+ob1.amt_left);

	}

}
