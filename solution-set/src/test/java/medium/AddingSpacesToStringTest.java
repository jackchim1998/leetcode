package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddingSpacesToStringTest {
    private final AddingSpacesToString solution = new AddingSpacesToString();

    @Test
    void example1() {
        String result = solution.addSpaces("LeetcodeHelpsMeLearn", new int[]{8, 13, 15});
        assertEquals("Leetcode Helps Me Learn", result);
    }

    @Test
    void example2() {
        String result = solution.addSpaces("icodeinpython", new int[]{1,5,7,9});
        assertEquals("i code in py thon", result);
    }

    @Test
    void example3() {
        String result = solution.addSpaces("spacing", new int[]{0,1,2,3,4,5,6});
        assertEquals(" s p a c i n g", result);
    }

}