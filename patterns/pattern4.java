/* to print
Enter number of rows: 4
**** 
*** 
** 
*  
*/
import java.util.Scanner;
class pattern4 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = s.nextInt();
        for(int i = 1; i <= rows; i++){
            for(int j = 1; j <= rows-i+1; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    
}
