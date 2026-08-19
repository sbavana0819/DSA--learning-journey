//write a program that takes an integer, then a string, then a char from the 
//user and prints them in the screen.
import java.util.Scanner;
public class UserInput {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);

        System.out.println("Enter the numbers: ");
        int num = user.nextInt();

        System.out.println("Enter the Name: ");
        String name = user.next();

        System.out.println("Enter the Character(A-Z): ");
        char ch = user.next().charAt(0);

        System.out.println("Ingeter: " + num);
        System.out.println("Name : "+ name);
        System.out.println("Character: "+ ch);
    }
    
}
