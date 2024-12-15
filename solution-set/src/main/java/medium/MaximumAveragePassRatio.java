package medium;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MaximumAveragePassRatio {
    public double maxAverageRatio(int[][] classes, int extraStudents) {
        PriorityQueue<Element> pq = new PriorityQueue<>((a, b) -> Double.compare(b.ratioIncrease, a.ratioIncrease));
        for (int[] clazz : classes) {
            Element ele = new Element(clazz[0], clazz[1]);
            pq.add(ele);
        }

        while (extraStudents > 0) {
            Element ele = pq.poll();
            Element newEle = new Element(ele.pass + 1, ele.total + 1);
            pq.add(newEle);
            extraStudents--;
        }

        double result = 0;
        while (!pq.isEmpty()) {
            Element ele = pq.poll();
            result += (double) ele.pass / ele.total;
        }
        return result / classes.length;
    }

    private static class Element {
        public final double ratioIncrease;
        public final int pass;
        public final int total;

        public Element(int pass, int total) {
            this.pass = pass;
            this.total = total;
            ratioIncrease = (double) (pass + 1) / (total + 1) - (double) pass / total;
        }
    }
}
