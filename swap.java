import java.util.Scanner;
class swap {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = s.nextInt();
        System.out.print("Enter a: ");
        int b = s.nextInt();
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println("Swap variable");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
    
}
