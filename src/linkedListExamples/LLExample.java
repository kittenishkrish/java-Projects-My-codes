package linkedListExamples;

import java.util.*;

public class LLExample {

	public static void main(String[] args) {

		LinkedList<String> list = new LinkedList<String>();

		list.add("JAVA");
		list.add("C");
		list.add("PYTHON");
		list.add("C#");
		list.add("C++");

		System.out.println("Before adding value " + list);

		list.add(0, "Programming Languages");
		System.out.println("After adding value " + list);

		LinkedList<String> list1 = new LinkedList<String>();
		list1 = (LinkedList<String>) list.clone();
		System.out.println("After Cloning value " + list1);

		System.out.println("index value " + list.indexOf("PYTHON"));

		list.offerFirst("Welcome to");
		System.out.println("First value " + list);

		list.offerLast("are Popular Languages");
		System.out.println("Last value " + list);

		list.remove("C");
		System.out.println("After removing value " + list);

		System.out.println(list.size());

		// Array to LinkedList Conversion
		String[] names = { "Krishna", "Kevin", "Suriya" };
		List<String> empnames = new LinkedList<String>();
		for (String s : names) {
			empnames.add(s);
		}
		System.out.println(empnames);

		// LinkrdList to Array Conversion
		List<Integer> ID = new LinkedList<Integer>();
		ID.add(121);
		ID.add(122);
		ID.add(123);
		ID.add(121);

		Integer[] empID = ID.toArray(new Integer[ID.size()]);
		for (int i : empID) {
			System.out.println(i);
		}
		//set used to remove duplicate values 
		Set<Integer> Id = new HashSet<>(ID);
	 //Id.addAll(ID);
		System.out.println(Id);
	}
}
