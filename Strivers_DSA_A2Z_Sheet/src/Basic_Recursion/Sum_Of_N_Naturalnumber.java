package Basic_Recursion;

public class Sum_Of_N_Naturalnumber {
    public static void main(String[] args){
        int n = 5;
        int i = 1;
        int sum = 0;
        int result = sumofNnaturalNumber(n,sum,i);
        System.out.print(result);
    }
    public static int sumofNnaturalNumber(int n, int sum, int i){
        if(i > n){
            return sum;
        }
        sum = sum+i;
        return sumofNnaturalNumber(n,sum,i+1);
    }
}
