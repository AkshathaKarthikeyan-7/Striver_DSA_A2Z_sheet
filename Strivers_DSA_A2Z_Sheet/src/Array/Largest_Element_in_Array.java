package Array;

public class Largest_Element_in_Array {
    public static void main(String[] args){
        int[] arr = {2, 4, 5, 7, 3, 6};
        int n = arr.length;
        int largest = 0;
        for(int i = 0; i < n - 1; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        System.out.println(largest);
    }
}
