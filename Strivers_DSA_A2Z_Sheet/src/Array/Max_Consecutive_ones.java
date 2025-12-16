package Array;
import static java.lang.Integer.max;

public class Max_Consecutive_ones {
    public static void main(String[] args){
        int [] arr = {1,1,0,1,1,1,1,0,1,0,1,1};
        int n = arr.length;
        int maxi = 0, cnt = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] == 1){
                cnt++;
                maxi = max(cnt, maxi);
            }
            else{
                cnt = 0;
            }
        }
        System.out.println(maxi);
    }
}
