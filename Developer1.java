package abstractExample;

public class Developer1 extends Worker {

	public static void main(String[] args) {
		Developer1 work = new Developer1();
		work.getLeaves();
		work.getHike();
		work.workingHours();

	}

	public void workingHours() {
		System.out.println("Project under Backend");
	}

}

//Abstract Class Determination