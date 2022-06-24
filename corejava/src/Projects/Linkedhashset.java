package Projects;
import java.util.*;
import java.util.Iterator;

public class Linkedhashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String> lhs =new LinkedHashSet<String>();
		lhs.add("JAVA");
		lhs.add("JSP");
		lhs.add("Spring");
		lhs.add("Hibernate");
		lhs.add("JSP");
		lhs.add("JAVA");
		lhs.add(null);
		lhs.add(null);
		lhs.add(null);
		//Printing the elements of hashset
		System.out.println(lhs);
		Iterator<String> itr=lhs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());

	}

	}
}


	
