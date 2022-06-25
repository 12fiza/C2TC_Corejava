package Projects;
import java.util.*;
public class MainVector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Stack<String> stack = new Stack<String>();
stack.push("fiza");
stack.push("T");
stack.push("dfhft");
stack.push("yrde");
stack.push("etgr");
System.out.println(stack);

System.out.println(stack.peek());
System.out.println(stack.empty());
stack.pop();
System.out.println(stack);
System.out.println(stack.pop());
Iterator<String>itr = stack.iterator();
while(itr.hasNext()) {
	System.out.println(itr.next()+" ");
	
	
}System.out.println(stack.search("T"));
	}
}
