package com.codeclan.wordcounter;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class WordCounterTest {

    WordCounter wordCounter;

    @Before
    public void before() {
        wordCounter = new WordCounter();
    }

    @Test
    public void hasArrayList(){
        assertEquals( 0, wordCounter.getWordListLength() );
    }

    @Test
    public void arrayListHasWords(){
        wordCounter = new WordCounter();
        wordCounter.addPhrase("This is a test");
        assertEquals( 4, wordCounter.getWordListLength() );
    }
}