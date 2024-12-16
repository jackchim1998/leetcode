package easy;

import java.util.Comparator;
import java.util.PriorityQueue;


public class FinalArrayStateAfterKMultiplicationOperationsI {
    /**
     * for small constraint, loop is faster
     * @param nums
     * @param k
     * @param multiplier
     * @return
     */
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        while (k>0){
            int minIdx = 0;
            for (int j=1;j<nums.length;j++) {
                if (nums[j] < nums[minIdx]) {
                    minIdx = j;
                }
            }
            nums[minIdx] *= multiplier;
            k--;
        }
        return nums;
    }

    public int[] getFinalStatePQVersion(int[] nums, int k, int multiplier) {
        PriorityQueue<Element> pq = new PriorityQueue<>(Comparator.comparingInt((Element a) -> a.number).thenComparingInt(a -> a.idx));
        for (int i = 0; i < nums.length; i++) {
            pq.add(new Element(i, nums[i]));
        }
        for (int i = 0; i < k; i++) {
            Element ele = pq.poll();
            ele.number *= multiplier;
            nums[ele.idx] = ele.number;
            pq.add(ele);
        }

        return nums;
    }

    private static class Element {
        public final int idx;
        public int number;

        public Element(int idx, int number) {
            this.idx = idx;
            this.number = number;
        }
    }
}
