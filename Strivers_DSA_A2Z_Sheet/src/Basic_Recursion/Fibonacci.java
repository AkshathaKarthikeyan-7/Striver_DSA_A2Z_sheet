package Basic_Recursion;

public class Fibonacci {
    public static void main(String[] args){
        int n = 5;
        int[] arr = new int[n+1];
        arr[0] = 0;
        if(n > 1){
            arr[1] = 1;
        }
        int[] result = fibanocci(n,2, arr);
        for(int i= 0; i <= n; i++){
            System.out.print(result[i]+" ");
        }
    }
    public static int[] fibanocci(int n, int k, int[] arr){
        if(k > n){
            return arr;
        }
        arr[k] = arr[k-2] + arr[k-1];
        return fibanocci(n, k+1,arr);
    }
}
