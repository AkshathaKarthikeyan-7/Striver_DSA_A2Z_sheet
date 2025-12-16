package Array;

public class Union_of_two_Sorted_Array {
    public static void main(String[] args){
        int [] arr1 = {1,1,2,3,4,5};
        int [] arr2 = {2,3,4,5,6};

        int n1 = arr1.length;
        int n2 = arr2.length;

        int [] union = new int[n1 + n2];

        int i = 0, j = 0, k = 0;

        while(i < n1 && j < n2){
            if(arr1[i] <= arr2[j]){
                if(k == 0 || union[k-1] != arr1[i]){
                    union[k] = arr1[i];
                    k++;
                }
                i++;
            }
            else{
                if(k == 0 || union[k-1] != arr2[j]){
                    union[k] = arr2[j];
                    k++;
                }
                j++;
            }
        }

        while(i < n1){
            if(k == 0 || union[k-1] != arr1[i]){
                union[k] = arr1[i];
                k++;
            }
            i++;
        }

        while(j < n2){
            if(k == 0 || union[k-1] != arr2[j]){
                union[k] = arr2[j];
                k++;
            }
            j++;
        }

        for(int x = 0; x < k; x++){
            System.out.print(union[x] + " ");
        }
    }
}
