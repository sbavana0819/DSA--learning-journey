/* To print:-
Enter n: 4
4 3 2 1 
3 2 1 
2 1 
1 
*/

import java.util.*;
class pattern5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = input.nextInt();
        for(int i = n; i >= 1; i--){
            for(int j = i; j >= 1; j--){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    
}
