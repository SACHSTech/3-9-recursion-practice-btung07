package recursion;

public class question5 {
    public static boolean isPalindrome(String s) {
        if (s == null || s.length() <= 1) {
            return true;
        }
        if (s.charAt(0) != s.charAt(s.length() - 1)) {
            return false; 
        }
        return isPalindrome(s.substring(1, s.length() - 1));
    }
    public static void main(String[] args) {
        String[] testStrings = { "racecar", "hello", "madam" };

        for (String s : testStrings) {
            if (isPalindrome(s)) {
                System.out.println(s + " = palindrome");
            } else {
                System.out.println(s + " = not palindrome");
            }
        }
    }
}
