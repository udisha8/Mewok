package com.example.mewok2;

public class Word {
    private String engWord, mewokWord;
    private int NO_IMAGE_PROVIDED = -1, imageResourceID = NO_IMAGE_PROVIDED;

    public Word(String e, String m, int id) {
        engWord = e;
        mewokWord = m;
        imageResourceID = id;
    }

    public Word(String e, String m) {
        engWord = e;
        mewokWord = m;
    }

    public String getMewokWord() {
        return mewokWord;
    }

    public String getEngWord() {
        return engWord;
    }

    public int getImageResourceID() {
        return imageResourceID;
    }

    public boolean hasImage() {
        return (imageResourceID != NO_IMAGE_PROVIDED);
    }
}
