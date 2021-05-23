package graph.medium;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Jack
 */
class NQueensTest {
    private final NQueens solution = new NQueens();

    @Test
    void example1() {
        List<List<String>> result = solution.solveNQueens(4);
        assertEquals(2, result.size());
        validate(new String[]{".Q..", "...Q", "Q...", "..Q."}, result.get(0));
        validate(new String[]{"..Q.", "Q...", "...Q", ".Q.."}, result.get(1));
    }

    private void validate(String[] expectedList, List<String> result) {
        for (int i = 0; i < expectedList.length; i++)
            assertEquals(expectedList[i], result.get(i));
    }


}
