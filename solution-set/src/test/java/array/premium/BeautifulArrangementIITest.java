package array.premium;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

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
        Map<Integer, Boolean> exist = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            assertTrue(arr[i] <= n && arr[i] >= 1);
            if (i > 0)
                exist.put(Math.abs(arr[i] - arr[i - 1]), true);
        }
        System.out.println();
        assertEquals(k, exist.size());
    }
}
