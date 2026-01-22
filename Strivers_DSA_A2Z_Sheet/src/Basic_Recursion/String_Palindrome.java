package Basic_Recursion;

public class String_Palindrome {
    public static void main(String[] args){
        String str = "malayalam";
        int left = 0;
        int right = str.length() - 1;
        Boolean result = palindrome(str, left, right);
        if(result){
            System.out.print("Palindrome");
        }
        else System.out.print("Not palindrome");
    }
    public static boolean palindrome(String str, int left, int right){
        if(left >= right){
            return true;
        }
        if(str.charAt(left) != str.charAt(right)){
            return false;
        }
        return palindrome(str, left+1, right-1);
    }
}
