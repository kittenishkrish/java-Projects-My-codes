package regexbasics;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SplitMethoidExample {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String S1 = sc.next();
		//String[] st = S1.split("\\.");
		Pattern p = Pattern.compile("\\.");
		String[] st2 = p.split(S1);
		for(String s: st2)
			System.out.println(s);
	}
}
