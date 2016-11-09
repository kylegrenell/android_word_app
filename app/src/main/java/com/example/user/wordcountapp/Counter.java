package com.example.user.wordcountapp;

/**
 * Created by user on 08/11/2016.
 */

public class Counter {

    private String mWords;

    public Counter(String sentence) {
        this.mWords = sentence;
    }

    public String getWords() {
        return this.mWords;
    }

    public int wordCount(){
        String words = getWords();
        String[] theWords = words.split(" ");
        int count = theWords.length;
        return count;
    }

}
