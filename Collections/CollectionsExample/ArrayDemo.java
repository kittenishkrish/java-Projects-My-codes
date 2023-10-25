 package CollectionsExample;

import java.util.Arrays; // method overloading example

public class ArrayDemo {

	public static void main(String[] args) {
		//TODO Auto-generated method stub
		int[] arr = {9,6,4,3,8,4};
		for(int i : arr)
			System.out.println(i);
         Arrays.sort(arr);
         for(int i : arr)
        	System.out.println("after sorting; " + i );
         
          String[] names = {"Suriya","Kevin","Murali"};
          System.out.println("before Sort");
          
          for(String s : names)
        	  System.out.println(s);
        	  
         Arrays.sort(names);
         System.out.println("After Sort");
         for(String s : names)
       	  System.out.println(s);  	  
      
	}

}

