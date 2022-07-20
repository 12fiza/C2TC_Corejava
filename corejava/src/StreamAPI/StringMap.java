package StreamAPI;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
public class StringMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>fruits=new ArrayList<String>();
		fruits.add("apple");
		fruits.add("banana");
		fruits.add("cherry");
		Stream<String>stream=fruits.stream();
		Stream<String>stringStream=stream.map((value)->{return value.toLowerCase();});
		stringStream.forEach(System.out::println);
		

	}

}
