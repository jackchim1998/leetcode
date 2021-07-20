package medium;

import java.util.Random;

/**
 * @author Jack
 */
public class ShuffleAnArray {
    private final int[] original;
    private final int[] array;
    private final Random rand = new Random();

    public ShuffleAnArray(int[] nums) {
        original = nums.clone();
        array = nums;
    }

    public int[] reset() {
        return original.clone();
    }

    public int[] shuffle() { // Fisher–Yates
        for (int i = 0; i < array.length; i++)
            swapAt(i, randRange(i, array.length));
        return array;
    }

    private int randRange(int min, int max) {
        return rand.nextInt(max - min) + min;
    }

    private void swapAt(int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
