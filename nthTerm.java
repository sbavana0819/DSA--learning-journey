//Write a Java program to get a number N from the user and find the sum of the
//  first N natural numbers using a for loop
import java.util.Scanner;
class nthTerm {
    public static int term(int n){
        int sum = 0;
        for(int i = 1; i<=n; i++){
            sum = sum + i;
        }
        return sum;
    }

        public static void main(String[] args){
            Scanner s = new Scanner(System.in);
            System.out.print("Enter n: ");
            int n = s.nextInt();
            int result = term(n);
            System.out.println("Sum = " + result);
    }
}
    

