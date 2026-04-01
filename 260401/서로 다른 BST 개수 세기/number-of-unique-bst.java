import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        long dp[] = new long[n+1];
        dp[0] = 1;
        if(n>=1) dp[1] = 1;
        for(int i=2;i<=n;i++){
            for(int r = 1;r<=i;r++){
                dp[i] += dp[r-1] * dp[i-r];
            }
        }

        System.out.println(dp[n]);
    }
}