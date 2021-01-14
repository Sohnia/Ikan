package com.ikan.tv.bean;

public class SearchHistoryBean {
    private long id;
    private String word;
    private long time;

    public SearchHistoryBean() {
    }

    public SearchHistoryBean(long id, String word, long time) {
        this.id = id;
        this.word = word;
        this.time = time;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "SearchHistoryBean{" +
                "id=" + id +
                ", word='" + word + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}
