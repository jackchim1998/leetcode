package medium;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.ToIntFunction;

public class SortCharactersByFrequency {
    public String frequencySort(String s) {
        Element[] elements = new Element[62];
        for (int i = 0; i < 10; i++)
            elements[i] = new Element((char) ('0' + i));
        for (int i = 0; i < 26; i++) {
            elements[i + 10] = new Element((char) ('A' + i));
            elements[i + 36] = new Element((char) ('a' + i));
        }
        for (char c : s.toCharArray())
            if (c <= '9') elements[c - '0'].count++;
            else if (c >= 'a') elements[c - 'a' + 36].count++;
            else elements[c - 'A' + 10].count++;

        Arrays.sort(elements, Comparator.comparingInt((ToIntFunction<Element>) value -> value.count).reversed());

        StringBuilder result = new StringBuilder(s.length());
        for (Element element : elements)
            result.append(String.valueOf(element.character).repeat(element.count));

        return result.toString();
    }

    private static class Element {
        private int count = 0;
        private final char character;

        Element(char character) {
            this.character = character;
        }
    }
}
