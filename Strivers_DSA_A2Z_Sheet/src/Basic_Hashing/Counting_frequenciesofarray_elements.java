package Basic_Hashing;

import java.util.HashMap;

public class Counting_frequenciesofarray_elements {
    public static void main(String[]args){
        int [] arr = {1,2,3,2,1,4,5,7,6,7,3};
        HashMap<Integer,Integer> freq = new HashMap<>();
        for(int i : arr){
            freq.put(i, freq.getOrDefault(i,0)+1);
        }
        for(int key : freq.keySet()){
            System.out.println(key + " -- " + freq.get(key));
        }
    }
}
