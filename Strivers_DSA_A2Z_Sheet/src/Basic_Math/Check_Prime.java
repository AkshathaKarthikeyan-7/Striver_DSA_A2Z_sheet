package Basic_Math;

public class Check_Prime {
    public static void main(String[] args) {
        int n = 2;
        int cnt = 0;
        for(int i = 1; i*i <= n; i++){
            if(n%i == 0){
                cnt++;
                if((n/i) != i){
                    cnt++;
                }
            }
        }
        if(cnt == 2){
            System.out.print(n+" is a prime number!");
        }
        else{
            System.out.print(n+" is not a prime number!");
        }
    }
}
