import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        System.out.println("The text matches regular expression: "
                + checkTextMatchesRegex("some@example.com", "^\\w+@\\w+\\.\\w{3}$"));
    }

    public static boolean checkTextMatchesRegex(String text, String regPattern){
        Pattern pattern = Pattern.compile(regPattern);
        Matcher matcher = pattern.matcher(text);
        return  matcher.matches();
    }
}
