package regexbasics;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileNumberValidation {

	public static void main(String[] args) throws FileNotFoundException {
		
		File file = new File("D:\\Java Notes\\MobileNumberValidation.txt");
		Scanner sc = new Scanner(file);
		boolean LinePresent = sc.hasNext();
		while(LinePresent)
		{
			String word = sc.next();
			int i = word.lastIndexOf(".");
			String mobile = word.substring(i+1);
			Pattern p =Pattern.compile("(0|91)?[6-9][0-9]{9}");
			Matcher m = p.matcher( mobile);
			if(m.find())
			{
				System.out.println(m.group() + " is valid mobile no.");
			}
			else
			{
				System.out.println(mobile + " is not valid mobile no ");
			}
		}

	}

}
