//Write a java program to get two numbers from the user and find their GCD

import java.util.Scanner;

class gcdTwoNumber {
    public static int gcd(int a, int b){
        if(a == 0) return b;
        if(b == 0) return a;
        while(a != b){
            if(a>b)
                a = a - b;
            if(b>a)
                b = b - a;
        }
        return a;
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a, b :  ");
        int a = s.nextInt();
        int b = s.nextInt();
        System.out.print("GCD is " + gcd(a,b));
    }
    
}
