/*
 Write a Java program to count the number of divisors (factors) of a given number.
Example:
Enter number: 12
Count is 6 
*/
import java.util.Scanner;
class divideCount {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = s.nextInt();
        int count = 0;
        for(int i = 1; i <= n; i++){
            if(n%i == 0){
                count++;
            }
        }
        System.out.print("Count is " + count);
    }
}
