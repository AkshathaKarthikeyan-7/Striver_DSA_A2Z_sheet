package Array;

public class Two_Sum {
    public static void main(String[] args){
         int [] arr = {2,3,4,6};
         int target = 7;
         int n = arr.length;
         int diff = 0;
         for(int i = 0; i < n; i++){
             diff = target-arr[i];
             for(int j = i+1; j < n; j++){
                 if(arr[j] == diff){
                     System.out.print("Yes, the target " + target + " is there by adding numbers "+ arr[i] +" & "+ arr[j]);
                 }
             }
         }
    }
}
