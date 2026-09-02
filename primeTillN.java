import java.util.Scanner;
class primeTillN {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = s.nextInt();
        for(int x = 2; x <= n; x++){
            int prime = 0;
        for(int i = 2; i < x; i++){
            if(x % i == 0){
                prime = 1;
            }
        }
        if(prime == 0){
            System.out.print(x + " ");
        }
    }
} 
}
