package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Jack
 */
class VowelSpellcheckerTest {
    private final VowelSpellchecker solution = new VowelSpellchecker();

    @Test
    void example1() {
        String[] result = solution.spellchecker(new String[]{"KiTe", "kite", "hare", "Hare"}, new String[]{"kite", "Kite", "KiTe", "Hare", "HARE", "Hear", "hear", "keti", "keet", "keto"});
        validate(new String[]{"kite", "KiTe", "KiTe", "Hare", "hare", "", "", "KiTe", "", "KiTe"}, result);
    }

    private void validate(String[] expected, String[] actual) {
        assertEquals(expected.length, actual.length);
        for (int i = 0; i < actual.length; i++)
            assertEquals(expected[i], actual[i]);
    }
}
