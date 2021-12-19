package medium;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

class DecodeStringTest {
    private final DecodeString solution = new DecodeString();

    @Test
    void example1() {
        String result = solution.decodeString("3[a]2[bc]");
        assertEquals("aaabcbc", result);
    }

    @Test
    void example2() {
        String result = solution.decodeString("2[abc]3[cd]ef");
        assertEquals("abcabccdcdcdef", result);
    }

    @Test
    void example3() {
        String result = solution.decodeString("abc3[cd]xyz");
        assertEquals("abccdcdcdxyz", result);
    }

}