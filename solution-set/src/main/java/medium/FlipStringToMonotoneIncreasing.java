package medium;

/**
 * @author Jack
 */
public class FlipStringToMonotoneIncreasing {
    public int minFlipsMonoIncr(String s) {
        char[] chars = s.toCharArray();
        int flipCount = 0;
        int onesCount = 0;

        for (char c : chars) {
            if (c == '0') {
                if (onesCount == 0) continue; // start count after encounter first One
                else flipCount++;
            } else
                onesCount++;
            if (flipCount > onesCount)
                flipCount = onesCount;
        }
        return flipCount;
    }
}
