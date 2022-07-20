package StreamAPI;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class StringFilter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>numbers=new ArrayList<Integer>();
		numbers.add(100);
		numbers.add(200);
		numbers.add(300);
		numbers.add(400);
		List<Integer>newlist=numbers.stream().filter(n->n>110).collect(Collectors.toList());
		System.out.println(newlist);

	}

}
