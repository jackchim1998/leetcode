package string.medium;

/**
 * @author Jack
 */
public class DetermineIfStringHalvesAreAlike {
    public boolean halvesAreAlike(String s) {
        char[] chars = s.toCharArray();
        int[] cnt = new int['z' - 'A' + 1];
        for (int i = 0; i < chars.length / 2; i++)
            cnt[chars[i] - 'A']++;
        for (int i = chars.length / 2; i < chars.length; i++)
            cnt[chars[i] - 'A']--;
        return cnt[0] + cnt['E' - 'A'] + cnt['I' - 'A'] + cnt['O' - 'A'] + cnt['U' - 'A'] + cnt['a' - 'A'] + cnt['e' - 'A'] + cnt['i' - 'A'] + cnt['o' - 'A'] + cnt['u' - 'A'] == 0;
    }
}
