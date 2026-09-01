//check palindrome or not
import java.util.Scanner;

class palindrome {
   public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    System.out.print("Enter number: ");
    int n = s.nextInt();
    int original = n;
    int rev = 0;
    while(n >0){
        int last_digit = n % 10;
        rev = rev*10 + last_digit;
        n = n/10;
    }
    if(original == rev){
        System.out.print("It is palindrome");
    }else{
        System.out.print("It is not palindrome");
    }
   }
}
