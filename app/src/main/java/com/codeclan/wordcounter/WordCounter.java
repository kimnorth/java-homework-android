package com.codeclan.wordcounter;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by user on 14/03/2017.
 */

public class WordCounter {

    ArrayList<String> wordList;
    HashMap<String, Integer> wordOccurances;

    public WordCounter() {
        this.wordList = new ArrayList<String>();
    }

    public int getWordListLength() {
        return wordList.size();
    }

    public void addPhrase(String phrase) {

        String[] words = phrase.split(" ");
        for (String word : words) {
            wordList.add(word);
        }
    }

    public HashMap getWordOccurances() {
        wordOccurances = new HashMap<String, Integer>();
        int instance = 0;
        for (String word : wordList) {
            if (wordList.contains(word)) {
                instance++;
            }
            wordOccurances.put(word, instance);
        }
        return wordOccurances;

        // Will need to initialize a counter for each word,

    }
}
