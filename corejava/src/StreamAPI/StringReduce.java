package StreamAPI;
//import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import java.util.Optional;
public class StringReduce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>numbers=new ArrayList<Integer>();
		numbers.add(100);
		numbers.add(200);
		numbers.add(300);
		numbers.add(400);
		System.out.println(numbers);
		Stream<Integer>stream=numbers.stream();
		Optional<Integer>sum=stream.reduce(Integer::sum);
		System.out.println("ans="+sum.get());
	}

}
