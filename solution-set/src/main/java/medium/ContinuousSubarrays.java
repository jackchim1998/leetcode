package medium;

import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.Deque;
import java.util.PriorityQueue;

public class ContinuousSubarrays {

    public long continuousSubarrays(int[] nums) {
        Deque<Integer> minQ = new ArrayDeque<>();
        Deque<Integer> maxQ = new ArrayDeque<>();

        long result = 0;
        int startIdx = 0;
        for (int i = 0; i < nums.length; i++) {
            while (!maxQ.isEmpty() && nums[maxQ.peekLast()] < nums[i]) {
                maxQ.pollLast();
            }
            maxQ.offerLast(i);

            while (!minQ.isEmpty() && nums[minQ.peekLast()] > nums[i]) {
                minQ.pollLast();
            }
            minQ.offerLast(i);

            while (!maxQ.isEmpty() && !minQ.isEmpty() && nums[maxQ.peekFirst()] - nums[minQ.peekFirst()] > 2) {
                if (maxQ.peekFirst() < minQ.peekFirst()) { // decreasing
                    startIdx = maxQ.pollFirst() + 1;
                } else { // increasing
                    startIdx = minQ.pollFirst() + 1;
                }
            }

            result += i-startIdx+1;
        }

        return result;
    }

    public long continuousSubarraysPQVersion(int[] nums) {
        PriorityQueue<Integer> minPQ = new PriorityQueue<>();
        PriorityQueue<Integer> maxPQ = new PriorityQueue<>(Comparator.reverseOrder());

        long result = 0;
        int startIdx = 0;
        for (int num : nums) {
            minPQ.add(num);
            maxPQ.add(num);
            if (maxPQ.peek() - minPQ.peek() <= 2) {
                result += maxPQ.size();
            } else {
                while (maxPQ.peek() - minPQ.peek() > 2) {
                    minPQ.remove(nums[startIdx]);
                    maxPQ.remove(nums[startIdx]);
                    startIdx++;
                }
                result += maxPQ.size();
            }
        }

        return result;
    }

    public long continuousSubarraysDPVerison(int[] nums) {
        long[][][] cnt = new long[nums.length][nums.length][3];
        dp(nums, cnt, 0, nums.length - 1);
        return cnt[0][nums.length - 1][0];
    }

    private void dp(int[] nums, long[][][] cnt, int start, int end) {
        if (start == end) {
            cnt[start][end][0] = 1;
            cnt[start][end][1] = nums[start];
            cnt[start][end][2] = nums[start];
            return;
        }
        if (cnt[start][end][1] != 0) {
            return;
        }

        dp(nums, cnt, start + 1, end);
        dp(nums, cnt, start, end - 1);

        cnt[start][end][0] = cnt[start + 1][end][0] + cnt[start][end - 1][0];
        if (end - start >= 2) {
            dp(nums, cnt, start + 1, end - 1);
            cnt[start][end][0] -= cnt[start + 1][end - 1][0];
        }

        cnt[start][end][1] = Math.min(cnt[start + 1][end][1], nums[start]);
        cnt[start][end][2] = Math.max(cnt[start + 1][end][2], nums[start]);
        cnt[start][end][0] += cnt[start][end][2] - cnt[start][end][1] <= 2 ? 1 : 0;
    }
}
