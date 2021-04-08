package string.medium;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Jack
 */
class LetterCombinationsOfAPhoneNumberTest {
    private final LetterCombinationsOfAPhoneNumber solution = new LetterCombinationsOfAPhoneNumber();

    @Test
    void example1() {
        List<String> ans = solution.letterCombinations("23");
        validate(new String[]{"ad", "bd", "cd", "ae", "be", "ce", "af", "bf", "cf"}, ans);
    }

    private void validate(String[] expected, List<String> ans) {
        assertEquals(expected.length, ans.size());
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], ans.get(i));
        }

    }

}
