package Basic_Math;

public class Armstrong_Number {
    public static void main(String[] args) {
        int n = 153;
        int dup = n;
        int sum = 0;
        int pow = 0;
        int temp = n;
        while(temp != 0){
            pow++;
            temp/=10;
        }
        while(dup != 0){
            int last_digit = dup%10;
            sum += Math.pow(last_digit, pow);
            dup /= 10;
        }
        if(n == sum){
            System.out.print("True");
        }
        else {
            System.out.print("False");
        }
    }
}
