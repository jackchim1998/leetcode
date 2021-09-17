package medium;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> result = new ArrayList<>();
        int minX = 0;
        int minY = 0;
        int maxX = matrix.length - 1;
        int maxY = matrix[0].length - 1;
        while (true) {
            for (int i = minY; i <= maxY; i++)
                result.add(matrix[minX][i]);
            minX++;
            if (minX > maxX) break;

            for (int i = minX; i <= maxX; i++)
                result.add(matrix[i][maxY]);
            maxY--;
            if (minY > maxY) break;

            for (int i = maxY; i >= minY; i--)
                result.add(matrix[maxX][i]);
            maxX--;
            if (minX > maxX) break;

            for (int i = maxX; i >= minX; i--)
                result.add(matrix[i][minY]);
            minY++;
            if (minY > maxY) break;
        }
        return result;
    }

}
