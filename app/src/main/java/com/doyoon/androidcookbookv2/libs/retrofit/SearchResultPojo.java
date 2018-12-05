package com.doyoon.androidcookbookv2.libs.retrofit;

public class SearchResultPojo {
    private String word;
    private String sentence;



    private String info;

    public SearchResultPojo(String word, String sentence, String info) {
        this.word = word;
        this.sentence = sentence;
        this.info = info;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }


    public String getSentence() {
        return sentence;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }
    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }



    @Override
    public String toString() {
        return this.word + this.sentence + this.info;
    }
}
