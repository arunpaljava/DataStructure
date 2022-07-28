package dynamicprogramming;

import java.util.Arrays;

public class SelectCoin {
    public static void main(String args[]) {
        int n = 18;
        int arr[] = {7, 5, 1};
        int dp[] = new int[n + 1];
        Arrays.fill(dp, -1);
        dp[0] = 0;
        int minCoins = minCoins(n, arr, dp);
        System.out.println(minCoins);

    }

    //using recurrsion
    private static int minCoins(int n, int[] arr, int[] dp) {
        //base condition
        if (n == 0) {
            return 0;
        }
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (n - arr[i] >= 0) {
                int subAns = 0;
                if (dp[n - arr[i]] != -1) {
                    subAns = dp[n - arr[i]];
                } else {
                    subAns = minCoins(n - arr[i], arr, dp);
                }
                if (subAns != Integer.MAX_VALUE && subAns + 1 < ans) {
                    ans = subAns + 1;
                }
            }
        }
        dp[n] = ans;
        return ans;
    }
}
