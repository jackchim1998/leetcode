package easy;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

class GuessGameTest {
    @Test
    void example1 () {
        int pick = 1702766719;
        int n = 2126753390;
        GuessGame.GuessNumberHigherOrLower solution = new GuessGame.GuessNumberHigherOrLower(pick);
        assertEquals(pick, solution.guessNumber(n));
    }

}