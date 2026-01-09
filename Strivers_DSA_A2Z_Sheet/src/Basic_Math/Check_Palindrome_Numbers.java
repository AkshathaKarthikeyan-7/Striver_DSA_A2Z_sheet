package Basic_Math;

public class Check_Palindrome_Numbers {
    public static boolean isPalindrome(int n) {
        int dup = n;
        int reverse = 0;
        while(dup > 0){
            int last_digit = dup%10;
            dup = dup/10;
            reverse = (reverse * 10)+last_digit;
        }
        return reverse == n;
    }
    public static void main(String[] args){
        int n = 7447;
        boolean result = isPalindrome(n);
        if(result == true){
            System.out.print("Yes");
        }
        else{
            System.out.print("No");
        }
    }
}
