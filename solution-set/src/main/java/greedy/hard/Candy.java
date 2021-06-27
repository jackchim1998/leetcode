package greedy.hard;

/**
 * @author Jack
 */
public class Candy {
    public int candy(int[] ratings) {
        int[] candies = new int[ratings.length];
        for (int i = 0; i < ratings.length; i++)
            if (candies[i] == 0)
                calculate(ratings, candies, i);
        int sum = 0;
        for (int candy : candies)
            sum += candy;
        return sum;
    }

    private void calculate(int[] ratings, int[] candies, int i) {
        int candy = 1;
        if (i > 0 && ratings[i - 1] < ratings[i]) {
            if (candies[i - 1] == 0) calculate(ratings, candies, i - 1);
            candy = Math.max(candy, candies[i - 1] + 1);
        }
        if (i < candies.length - 1 && ratings[i + 1] < ratings[i]) {
            if (candies[i + 1] == 0)  calculate(ratings, candies, i + 1);
            candy = Math.max(candy, candies[i + 1] + 1);
        }
        candies[i] = candy;
    }
}
