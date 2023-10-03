package abstractExample;

public class Developer2 extends Worker {

	public static void main(String[] args) {
		Developer2 work = new Developer2();
		work.getLeaves();
		work.getHike();
		work.workingHours();

	}

	public void workingHours() {
		System.out.println("Project under frontend");
	}

}

//Abstract Class Determination
