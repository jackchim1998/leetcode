package medium;

import java.util.PriorityQueue;

/**
 * @author Jack
 */
public class FurthestBuildingYouCanReach {
    public int furthestBuilding(int[] heights, int bricks, int ladders) { // this is quicker because we use bricks firstly to reduce operations to change to ladders
        PriorityQueue<Integer> pq = new PriorityQueue<>((o1, o2) -> o2 - o1);
        for (int i = 1; i < heights.length; i++) {
            int diff = heights[i] - heights[i - 1];
            if (diff > 0) {
                pq.add(diff);
                bricks -= diff;
            }
            if (bricks < 0) {
                if (ladders > 0) {
                    ladders--;
                    bricks += pq.poll();
                } else return i - 1;
            }
        }
        return heights.length - 1;
    }
    /**
     * The below is using asc priority queue which means use ladders first, and pop least height to use bricks
     * It is slower because we need to do this operation many times
     */
//    public int furthestBuilding(int[] heights, int bricks, int ladders) {
//        PriorityQueue<Integer> pq = new PriorityQueue<>();
//        for (int i = 1; i < heights.length; i++) {
//            int diff = heights[i] - heights[i-1];
//            if (diff > 0) pq.add(diff);
//            if (pq.size() > ladders) bricks -= pq.poll();
//            if (bricks < 0) return i - 1;
//        }
//        return heights.length-1;
//    }
}
