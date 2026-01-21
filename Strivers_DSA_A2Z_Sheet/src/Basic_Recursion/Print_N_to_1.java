package Basic_Recursion;

public class Print_N_to_1 {
    public static void main(String[] args){
        int n = 7;
        printNto1(n);
    }
    public static void printNto1(int n){
        if(n < 1){
            return;
        }
        System.out.print(n +" ");
        printNto1(n - 1);
    }
}
