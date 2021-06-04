package bfs.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Jack
 */
public class OpenTheLock {
    public int openLock(String[] deadends, String target) {
        boolean[] dead = new boolean[10000];
        List<Integer> list = new ArrayList<>();
        list.add(Integer.parseInt(target));
        for (String deadend : deadends) {
            int i = Integer.parseInt(deadend);
            if (i == 0) return -1;
            dead[i] = true;
        }
        int level = 0;
        while (!list.isEmpty()) {
            List<Integer> newList = new ArrayList<>();
            for (Integer ele : list) {
                if (ele == 0) return level;
                for (int i = 10; i <= 10000; i *= 10) {
                    int value1 = (ele + (i / 10)) % i + ele / i * i;
                    if (!dead[value1]) {
                        dead[value1] = true;
                        newList.add(value1);
                    }
                    int value2 = (ele + 9 * i / 10) % i + ele / i * i;
                    if (!dead[value2]) {
                        dead[value2] = true;
                        newList.add(value2);
                    }
                }
            }
            level++;
            list = newList;
        }
        return -1;
    }

}
