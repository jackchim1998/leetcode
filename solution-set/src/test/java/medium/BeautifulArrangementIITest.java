package medium;

import org.junit.jupiter.api.Test;

import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author Jack
 */
class BeautifulArrangementIITest {
    private final BeautifulArrangementII solution = new BeautifulArrangementII();

    @Test
    void example1() {
        int n = 3;
        int k = 1;
        validate(solution.constructArray(n, k), n, k);
    }

    @Test
    void example2() {
        int n = 3;
        int k = 2;
        validate(solution.constructArray(n, k), n, k);
    }

    @Test
    void example3() {
        int n = 5;
        int k = 2;
        validate(solution.constructArray(n, k), n, k);
    }

    private void validate(int[] arr, int n, int k) {
        assertNotNull(arr);
        HashSet<Integer> exist = new HashSet<>();
        for (int ele : arr)
            assertTrue(ele <= n && ele >= 1);
        for (int i = 1; i < arr.length; i++)
            exist.add(Math.abs(arr[i] - arr[i - 1]));
        assertEquals(k, exist.size());
    }
}
