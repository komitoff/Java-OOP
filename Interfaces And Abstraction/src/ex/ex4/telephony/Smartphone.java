package ex.ex4.telephony;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Smartphone implements Callable, Browsable {

    public Smartphone() { }

    @Override
    public String browse(String url) {
        Pattern pattern = Pattern.compile("\\d");
        Matcher matcher = pattern.matcher(url);
        if (matcher.find()) {
            return "Invalid URL!";
        }

        return "Browsing: " + url + "!";
    }

    @Override
    public String call(String number) {
        Pattern pattern = Pattern.compile("\\D");
        Matcher matcher = pattern.matcher(number);
        if (matcher.find()) {
            return "Invalid number!";
        }
        return String.format("Calling... %s", number);
    }
}
