package Projects;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating hashset object 
		HashSet<String> set = new HashSet<String>();
		//adding elements to hashset
		set.add("JAVA");
		set.add("JSP");
		set.add("Spring");
		set.add("Hibernate");
		set.add("JSP");
		set.add("JAVA");
		set.add(null);
		set.add(null);
		set.add(null);
		//Printing the elements of hashset
		System.out.println(set);
		Iterator<String> itr=set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
