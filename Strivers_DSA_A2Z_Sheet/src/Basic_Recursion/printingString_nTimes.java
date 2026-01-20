package Basic_Recursion;

public class printingString_nTimes{
    public static void main(String[] args){
        int n = 7;
        String str = "Akshatha";
        printingstrNtimes(n,str,0);
    }
    public static void printingstrNtimes(int n, String str, int cnt){
        if(cnt == n){
            return;
        }
        System.out.println(str);
        printingstrNtimes(n,str,cnt+1);
    }
}
