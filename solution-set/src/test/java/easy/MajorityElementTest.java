package easy;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

class MajorityElementTest {
    private final MajorityElement solution = new MajorityElement();

    @Test
    void example1() {
        int result = solution.majorityElement(new int[]{3, 2, 3});
        assertEquals(3, result);
    }

    @Test
    void example2() {
        int result = solution.majorityElement(new int[]{2, 2, 1, 1, 1, 2, 2});
        assertEquals(2, result);
    }
}