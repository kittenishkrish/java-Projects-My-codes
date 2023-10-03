package inheritanceProblems;

public class Parent
{
public int salary = 25000;
 
 public static void main(String[] args)
 {
	 Parent p = new Parent();
	 p.work();
	 p.ride();
	 System.out.println(p.salary);
 }
 public void work() 
 {
	 System.out.println("work");
 }
 public void ride() 
 {
	 System.out.println("ride");
 } 
}
