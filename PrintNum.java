//write a program to take x  and print multiples of x till 1000.

import java.util.Scanner;
class PrintNum{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = input.nextInt();
        for(int i = 1; i <= 1000; i++){
            int mul = num * i;
            if (mul <= 1000){
                System.out.println(i +" X " + num + " = " + mul);
            }
        }
    }
}