import java.util.Scanner;
class perfectNumber{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = s.nextInt();
        if(n <= 1){
            System.out.println("It is not a perfect number");
            return;
        }
        int sum = 1;
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n%i == 0){
                sum = sum+i;
            if(n/i != i){
                sum = sum+(n/i);
                }
            }
        }
        //to check perfect number or not
        if(sum == n){
            System.out.print("It is perfect Number");
        }else{
            System.out.print("It is not perfect Number");
        }
    }
}