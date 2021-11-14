package easy;

public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] counts = new int[26];
        for (char c : magazine.toCharArray())
            counts[c - 'a']++;
        for (char c : ransomNote.toCharArray())
            if (--counts[c - 'a'] < 0)
                return false;
        return true;
    }
}
