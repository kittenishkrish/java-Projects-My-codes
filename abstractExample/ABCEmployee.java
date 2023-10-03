package abstractExample;

public class ABCEmployee implements EmployeeRules, FamilyRules {

	public static void main(String[] args) {
		ABCEmployee abc = new ABCEmployee();
		abc.relocate();
		abc.dresscode();
		abc.eatTogether();
		abc.spendTimeWithParents();

		FamilyRules father = new ABCEmployee();
		father.eatTogether();

		System.out.println(EmployeeRules.salary);
		System.out.println(EmployeeRules.leaves);
	}

	public void maintainHours() {
		System.out.println("45 Hours");
	}

	public void dresscode() {
		System.out.println("Professional Way of Dressing");
	}

	public void relocate() {
		System.out.println("Any location in india");
	}

	public void report() {
		System.out.println("Manager");
	}

	public void takeCareParents() {
		System.out.println("taking care of Parents");
	}

	public void eatTogether() {
		System.out.println("Eating together with family Members");
	}

	public void spendTimeWithParents() {
		System.out.println("Spending time with Parents");
	}

}

//interface Class Determination
