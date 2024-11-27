package recursion;

public class question4 {
    public static String reverse(String s) {
        if (s == null || s.length() <= 1) {
            return s;
        }
        return reverse(s.substring(1)) + s.charAt(0);
    }
    public static void main(String[] args) {
        String original = "hello";
        String reversed = reverse(original);
        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);
    }
}
