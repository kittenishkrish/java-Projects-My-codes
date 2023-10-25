package CollectionsExample;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.PriorityQueue;


public class allCollectionsInOne {

	public static void main(String[] args) {
		
		ArrayList <String> List = new ArrayList<>();
		
		List.add("Krish");
		List.add("Suriya");
		List.add("Kevin");
		List.add("Faisel");
		List.add("Thomas");
		Collections.sort(List);
		System.out.println(List);
		Collections.reverse(List);
		System.out.println(List);
		System.out.println("ArrayList : " + List);
		
		// Printing the sorted list
		List.sort((s1, s2) -> s1.compareTo(s2));
		System.out.println("Sorting using Lambda Expression : " + List);
	
		LinkedList <String> List1 = new LinkedList<>();
		
		List1.add("Krish");
		List1.add("Suriya");
		List1.add("Kevin");
		List1.add("Faisel");
		List1.add("Thomas");
		
		System.out.println("LinkedList : " +List1);
		
		HashSet<String> List2 = new HashSet<>();
		
		List2.add("Krish");
		List2.add("Suriya");
		List2.add("Kevin");
		List2.add("Faisel");
		List2.add("Thomas");
		
		System.out.println("HashSet : "+List2);
		
		LinkedHashSet<String> List3 = new LinkedHashSet<>();
		
		List3.add("Krish");
		List3.add("Suriya");
		List3.add("Kevin");
		List3.add("Faisel");
		List3.add("Thomas");
		
		System.out.println("LinkedHashSet : "+ List3);
		
		TreeSet <String> List4 = new TreeSet<>();
		
		List4.add("Krish");
		List4.add("Suriya");
		List4.add("Kevin");
		List4.add("Faisel");
		List4.add("Thomas");
		
		System.out.println("TreeSet : "+ List4);
		
        HashMap <Integer,String> student = new HashMap<>();
		
		student.put(1234,"Krish");
		student.put(1235,"Faisel");
		student.put(1236,"joe");
		student.put(1237,"Kevin");
		student.put(1238,"Suriya");
		
		System.out.println("HashMap : "+ student);
		
		LinkedHashMap <Integer,String> student1 = new LinkedHashMap<>();
		
		student1.put(1234,"Krish");
		student1.put(1235,"Faisel");
		student1.put(1236,"joe");
		student1.put(1237,"Kevin");
		student1.put(1238,"Suriya");
		
		System.out.println("LinkedHashMap : "+ student1);
		
		TreeMap <Integer,String> student2 = new TreeMap<>();
		
		student2.put(1234,"Krish");
		student2.put(1238,"Faisel");
		student2.put(1237,"joe");
		student2.put(1236,"Kevin");
		student2.put(1235,"Suriya");
		
		System.out.println("TreeMap : "+ student2);
		
		ConcurrentHashMap<String, Integer> Map1 = new ConcurrentHashMap<>();

		Map1.put("Krish", 1234);
		Map1.put("Faisel", 1238);
		Map1.put("Suriya", 1235);
		
		System.out.println("ConcurrentHashMap : " + Map1);
		
		Queue <String> List5 = new LinkedList<>();
		
		List5.offer("Krish");
		List5.offer("Faisel");
		List5.offer("joe");
		List5.offer("Kevin");
		List5.offer("Suriya");
		
		System.out.println("Queue : "+ List5);
		
        Queue <String> List6 = new PriorityQueue<>();
		
		List6.offer("Krish");
		List6.offer("Faisel");
		List6.offer("joe");
		List6.offer("Kevin");
		List6.offer("Suriya");
		
		System.out.println("PriorityQueue : "+ List6);
		
	}
}
