import java.util.Scanner;
public class UserInput {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the numbers: ");
        int num = s.nextInt();

        System.out.println("Enter the Name: ");
        String name = s.next();

        System.out.println("Enter the Character(A-Z): ");
        char ch = s.next().charAt(0);

        System.out.println("Ingeter: " + num);
        System.out.println("Name : "+ name);
        System.out.println("Character: "+ ch);
    }
    
}
