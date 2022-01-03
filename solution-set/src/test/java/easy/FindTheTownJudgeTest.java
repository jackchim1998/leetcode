package easy;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

class FindTheTownJudgeTest {
    private final FindTheTownJudge solution = new FindTheTownJudge();

    @Test
    void example1() {
        int result = solution.findJudge(2, new int[][]{
                {1, 2}
        });
        assertEquals(2, result);
    }

    @Test
    void example2() {
        int result = solution.findJudge(3, new int[][]{
                {1, 3},
                {2, 3}
        });
        assertEquals(3, result);
    }

    @Test
    void example3() {
        int result = solution.findJudge(3, new int[][]{
                {1, 3},
                {2, 3},
                {3, 1}
        });
        assertEquals(-1, result);
    }
}