package easy;

/**
 * @author Jack
 */
public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        char[] mapping = new char[256];
        boolean[] matched = new boolean[256];
        char[] charsS = s.toCharArray();
        char[] charsT = t.toCharArray();
        for (int i = 0; i < charsS.length; i++) {
            char expected = mapping[charsS[i]];
            if (expected == 0) {
                if (matched[charsT[i]]) return false;
                mapping[charsS[i]] = charsT[i];
                matched[charsT[i]] = true;
            } else if (expected != charsT[i])
                return false;
        }
        return true;
    }
}
