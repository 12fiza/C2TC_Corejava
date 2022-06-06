package Static;  

public class finalvariable{
     int speedlimit=90;//final variable
	void run() {
		speedlimit=400;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		finalvariable obj=new finalvariable();
		obj.run();
		
		
	}

}
