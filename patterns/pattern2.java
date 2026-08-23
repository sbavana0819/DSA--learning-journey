/* To print:
Enter number of rows: 5
1 2 3 4 5  
1 2 3 4 5  
1 2 3 4 5  
1 2 3 4 5  
1 2 3 4 5
*/
import java.util.*;
class pattern2 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int num = s.nextInt();
        for(int i = 1; i <= num; i++){
            for(int j = 1; j <= num; j++){
                System.out.print(j + " ");
            }
            System.out.println(" ");
        }
    }
    
}
