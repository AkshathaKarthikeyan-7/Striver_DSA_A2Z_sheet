package Basic_Math;

import static java.lang.Math.sqrt;

public class Print_All_Divisors {
    public static void main(String[] args) {
        int n = 36;
        for(int i = 1; i <= sqrt(n); i++){
            if(n%i == 0){
                System.out.print(i+" ");
                if((n/i) != i){
                    System.out.print(n/i+" ");
                }
            }
        }
    }
}
