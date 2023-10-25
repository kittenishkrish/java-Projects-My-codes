package CollectionsExample;
import java.util.HashMap;

public class HashMapExample {

	public static void main(String[] args) {
	
		
		HashMap <Integer,String> student = new HashMap<>();
		
		student.put(1234,"Krish");
		student.put(1235,"Murali");
		student.put(1236,"joe");
		student.put(1237,"Kevin");
		student.put(1238,"Suriya");
		
		System.out.println(student);
		
		student.put(1235,"Faisel");
		
		System.out.println(student);
		
		System.out.println(student.containsKey(1234));
		System.out.println(student.containsValue("Kevin"));
		
	}

}
