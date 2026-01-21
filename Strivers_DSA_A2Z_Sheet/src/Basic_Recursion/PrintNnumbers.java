package Basic_Recursion;

public class PrintNnumbers {
    public static void main(String[] args){
        int n = 5;
        int i = 1;
        printNtimes(n,i);
    }
    public static void printNtimes(int n, int i){
        if(i > n){
            return;
        }
        System.out.print(i+" ");
        printNtimes(n, i+1);
    }
}
