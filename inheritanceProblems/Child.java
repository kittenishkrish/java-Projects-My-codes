package inheritanceProblems;
//single inheritance
//Method Overriding

public class Child extends Parent 
{

public static void main(String[] args)
{
	Child ch =new Child();
	ch.play();
	ch.work();
	ch.ride();	
	System.out.println(ch.salary);
	//Child ch =new Child();
}
public void work() // here we mention the work method as same as and achieve Method overriding
{
	 System.out.println("child class work");
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
