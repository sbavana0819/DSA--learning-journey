import java.util.*;
class sumOfArray{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = s.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = s.nextInt();
        }
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum = sum + arr[i];
        }
        System.out.println("Sum = " + sum);
    }
}