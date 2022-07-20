package StreamAPI;

import java.util.Arrays;
import java.util.List;

public class java8streams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> strList=Arrays.asList("abc","","bcd","","defg","jk");
		long count=strList.stream().filter(x->x.isEmpty()).count();
		System.out.println("list %s has %d empty strings in ",strList,count);
		long num=strList.stream().filter(x->x.length()>3).count();
		System.out.println("list  ");
				
		
				

	}

}
