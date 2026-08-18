import java.util.Scanner;
class TriangleAngleCheck {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the three angles of a triangle: ");
        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        int a3 = sc.nextInt();
        int sum = a1 + a2 + a3;
        if(sum == 180){
            System.out.println("The triangle is Formed");
        }else{
            System.out.println("The triangle is not Formed");
        }
    }
}
