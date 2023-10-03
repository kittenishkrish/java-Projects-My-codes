package inheritanceProblems;
//Hierarchical inheritance

public class Child2 extends Parent
{

public static void main(String[] args)
{
	Child2 ch =new Child2();
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
