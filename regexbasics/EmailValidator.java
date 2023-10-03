package regexbasics;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator {
    private static final String EMAIL_REGEX =
        "^[A-Za-z0-9+_.-]+@(.+)$";

    private static final Pattern pattern = Pattern.compile(EMAIL_REGEX);

    public static boolean validateEmail(String email) {
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public static void main(String[] args) {
        String[] testEmails = {
            "user@example.com",
            "user123@gmail.com",
            "invalid-email",
            "name@company.co.uk"
        };

        for (String email : testEmails) {
            if (validateEmail(email)) {
                System.out.println(email + " is a valid email address.");
            } else {
                System.out.println(email + " is not a valid email address.");
            }
        }
    }
}
