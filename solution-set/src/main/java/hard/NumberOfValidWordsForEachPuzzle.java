package hard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NumberOfValidWordsForEachPuzzle {
    public List<Integer> findNumOfValidWords(String[] words, String[] puzzles) {
        Map<Character, List<Integer>> map = new HashMap<>();
        for (String word : words) {
            int binWord = toBin(word);
            for (int i = 0; i < 26; i++)
                if ((binWord & 1 << i) != 0)
                    map.computeIfAbsent((char) ('a' + i), key -> new ArrayList<>()).add(binWord);
        }

        List<Integer> result = new ArrayList<>();
        for (String puzzle : puzzles) {
            int cnt = 0;
            int binPuzzle = toBin(puzzle);
            int firstCharBin = 1 << puzzle.charAt(0) - 'a';
            for (Integer binWord : map.getOrDefault(puzzle.charAt(0), List.of()))
                if ((binWord & firstCharBin) != 0 && (binPuzzle ^ binWord | binPuzzle) == binPuzzle)
                    cnt++;
            result.add(cnt);
        }
        return result;
    }

    private int toBin(String word) {
        int bin = 0;
        for (char c : word.toCharArray())
            bin |= 1 << (c - 'a');
        return bin;
    }
}
