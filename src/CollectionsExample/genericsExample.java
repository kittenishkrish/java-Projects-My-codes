package CollectionsExample;

import java.util.Collection;
import java.util.ArrayList;

public class genericsExample {

	public static void main(String[] args) throws Exception {

		Collection<Integer> values = new ArrayList<Integer>();

		values.add(7);
		values.add(14);
		values.add(21);
		values.add(28);
		values.add(35);

		for (int i : values) {
			System.out.println(i);
		}

	}

}
