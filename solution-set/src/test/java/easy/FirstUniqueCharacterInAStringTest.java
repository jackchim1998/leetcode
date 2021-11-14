package easy;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

class FirstUniqueCharacterInAStringTest {
    private final FirstUniqueCharacterInAString solution = new FirstUniqueCharacterInAString();

    @Test
    void example1() {
        int result = solution.firstUniqChar("leetcode");
        assertEquals(0, result);
    }

    @Test
    void example2() {
        int result = solution.firstUniqChar("loveleetcode");
        assertEquals(2, result);
    }

    @Test
    void example3() {
        int result = solution.firstUniqChar("aabb");
        assertEquals(-1, result);
    }
}