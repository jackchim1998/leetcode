package bfs.hard;

import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

/**
 * @author Jack
 * q.773
 */
public class SlidingPuzzle {
    public int slidingPuzzle(int[][] board) {
        Deque<Item> queue = new LinkedList<>();
        Set<Item> visited = new HashSet<>();
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 3; j++)
                if (board[i][j] == 0)
                    queue.add(new Item(0, board.clone(), i, j));
        Item target = new Item(0, targetBoard(), 1, 2);
        while (!queue.isEmpty()) {
            Item item = queue.pollFirst();
            visited.add(item);
            if (target.equals(item))
                return item.round;
            if (item.x > 0) {
                Item newItem = new Item(item.round + 1, newBoard(item.board, item.x, item.y, -1, 0), item.x - 1, item.y);
                if (!visited.contains(newItem))
                    queue.add(newItem);
            } else {
                Item newItem = new Item(item.round + 1, newBoard(item.board, item.x, item.y, 1, 0), item.x + 1, item.y);
                if (!visited.contains(newItem))
                    queue.add(newItem);
            }
            if (item.y > 0) {
                Item newItem = new Item(item.round + 1, newBoard(item.board, item.x, item.y, 0, -1), item.x, item.y - 1);
                if (!visited.contains(newItem))
                    queue.add(newItem);
            }
            if (item.y < 2) {
                Item newItem = new Item(item.round + 1, newBoard(item.board, item.x, item.y, 0, +1), item.x, item.y + 1);
                if (!visited.contains(newItem))
                    queue.add(newItem);
            }
        }
        return -1;
    }

    private int[][] targetBoard() {
        int[][] newBoard = new int[2][3];
        newBoard[0][0] = 1;
        newBoard[0][1] = 2;
        newBoard[0][2] = 3;
        newBoard[1][0] = 4;
        newBoard[1][1] = 5;
        return newBoard;
    }

    private int[][] newBoard(int[][] board, int x, int y, int i, int j) {
        int[][] newBoard = new int[2][3];
        newBoard[0] = board[0].clone();
        newBoard[1] = board[1].clone();
        newBoard[x][y] = newBoard[x + i][y + j];
        newBoard[x + i][y + j] = 0;
        return newBoard;
    }

    private static class Item {
        final int round;
        final int[][] board;
        final int x;
        final int y;

        public Item(int round, int[][] board, int x, int y) {
            this.round = round;
            this.board = board;
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object o) {
            // In performance consideration, don't check param
//            if (this == o) return true;
//            if (o == null || getClass() != o.getClass()) return false;

            Item item = (Item) o;

            if (board[0][0] != item.board[0][0]) return false;
            if (board[0][1] != item.board[0][1]) return false;
            if (board[0][2] != item.board[0][2]) return false;
            if (board[1][0] != item.board[1][0]) return false;
            if (board[1][1] != item.board[1][1]) return false;
            return board[1][2] == item.board[1][2];
        }

        @Override
        public int hashCode() {
            int result = board[0][0];
            result = 31 * result + board[0][1];
            result = 31 * result + board[0][2];
            result = 31 * result + board[1][0];
            result = 31 * result + board[1][1];
            result = 31 * result + board[1][2];
            return result;
        }
    }
}
