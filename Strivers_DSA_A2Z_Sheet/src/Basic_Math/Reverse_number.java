package Basic_Math;

public class Reverse_number {
    public static void main(String[] args){
        int n = 97860;
        int rev_num = reverseNumber(n);
        System.out.print(rev_num);
    }
    public static int reverseNumber(int n){
        int reverse = 0;
        while(n > 0){
            int last_digit = n % 10;
            n = n/10;
            reverse = (reverse*10)+last_digit;
        }
        return reverse;
    }
}
