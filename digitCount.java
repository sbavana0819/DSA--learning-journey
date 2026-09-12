/*Write a recursive algorithm to
 find the count of digits in a number */
class digitNum{
    public int countDigits(int n){
        if(n == 0){
            return 0;
        }
        return 1 + countDigits(n/10);
    }
}
class digitCount {
    public static void main(String[] args){
        digitNum d = new digitNum();
        System.out.println("count is " + d.countDigits(2819));
    }
}
