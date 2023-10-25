package CollectionsExample;
import java.util.*;

public class stackExamples {

	public static void main(String[] args) {
		
		Stack<String> stack = new Stack<String>();
		
		System.out.println(stack.isEmpty());
		
		stack.push("Minecraft");
		stack.push("PUBG");
		stack.push("DOOM");
		stack.push("COD");
		stack.push("ETS");
		
		System.out.println(stack);
		System.out.println(stack.peek());
		String pop = stack.pop();
		System.out.println(pop);
		System.out.println(stack.search("Minecraft"));
		
		
	}

}
