import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AccountExample {
    public AccountExample(){

    }
    public void validate(String regex){
        final String ACCOUNT_REGEX = "^[_a-z0-9]{6,}$";
        Pattern pattern = Pattern.compile(ACCOUNT_REGEX);
        Matcher matcher = pattern.matcher(regex);
        System.out.println(matcher.matches());
    }

}
