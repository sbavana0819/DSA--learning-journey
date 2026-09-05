import java.util.Scanner;
class factorialTrailing {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = s.nextInt();
        int fact = 1;
        int sum = 0;
        for(int i = 1; i <= n; i++){
            fact = fact*i;
        }
        while(fact > 0 ){
            int digit = fact % 10;
            fact = fact / 10;
        if (digit == 0){
            sum = sum + 1;
        }
        }

        System.out.println(sum + " trailing zeroes");

    }
}