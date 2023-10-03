package constructorExample;

public class ICICICustomer {

	public static void main(String[] args) {
	ICICIBank icici = new ICICIBank();
	System.out.println(icici.getMinBalance());
	int MinBalance = icici.getMinBalance();
	//System.out.println(MinBalance);
	icici.setMinBalance();
	MinBalance = icici.getMinBalance();
	System.out.println(icici.setMinBalance());
	
	}
}
