package CollectionsExample;
import java.util.*;

public class HashsetExample {
	
	public static void main (String[] args) {
		
		Set<Integer> id = new HashSet<>();
		
		id.add(1);
		id.add(2);
		id.add(3);
		id.add(4);
		id.add(5);
		id.add(6);
		
		
		//Enhanced for loop
		for(int i :id) {
			System.out.println(i);
		}
		
		//using LambdaExpression
		id.forEach(System.out::println);
		
		//Through Iterator
		
		Iterator<Integer> ID = id.iterator();
		while(ID.hasNext()) {
			System.out.println(ID.next());
		}
	}

}
