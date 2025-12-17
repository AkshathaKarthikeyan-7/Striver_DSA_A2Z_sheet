package Array;

public class Move_Zeros_to_End {
    public static void main(String[] args){
        int [] nums = {1,0,2,0,0,4,5,6,0,0,7};
        int j = -1;
        int n = nums.length;
        for(int i = 0; i < n; i++){
            if(nums[i] == 0){
                j = i;
                break;
            }
        }
        if(j == -1) return;

        int temp = 0;
        for(int i = j+1; i < n; i++){
            if(nums[i] != 0){
                temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
        for(int i = 0;i < n;i++){
            System.out.print(nums[i]+" ");
        }
    }
}
