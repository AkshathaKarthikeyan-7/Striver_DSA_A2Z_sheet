package Array;

public class Duplicates_inplace_in_SortedArray {
    public static void main(String[] args){
        int [] arr = {1,1,3,4,4,5,7,7,7,8};
        int i = 0;
        int n = arr.length;

        for(int j = 1; j < n; j++){
            if(arr[j] != arr[i]){
                i++;
                arr[i] = arr[j];
            }
        }

        System.out.println(i + 1);
    }
}
