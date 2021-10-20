package medium;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class ReverseWordsInAStringTest {
    private final ReverseWordsInAString solution = new ReverseWordsInAString();

    @Test
    void example1() {
        String result = solution.reverseWords("the sky is blue");
        assertEquals("blue is sky the", result);
    }

    @Test
    void example2() {
        String result = solution.reverseWords("  hello world  ");
        assertEquals("world hello", result);
    }

    @Test
    void example3() {
        String result = solution.reverseWords("a good   example");
        assertEquals("example good a", result);
    }

    @Test
    void example4() {
        String result = solution.reverseWords("  Bob    Loves  Alice   ");
        assertEquals("Alice Loves Bob", result);
    }

    @Test
    void example5() {
        String result = solution.reverseWords("Alice does not even like bob");
        assertEquals("bob like even not does Alice", result);
    }

}