package inheritanceProblems;
//Multilevel inheritance

public class GrandChild extends Child {

	public static void main(String[] args)
	{
		GrandChild ch =new GrandChild();
		ch.play();
		ch.work();
		ch.ride();	
		System.out.println(ch.salary);
		
	} 
		
	public void play()
	{
		System.out.println("playing");
	}
	public void study()
	{
		System.out.println("studying");
	}
}
