/*
Enter number to print reverse: 12345
54321
 */
package programs;
import java.util.Scanner;
class printLast {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number to print reverse: ");
        int n = input.nextInt();
        while(n>0){
            int num = n % 10;
            System.out.print(num);
            n = n/10;
        }
    }
    
}
