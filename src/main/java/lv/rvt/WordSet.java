package lv.rvt;
import java.util.*;

public class WordSet {
    private ArrayList<String> words;

    public WordSet() {
        this.words = new ArrayList<>();
    }

    public void add(String word) {
        this.words.add(word);
    }

    public boolean contains(String word) {
        return this.words.contains(word);
    }

    public boolean isPalindrom(String word) {
        int end = word.length() - 1;

        int i = 0;
        while (i < word.length() / 2) {
            if (word.charAt(i) != word.charAt(end - i)) {
                return false;
            }

            i++;
        }

        return true;
    }

    public int palindromes() {
        int count = 0;

        for (String word: this.words) {
            if (isPalindrom(word)) {
                count++;
            }
        }
        return count;
    }
}
