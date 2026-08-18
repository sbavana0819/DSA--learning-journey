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