package hard;

import java.util.List;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class NumberOfValidWordsForEachPuzzleTest {
    private final NumberOfValidWordsForEachPuzzle solution = new NumberOfValidWordsForEachPuzzle();

    @Test
    void example1() {
        String[] words = {"aaaa", "asas", "able", "ability", "actt", "actor", "access"};
        String[] puzzles = {"aboveyz", "abrodyz", "abslute", "absoryz", "actresz", "gaswxyz"};
        List<Integer> result = solution.findNumOfValidWords(words, puzzles);
        assertArrayEquals(new int[]{1, 1, 3, 2, 4, 0}, result.stream().mapToInt(i -> i).toArray());
    }

    @Test
    void example2() {
        String[] words = {"apple", "pleas", "please"};
        String[] puzzles = {"aelwxyz", "aelpxyz", "aelpsxy", "saelpxy", "xaelpsy"};
        List<Integer> result = solution.findNumOfValidWords(words, puzzles);
        assertArrayEquals(new int[]{0, 1, 3, 2, 0}, result.stream().mapToInt(i -> i).toArray());
    }
}