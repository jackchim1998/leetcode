package medium;

/**
 * @author Jack
 */
public class CustomSortString {
    public String customSortString(String order, String str) {
        StringBuilder sb = new StringBuilder(str.length());
        char[] counts = new char[26];
        for (char c : str.toCharArray())
            counts[c - 'a']++;
        for (char c : order.toCharArray()) {
            sb.append(String.valueOf(c).repeat(counts[c - 'a']));
            counts[c - 'a'] = 0;
        }
        for (int i = 0; i < counts.length; i++)
            sb.append(String.valueOf((char) ('a' + i)).repeat(counts[i]));
        return sb.toString();
    }
}
