//Write a program to get firstName and lastName and n as input and print fullName that is firstName+lastName for n times
import java.util.Scanner;
class RepeatName{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter FirstName: ");
        String firstName = input.nextLine();
        System.out.print("Enter LastName: ");
        String lastName = input.nextLine();
        System.out.print("Enter number of times to print: ");
        int times = input.nextInt();
        for(int i = 0; i < times; i++){
            System.out.println(firstName + lastName);
        }
    }
}