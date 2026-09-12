//Write a recursive program to find the sum of digits of a number.
class digit{
    public int digitSum(int n){
        if(n == 0){
            return 0;
        }
        return (n%10) + digitSum(n/10);
    }
}

class sumDigit {
    public static void main(String[] args){
        digit d = new digit();
        System.out.println("Sum of the digits : " + d.digitSum(342));
    }
}
