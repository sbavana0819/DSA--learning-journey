import java.util.Scanner;
public class GradeCheck {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your mark:");
        int mark = s.nextInt();
        if(mark >= 90){
            System.out.println("Grade A");
        }else if(mark >=80){
            System.out.println("Grade B");
        }else if(mark >= 60){
            System.out.println("Grade C");
        }else if(mark >= 35){
            System.out.println("Grade D");
        }else{
            System.out.println("Fail");
        }
    }
}