import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("kodok", "katak", "bebek");
        stringList.forEach((str) -> {
            System.out.println(str + " : " + Palindrome.isPalindrome(str));
        });
    }
}
