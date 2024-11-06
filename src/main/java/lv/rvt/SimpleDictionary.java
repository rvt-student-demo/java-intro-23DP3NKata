package lv.rvt;
import java.util.*;

public class SimpleDictionary {
    private ArrayList<String> originalWord;
    private ArrayList<String> translatedWord;

    public SimpleDictionary() {
        this.originalWord = new ArrayList<>();
        this.translatedWord = new ArrayList<>();
    }

    public void add(String word, String translate) {
        this.originalWord.add(word);
        this.translatedWord.add(translate);
    }

    public String translate(String word) {
        for (int i = 0; i < originalWord.size(); i++) {
            if (this.originalWord.get(i).equals(word)) {
                return this.translatedWord.get(i);
            }
        } return null;
    }
}
