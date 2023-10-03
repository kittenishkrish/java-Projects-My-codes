package regexbasics;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexLearn {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String Sentance = sc.next();
		Pattern p = Pattern.compile("^M|i");
		Matcher m = p.matcher(Sentance);
		int count = 0;
		while (m.find()) {
			count++;
			System.out.println(m.group() + " starts at " + m.start() + " and Ends at " + m.end());

		}
		System.out.println("Count of Given Word is " + count);
	}

}
