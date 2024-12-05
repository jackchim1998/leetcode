package medium;

public class MovePiecesToObtainAString {
    public boolean canChange(String start, String target) {
        char[] a = start.toCharArray();
        char[] b = target.toCharArray();
        int i=0;
        int j=0;

        while (i < a.length && j<b.length) {
            while (i< a.length) {
                if (a[i] != '_') {
                    break;
                }
                i++;
            }
            while (j< b.length) {
                if (b[j] != '_') {
                    break;
                }
                j++;
            }
            if (i >= a.length || j >= b.length) {
                break;
            }
            if (a[i] != b[j]) {
                return false;
            }
            if (a[i] == 'L' && j>i) {
                return false;
            }
            if (a[i] == 'R' && i>j) {
                return false;
            }
            i++;
            j++;
        }
        while (i< a.length) {
            if (a[i] != '_') {
                return false;
            }
            i++;
        }
        while (j< b.length) {
            if (b[j] != '_') {
                return false;
            }
            j++;
        }
        return true;
    }
}
