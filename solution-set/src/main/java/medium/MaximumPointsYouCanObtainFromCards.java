package medium;

/**
 * @author Jack
 */
public class MaximumPointsYouCanObtainFromCards {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int sum = 0;
        for (int i = 0; i < k; i++) sum += cardPoints[i];
        int maxSum = sum;
        for (int i = 1; i <= k; i++) {
            sum += -cardPoints[k - i] + cardPoints[n - i];
            if (sum > maxSum)
                maxSum = sum;
        }
        return maxSum;
    }
}
