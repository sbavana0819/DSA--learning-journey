/*to print 
Enter number: 20
1 2 4 5 10 20 
*/
import java.util.Scanner;
class dividePrint {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = s.nextInt();
        for(int i = 1; i<=n;i++){
            if(n%i == 0){
                System.out.print(i + " ");
            }
        }

    } 
}
