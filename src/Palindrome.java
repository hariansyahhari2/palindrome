public class Palindrome {
    public static boolean isPalindrome(String input) {
        boolean output = true;
        for (int i=0; i<input.length(); i++) {
            if (input.toLowerCase().charAt(i) != input.toLowerCase().charAt(input.length() - 1 - i)) {
                output = false;
            }
        }
        return output;
    }
}
