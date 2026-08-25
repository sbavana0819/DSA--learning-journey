/*To print:
* 
* * 
* * * 
* * * * 
* * * 
* * 
* 
*/
import java.util.Scanner;
class pattern7{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = input.nextInt();
        for(int i = 1; i <= n ; i++){
            for(int j = 1; j <= i ; j++){
                System.out.print("* ");
        }
        System.out.println();
       }
       for(int  i = 1; i<= n -1 ; i++){
        for(int j = 1; j <= n-i+1 -1; j++){
            System.out.print("* ");
        }
        System.out.println();
       }
}
}