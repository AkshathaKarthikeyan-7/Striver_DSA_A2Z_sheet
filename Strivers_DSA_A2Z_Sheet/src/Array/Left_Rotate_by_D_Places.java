package Array;

public class Left_Rotate_by_D_Places {
    public static int[] leftrotate(int[] arr, int n, int d){
        d = d%n;
        int [] temp = new int[d];
        for(int i = 0; i < d; i++){
            temp[i] = arr[i];
        }
        for(int i = d; i < n;i++){
            arr[i-d] = arr[i];
        }
        for(int i = n-d; i < n; i++){
            arr[i] = temp[i-(n-d)];
        }
        return arr;
    }
    public static void main(String[] args){
        int [] arr = {1,2,3,4,5,6,7};
        int n = arr.length;
        int d = 3;
        int [] final_arr = leftrotate(arr, n,d);
        for(int i = 0; i < n; i++){
            System.out.print(final_arr[i]+" " );
        }
    }
}
