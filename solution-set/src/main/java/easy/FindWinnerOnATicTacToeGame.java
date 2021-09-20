package easy;

public class FindWinnerOnATicTacToeGame {
    public String tictactoe(int[][] moves) {
        int[] rows = new int[3];
        int[] cols = new int[3];
        int diagonal = 0;
        int reverseDiagonal = 0;
        int player = 1;

        for (int[] move : moves) {
            rows[move[0]] += player;
            cols[move[1]] += player;
            if (move[0] == move[1])
                diagonal += player;
            if (move[0] + move[1] == 2)
                reverseDiagonal += player;

            if (Math.abs(rows[move[0]]) == 3 || Math.abs(cols[move[1]]) == 3 || Math.abs(diagonal) == 3 || Math.abs(reverseDiagonal) == 3)
                return player == 1 ? "A" : "B";
            player *= -1;
        }
        return moves.length == 9 ? "Draw" : "Pending";
    }

}
