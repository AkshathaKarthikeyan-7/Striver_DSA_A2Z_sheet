package Array;
import java.util.*;
public class Number_Appears_Once {
    public static void main(String[] args){
        int [] nums = {1,1,2,2,3,4,3,4,7};
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }

        for (int key : map.keySet()) {
            if (map.get(key) == 1) {
                System.out.print(key);
            }
        }
    }
}
