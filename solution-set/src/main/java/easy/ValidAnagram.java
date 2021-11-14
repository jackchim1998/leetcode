package easy;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        int[] counts = new int[26];
        for (char c : s.toCharArray())
            counts[c - 'a']++;
        for (char c : t.toCharArray())
            if (--counts[c - 'a'] < 0)
                return false;
        for (int count : counts)
            if (count != 0)
                return false;
        return true;
    }
}
