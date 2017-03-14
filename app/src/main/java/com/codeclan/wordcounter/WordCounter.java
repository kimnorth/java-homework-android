package com.codeclan.wordcounter;

import java.util.ArrayList;

/**
 * Created by user on 14/03/2017.
 */

public class WordCounter {

    ArrayList<String> wordList;

    public WordCounter(){
        this.wordList = new ArrayList<String>();
    }

    public int getWordListLength() {
        return wordList.size();
    }

    public void addPhrase(String phrase){

        String[] words = phrase.split(" ");
        for (String word : words){
            wordList.add(word);
        }
    }

}
