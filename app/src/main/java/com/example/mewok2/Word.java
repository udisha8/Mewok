package com.example.mewok2;

public class Word {
    private String engWord, mewokWord;
    private int NO_IMAGE_PROVIDED = -1, imageResourceID = NO_IMAGE_PROVIDED;
    private int audioResourceID;

    public Word(String e, String m, int imageid, int audioID) {
        engWord = e;
        mewokWord = m;
        imageResourceID = imageid;
        audioResourceID = audioID;
    }

    public Word(String e, String m, int audioID) {
        engWord = e;
        mewokWord = m;
        audioResourceID = audioID;
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

    public int getAudioResourceID() {
        return audioResourceID;
    }

    public boolean hasImage() {
        return (imageResourceID != NO_IMAGE_PROVIDED);
    }
}
