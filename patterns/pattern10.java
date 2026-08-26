/*
to print:
Enter number: 5
1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15 
*/
import java.util.Scanner;
class pattern10 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = input.nextInt();
        int count = 1;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(count++ + " ");
            }
            System.out.println();
        }
    }
}
