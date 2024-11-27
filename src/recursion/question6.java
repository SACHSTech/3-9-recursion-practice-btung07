package recursion;

public class question6 {
    public static int power(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        }
        return base * power(base, exponent - 1);
    }
    public static void main(String[] args) {
        int base1 = 1, exp1 = 4;
        int base2 = 6, exp2 = 3;
        int base3 = 12, exp3 = 2;

        System.out.println(base1 + "^" + exp1 + " = " + power(base1, exp1));
        System.out.println(base2 + "^" + exp2 + " = " + power(base2, exp2));
        System.out.println(base3 + "^" + exp3 + " = " + power(base3, exp3));
    }
}
