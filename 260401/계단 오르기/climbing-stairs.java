import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        int dp[] = new int[n+1];
        dp[0] = 1;
        dp[1] = 0;
        dp[2] = 1;
        for(int i=3;i<=n;i++){
            if(i==3){
                dp[3] = 1;
            }else{
                dp[i] = (dp[i-2]==0?0:dp[i-2])+(dp[i-3]==0?0:dp[i-3]);
            }
        }
        System.out.println(dp[n]%10007);
    }
}