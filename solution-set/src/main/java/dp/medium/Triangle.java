package dp.medium;

import java.util.List;

/**
 * @author Jack
 * q.120
 * constraint:
 * 1 <= triangle.length <= 200
 * triangle[0].length == 1
 * triangle[i].length == triangle[i - 1].length + 1
 * -104 <= triangle[i][j] <= 104
 */
public class Triangle {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int[] dp = new int[n];
        for (int i = 0; i < n; i++)
            dp[i] = triangle.get(n - 1).get(i);
        for (int i = n - 2; i >= 0; i--)
            for (int j = 0; j <= i; j++)
                dp[j] = Math.min(dp[j], dp[j+1]) + triangle.get(i).get(j);
        return dp[0];
    }
    /**
     * The below is not the fastest one
     * we can use only one array to solve and eliminate a lot of if conditions by bottom-up
     */
//    public int minimumTotal(List<List<Integer>> triangle) {
//        int n = triangle.size();
//        int[][] dp = new int[n][n];
//        dp[0][0] = triangle.get(0).get(0);
//        for (int i = 1; i < n; i++) {
//            for (int j = 0; j <= i; j++) {
//                if (j == 0)
//                    dp[i][j] = dp[i - 1][0] + triangle.get(i).get(j);
//                else if (j == i)
//                    dp[i][j] = dp[i - 1][j - 1] + triangle.get(i).get(j);
//                else
//                    dp[i][j] = Math.min(dp[i - 1][j - 1], dp[i - 1][j]) + triangle.get(i).get(j);
//            }
//        }
//        int min = Integer.MAX_VALUE;
//        for (int j = 0; j < n; j++)
//            min = Math.min(dp[n - 1][j], min);
//        return min;
//    }
}
