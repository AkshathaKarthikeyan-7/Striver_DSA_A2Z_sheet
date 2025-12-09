package Array;

public class Array_is_Sorted_or_Not {
    public static void main(String[] args){
        int[] arr = {3,4,6,7,6};
        for(int i = 0; i < arr.length - 1; i++){
            if(arr[i] < arr[i+1]){
            }
            else {
                System.out.println("Array is not Sorted");
                break;
            }

            if(i == arr.length - 2){
                System.out.println("Array is Sorted");
            }
        }
    }
}
