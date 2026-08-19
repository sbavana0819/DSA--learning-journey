/*Write a program using switch case which takes a value and prints the respective Size.
If size is 29 then its small
If size is 30 then its Medium
If size is 38 then its Large
If size is 42 then its XLarge
If size is not any of the above then Invalid*/

import java.util.Scanner;
class SizeCheck{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your size(29 or 30 or 38 or 42):");
        int size = s.nextInt();
        switch(size){
            case 29:
                System.out.println("small");
                break;
            case 30:
                System.out.println("Medium");
                break;
            case 38:
                System.out.println("Large");
                break;               
            case 42:
                System.out.println("XLarge");
                break;
            default:
                System.out.println("Your given size is invalid");
        }
    }
}