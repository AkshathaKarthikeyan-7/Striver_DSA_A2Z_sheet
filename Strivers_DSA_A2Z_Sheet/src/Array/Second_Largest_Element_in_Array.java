package Array;

public class Second_Largest_Element_in_Array {
    public static void main(String[] args){
        int [] arr = {3,4,6,8,6,7};
        int secondLargest = -1;
        int largest = arr[0];
        int n = arr.length;
        for(int i = 0; i < n; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        for(int i = 0; i < n; i++){
            if(arr[i] > secondLargest && arr[i]!= largest){
                secondLargest = arr[i];
            }
        }
        System.out.println(secondLargest);
    }
}
