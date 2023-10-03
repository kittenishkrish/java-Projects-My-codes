package constructorExample;

public class ICICIBank {

	private int minBalance = 2000;

	public int getMinBalance() {
		return minBalance;
	}

	public int setMinBalance () 
	{ 
		if(minBalance > 1000)
		this.minBalance = minBalance;
		return minBalance;
	}

}
