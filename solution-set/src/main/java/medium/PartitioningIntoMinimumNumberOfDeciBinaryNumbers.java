package medium;

/**
 * @author Jack
 */
public class PartitioningIntoMinimumNumberOfDeciBinaryNumbers {
    public int minPartitions(String n) {
        int max = '0';
        for (char c : n.toCharArray())
            max = Math.max(max, c);
        return max - '0';
    }
}
