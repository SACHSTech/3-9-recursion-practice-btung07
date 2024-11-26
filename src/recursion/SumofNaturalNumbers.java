package recursion;

public class SumofNaturalNumbers {
    public static int sum(int n) {
        if (n>0){
            return sum(n-1)+n;
        }
        else{ 
            return 0;
        }
       
    }
    

    public static void main(String[] args) {
        System.out.println(sum(5)); // Output: 15
    }
}
