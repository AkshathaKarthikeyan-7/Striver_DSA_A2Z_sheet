package Basic_Math;

public class Count_Digit_2 {
    public static void main(String[] args){
        int n = 1234890;
        int cnt = 0;
        if(n == 0){
            System.out.print("1");
        }
        else{
            System.out.print((int)(Math.log10(n)+1));
        }
    }
}
