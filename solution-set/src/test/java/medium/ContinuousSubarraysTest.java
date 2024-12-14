package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContinuousSubarraysTest {
    private final ContinuousSubarrays solution = new ContinuousSubarrays();

    @Test
    void example1() {
        long result = solution.continuousSubarrays(new int[]{5, 4, 2, 4});
        assertEquals(8, result);
    }

    @Test
    void example2() {
        long result = solution.continuousSubarrays(new int[]{1, 2, 3});
        assertEquals(6, result);
    }
    @Test
    void example3() {
        long result = solution.continuousSubarrays(new int[]{65,66,67,66,66,65,64,65,65,64});
        assertEquals(43, result);
    }
    

    @Test
    void example1PQVersion() {
        long result = solution.continuousSubarraysPQVersion(new int[]{5, 4, 2, 4});
        assertEquals(8, result);
    }

    @Test
    void example2PQVersion() {
        long result = solution.continuousSubarraysPQVersion(new int[]{1, 2, 3});
        assertEquals(6, result);
    }
    @Test
    void example3PQVersion() {
        long result = solution.continuousSubarraysPQVersion(new int[]{65,66,67,66,66,65,64,65,65,64});
        assertEquals(43, result);
    }


    @Test
    void example1_dp() {
        long result = solution.continuousSubarraysDPVerison(new int[]{5, 4, 2, 4});
        assertEquals(8, result);
    }

    @Test
    void example2_dp() {
        long result = solution.continuousSubarraysDPVerison(new int[]{1, 2, 3});
        assertEquals(6, result);
    }

}