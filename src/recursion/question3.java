package recursion;

public class question3 {
    public static void printEvens(int start, int end){
        if (start % 2 == 0) {
            System.out.println(start + " is even.");
         
        }   
        if (start!= end){
            printEvens(start + 1, end);  
         }
    }
    public static void main(String[] args) {
        printEvens(1,10); // Output: 1 2 3 4 5
    }
}


