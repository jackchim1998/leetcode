package medium;

import java.util.Arrays;

/**
 * @author Jack
 */
public class MaximumAreaOfaPieceOfCakeAfterHorizontalAndVerticalCuts {
    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        Arrays.sort(horizontalCuts);
        Arrays.sort(verticalCuts);
        int maxHorizontalGap = Math.max(horizontalCuts[0], h - horizontalCuts[horizontalCuts.length - 1]);
        int maxVerticalGap = Math.max(verticalCuts[0], w - verticalCuts[verticalCuts.length - 1]);
        for (int i = 1; i < horizontalCuts.length; i++)
            maxHorizontalGap = Math.max(maxHorizontalGap, horizontalCuts[i] - horizontalCuts[i - 1]);
        for (int i = 1; i < verticalCuts.length; i++)
            maxVerticalGap = Math.max(maxVerticalGap, verticalCuts[i] - verticalCuts[i - 1]);
        return (int) (((long) maxHorizontalGap % 1_000_000_007 * maxVerticalGap % 1_000_000_007) % 1_000_000_007);
    }
}
