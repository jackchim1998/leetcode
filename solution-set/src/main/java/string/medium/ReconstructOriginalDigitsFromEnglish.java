package string.medium;

/**
 * @author Jack
 */
public class ReconstructOriginalDigitsFromEnglish {
    // zero, one, two, three, four, five, six, seven, eight, nine

    /*
     * 4. e 0, 1, 3, 5, 7, 8, 9
     * 5. f 4, 5
     * 6. g 8
     * 7. h 3, 8
     * 8. i 5, 6, 8, 9
     * 13. n 1, 7, 9
     * 14. o 0, 1, 2, 4
     * 17. r 0, 3, 4
     * 18. s 6, 7
     * 19. t 2, 3, 8
     * 20. u 4
     * 21. v 5, 7
     * 22. w 2
     * 23. x 6
     * 25. z 0
     */
    public String originalDigits(String s) {
        int[] letters = new int[26];
        int[] cnt = new int[10];
        StringBuilder sb = new StringBuilder(50000 / 3 + 1);
        for (char c : s.toCharArray())
            letters[c - 'a']++;
        cnt[0] = handle0(letters);
        cnt[2] = handle2(letters);
        cnt[4] = handle4(letters);
        cnt[6] = handle6(letters);
        cnt[8] = handle8(letters);
        cnt[3] = handle3(letters);
        cnt[5] = handle5(letters);
        cnt[7] = handle7(letters);
        cnt[9] = handle9(letters);
        cnt[1] = handle1(letters);
        for (int i = 0; i < 10; i++)
            sb.append(String.valueOf(i).repeat(Math.max(0, cnt[i])));
        return sb.toString();
    }

    private int handle1(int[] letters) {
        int cnt = letters[13];
        letters[4] -= cnt;
        letters[14] -= cnt;
        letters[13] -= cnt;
        return cnt;
    }

    private int handle9(int[] letters) {
        int cnt = letters[8];
        letters[4] -= cnt;
        letters[8] -= cnt;
        letters[13] -= cnt * 2;
        return cnt;
    }

    private int handle7(int[] letters) {
        int cnt = letters[21];
        letters[4] -= cnt * 2;
        letters[13] -= cnt;
        letters[18] -= cnt;
        letters[21] -= cnt;
        return cnt;
    }

    private int handle5(int[] letters) {
        int cnt = letters[5];
        letters[4] -= cnt;
        letters[5] -= cnt;
        letters[8] -= cnt;
        letters[21] -= cnt;
        return cnt;
    }

    private int handle3(int[] letters) {
        int cnt = letters[7];
        letters[4] -= cnt * 2;
        letters[7] -= cnt;
        letters[17] -= cnt;
        letters[19] -= cnt;
        return cnt;
    }

    private int handle8(int[] letters) {
        int cnt = letters[6];
        letters[4] -= cnt;
        letters[6] -= cnt;
        letters[7] -= cnt;
        letters[8] -= cnt;
        letters[19] -= cnt;
        return cnt;
    }

    private int handle6(int[] letters) {
        int cnt = letters[23];
        letters[8] -= cnt;
        letters[18] -= cnt;
        letters[23] -= cnt;
        return cnt;
    }

    private int handle4(int[] letters) {
        int cnt = letters[20];
        letters[5] -= cnt;
        letters[14] -= cnt;
        letters[17] -= cnt;
        letters[20] -= cnt;
        return cnt;
    }

    private int handle2(int[] letters) {
        int cnt = letters[22];
        letters[14] -= cnt;
        letters[19] -= cnt;
        letters[22] -= cnt;
        return cnt;
    }

    private int handle0(int[] letters) {
        int cnt = letters[25];
        letters[4] -= cnt;
        letters[4] -= cnt;
        letters[14] -= cnt;
        letters[17] -= cnt;
        return cnt;
    }
}
