/* To print: 
Enter number of rows: 4
1 
1 2 
1 2 3 
1 2 3 4  
*/
import java.util.Scanner;
class pattern3 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int num = s.nextInt();
        for(int i = 1; i<= num; i++){
            for(int j = 1; j <= i; j++){
                System.out.print( j + " ");
            }
            System.out.println();
        }

    }
    
}
