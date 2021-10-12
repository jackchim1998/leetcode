package easy;

public abstract class GuessGame {
    private final int pick;

    public GuessGame(int pick) {
        this.pick = pick;
    }

    int guess(int guessNumber) {
        return Integer.compare(pick, guessNumber);
    }


    public static class GuessNumberHigherOrLower extends GuessGame {
        public GuessNumberHigherOrLower(int pick) {
            super(pick);
        }

        public int guessNumber(int n) {
            int low = 1;
            int high = n + 1;
            while (true) {
                int mid = low + (high - low) / 2;
                int result = guess(mid);
                if (result > 0)
                    low = mid + 1;
                else if (result < 0)
                    high = mid;
                else return mid;
            }
        }
    }
}
