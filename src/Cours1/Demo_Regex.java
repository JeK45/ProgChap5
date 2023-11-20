package Cours1;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
class Demo1{
    Demo1() {
        Pattern regex = Pattern.compile("^[A-Za-z]\\d[A-Za-z] \\d[A-Za-z]\\d$\n");
        Matcher match = regex.matcher("Bonjoure je suis J6E 5T3 et je sus con H0H 0H0");
        while (match.find()) {
            System.out.println(match.group());
        }
    }

    public static void main(String[] args) {
        new Demo1();
    }
}
