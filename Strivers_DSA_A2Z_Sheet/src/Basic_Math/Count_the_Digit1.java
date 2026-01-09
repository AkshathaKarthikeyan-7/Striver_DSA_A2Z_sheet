package Basic_Math;
import java.util.*;
public class Count_the_Digit1 {
    public static void main(String[] args){
        int n = 123456789;
        int count = 0;
        int result = noofdigit(n, count);
        System.out.print(result);
    }
    public static int noofdigit(int n, int count){
        while(n > 0){
            count = count+1;
            n = n/10;
        }
        return count;
    }
}
