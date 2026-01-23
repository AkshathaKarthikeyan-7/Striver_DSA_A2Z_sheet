package Basic_Hashing;
import java.util.*;

public class Find_thehighest_lowest_frequencyelement {
    public static void main(String[] args){
        int[] arr = {7,10,3,7,2,7,7};

        int max = 0;
        int min = Integer.MAX_VALUE;
        int maxKey = -1;
        int minKey = -1;

        HashMap<Integer, Integer> freq = new HashMap<>();

        for(int num : arr){
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        for(int key : freq.keySet()){
            int count = freq.get(key);

            if(count > max){
                max = count;
                maxKey = key;
            }

            if(count < min){
                min = count;
                minKey = key;
            }
        }

        System.out.println("Highest frequency element = " + maxKey + " (" + max + " times)");
        System.out.println("Lowest frequency element = " + minKey + " (" + min + " times)");
    }
}
