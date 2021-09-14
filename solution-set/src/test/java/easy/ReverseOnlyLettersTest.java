package easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReverseOnlyLettersTest {
    private final ReverseOnlyLetters solution = new ReverseOnlyLetters();

    @Test
    void example1() {
        String result = solution.reverseOnlyLetters("ab-cd");
        assertEquals("dc-ba", result);
    }

    @Test
    void example2() {
        String result = solution.reverseOnlyLetters("a-bC-dEf-ghIj");
        assertEquals("j-Ih-gfE-dCba", result);
    }

    @Test
    void example3() {
        String result = solution.reverseOnlyLetters("Test1ng-Leet=code-Q!");
        assertEquals("Qedo1ct-eeLg=ntse-T!", result);
    }
}