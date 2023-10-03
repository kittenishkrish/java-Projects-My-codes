package regexbasics;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regexLearn1 {
 
	public static void main (String[] args) {
		
		String Str = "abCABcabbccaa";
		Pattern p =Pattern.compile("[a-zA-Z]");
		Matcher m = p.matcher( Str);
		while (m.find()) {
			//count++;
			System.out.println(m.group() + " starts at " + m.start());
			//+ " and Ends at " + m.end());

		}
	}
}
