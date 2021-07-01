package hard;

import java.util.List;

/**
 * @author Jack
 */
public class CountOfSmallerNumbersAfterSelf {
    public List<Integer> countSmaller(int[] nums) {
        Item[] items = new Item[nums.length];
        for (int i = 0; i < nums.length; i++)
            items[i] = new Item(i, nums[i]);
        mergeSort(items, 0, nums.length - 1);
        Integer[] result = new Integer[nums.length];
        for (Item item : items)
            result[item.idx] = item.cnt;
        return List.of(result);
    }

    private void mergeSort(Item[] items, int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            mergeSort(items, l, m);
            mergeSort(items, m + 1, r);
            mergeWithTmpArray(items, l, m, r);
        }
    }

    private void mergeWithTmpArray(Item[] items, int l, int m, int r) {
        Item[] tmp = new Item[r - l + 1];
        int idxL = m;
        int idxR = r;
        int rSideCnt = 0;
        while (idxL >= l && idxR >= m + 1) {
            if (items[idxR].val < items[idxL].val) {
                tmp[-l + idxR - m + idxL] = items[idxR];
                idxR--;
                rSideCnt++;
            } else {
                items[idxL].cnt += rSideCnt;
                tmp[-l + idxR - m + idxL] = items[idxL];
                idxL--;
            }
        }
        while (idxL >= l) {
            items[idxL].cnt += rSideCnt;
            tmp[-l + idxR - m + idxL] = items[idxL];
            idxL--;
        }
        while (idxR >= m + 1) {
            tmp[-l + idxR - m + idxL] = items[idxR];
            idxR--;
            rSideCnt++;
        }
        System.arraycopy(tmp, 0, items, l, tmp.length);
    }

    private static class Item {
        private final int val;
        private final int idx;
        private int cnt = 0;

        private Item(int idx, int val) {
            this.idx = idx;
            this.val = val;
        }
    }

    private void inPlaceMerge(Item[] items, int l, int m, int r) {
        int idxL = m;
        int idxR = r;
        int rSideCnt = 0;
        while (idxL >= l && idxR >= m + 1) {
            if (items[idxR].val < items[idxL].val) {
                idxR--;
                rSideCnt++;
            } else {
                Item item = items[idxL];
                item.cnt += rSideCnt;
                int index = idxL;

                while (index != idxR) {
                    items[index] = items[index + 1];
                    index++;
                }
                items[idxR] = item;

                idxL--;
                m--;
                idxR--;
            }
        }
        for (int i = l; i <= idxL; i++)
            items[i].cnt += rSideCnt;
    }
}
