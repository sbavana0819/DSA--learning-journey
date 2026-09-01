package programs;
import java.util.Scanner;
class valuePower {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter numbers;");
        int A = s.nextInt();
        int B = s.nextInt();
        int k = s.nextInt();
        int res = A;
        for(int i = 1; i < B; i++){
            res = res * A;
        }
        System.out.println(res);
        int n = res;
        int temp = n;

        while(temp >= 10){
            temp = temp/10;
        }
        int first = temp;

        while(n > 0 ){
            n = n%10;
            if(k == 1){
            System.out.println(n);
            }
            else{
              System.out.println(first);
            }
            n = n/10;
        }
        }
}
        