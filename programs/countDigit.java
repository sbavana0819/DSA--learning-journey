/* Write a program that gets n as input and print the number of digits in the number
Input : 325345
output: Count is 6
 */
package programs;
import java.util.Scanner;
class countDigit{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter num: ");
        int num = s.nextInt();
        int count = 0;
        while(num>0){
            int n = num %10;
            count++;
            num = num/10;
        }
            System.out.print("Count is " + count);
    }
}