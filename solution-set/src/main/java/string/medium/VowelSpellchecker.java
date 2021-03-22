package string.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Jack
 * q.966
 * 1 <= wordlist.length <= 5000
 * 1 <= queries.length <= 5000
 * 1 <= wordlist[i].length <= 7
 * 1 <= queries[i].length <= 7
 * All strings in wordlist and queries consist only of english letters.
 */
public class VowelSpellchecker {
    private final static Set<Character> VOWEL = Set.of('a', 'e', 'i', 'o', 'u');

    public String[] spellchecker(String[] wordlist, String[] queries) {
        LinkedHashSet<String> originalWordSet = new LinkedHashSet<>(Arrays.asList(wordlist));
        LinkedHashMap<String, List<String>> lowerCaseWordMap = lowerCaseWordMap(wordlist);
        LinkedHashMap<String, List<String>> vowelMap = vowelMap(wordlist);
        String[] result = new String[queries.length];
        for (int i = 0; i < queries.length; i++) {
            if (originalWordSet.contains(queries[i])) {
                result[i] = queries[i];
                continue;
            }
            List<String> lowerCaseList = lowerCaseWordMap.get(queries[i].toLowerCase());
            if (lowerCaseList != null) {
                result[i] = lowerCaseList.get(0);
                continue;
            }
            List<String> vowelList = vowelMap.get(toVowelA(queries[i]));
            if (vowelList != null) {
                result[i] = vowelList.get(0);
                continue;
            }
            result[i] = "";
        }
        return result;
    }

    private LinkedHashMap<String, List<String>> vowelMap(String[] wordlist) {
        LinkedHashMap<String, List<String>> map = new LinkedHashMap<>();
        for (String word : wordlist) {
            String vowel = toVowelA(word);
            List<String> curr = map.getOrDefault(vowel, new ArrayList<>());
            curr.add(word);
            map.put(vowel, curr);
        }
        return map;
    }

    private String toVowelA(String word) {
        StringBuilder sb = new StringBuilder();
        for (char c : word.toLowerCase().toCharArray())
            sb.append(VOWEL.contains(c) ? 'a' : c);
        return sb.toString();
    }

    private LinkedHashMap<String, List<String>> lowerCaseWordMap(String[] wordlist) {
        LinkedHashMap<String, List<String>> map = new LinkedHashMap<>();
        for (String word : wordlist) {
            String lowerCase = word.toLowerCase();
            List<String> curr = map.getOrDefault(lowerCase, new ArrayList<>());
            curr.add(word);
            map.put(lowerCase, curr);
        }
        return map;
    }

}
