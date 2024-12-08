package medium;

import java.util.Arrays;

public class VowelsOfAllSubstrings {
    /*
    abcd
    a ab abc abcd
    b bc bcd
    c cd
    d

    a=4 = (4 - 0) * (0 + 1)
    b=6 = (4 - 1) * (1 + 1)
    c=6 = (4 - 2) * (2 + 1)
    d=4 = (4 - 3) * (3 + 1)
     */

    boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    public long countVowels(String word) {
        long count = 0;
        int len = word.length();

        for(int pos = 0; pos < len; pos++) {
            if(isVowel(word.charAt(pos))) {
                count += (long)(len - pos) * (long)(pos + 1);
            }
        }

        return count;
    }
}
