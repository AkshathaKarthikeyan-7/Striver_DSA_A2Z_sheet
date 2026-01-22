package Basic_Recursion;

public class Reverse_an_Array {
    public static void main(String[] args){
        int n = 5;
        int i = n - 1;
        int[] arr = {1,2,3,4,5};

        int[] reverse = reverse(n, arr, i);
        for(int j = 0; j < reverse.length; j++){
            System.out.print(reverse[j] + " ");
        }
    }

    public static int[] reverse(int n, int[] arr, int i){
        if(i < 0){
            return new int[n];
        }

        int[] reversed_arr = reverse(n, arr, i - 1);
        reversed_arr[n - 1 - i] = arr[i];
        return reversed_arr;
    }
}
