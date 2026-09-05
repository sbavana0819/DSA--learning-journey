//Given three distinct numbers a, b and c. Find the number with a value in the middle
import java.util.Scanner;
class middleElement {
    public static int greatestNum(int a, int b, int c){
        if(a>b && a>c){
            return b>c?b:c;
        }else if(b>a && b>c){
            return a>c?a:c;
        }else{
            return a>b?a:b;
        }

    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        System.out.println("The middle element is " + greatestNum(a, b, c));
    }
    
}
