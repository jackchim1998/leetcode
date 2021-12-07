package medium;

public class MinimumGardenPerimeterToCollectEnoughApples {
    public long minimumPerimeter(long neededApples) {
        long l = 1, r = 100000;
        do {
            long m = (l + r) / 2;
            if (m * m * m * 4 + m * m * 6 + m * 2 >= neededApples)
                r = m;
            else
                l = m + 1;
        } while (l < r);
        return l * 8;
    }
}
