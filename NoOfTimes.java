//write a program which takes two values x and y. Prints x of y number of times.
import java.util.Scanner;
class NoOfTimes{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter x: ");
        int x = input.nextInt();
        System.out.print("Enter y: ");
        int y = input.nextInt();
        for(int i = 1; i <= y; i++){
            System.out.println(x);
        }
    }
}
/*By do-while
        int i = 1;
        do{
            System.out.println(x);
            i++;
        }while(i <= y);
        By while
        int i = 1;
        while(i <= y){
            System.out.println(x);
            i++;
}*/