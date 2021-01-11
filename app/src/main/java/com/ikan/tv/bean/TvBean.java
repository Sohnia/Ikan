package com.android.ikan.bean;

import java.util.List;

public class TvBean {
    private String name;
    private String tvType;
    private String lang;
    private String pic;
    private String area;
    private String year;
    private int state;
    private String actor;
    private String director;
    private String description;
    private String picUrl;
    private List<String> playM3u8List;
    private List<String> shareList;

    public TvBean() {
    }

    public TvBean(String name, String tvType, String lang, String pic, String area, String year, int state, String actor, String director, String description, String picUrl, List<String> playM3u8List, List<String> shareList) {
        this.name = name;
        this.tvType = tvType;
        this.lang = lang;
        this.pic = pic;
        this.area = area;
        this.year = year;
        this.state = state;
        this.actor = actor;
        this.director = director;
        this.description = description;
        this.picUrl = picUrl;
        this.playM3u8List = playM3u8List;
        this.shareList = shareList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTvType() {
        return tvType;
    }

    public void setTvType(String tvType) {
        this.tvType = tvType;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public List<String> getPlayM3u8List() {
        return playM3u8List;
    }

    public void setPlayM3u8List(List<String> playM3u8List) {
        this.playM3u8List = playM3u8List;
    }

    public List<String> getShareList() {
        return shareList;
    }

    public void setShareList(List<String> shareList) {
        this.shareList = shareList;
    }

    @Override
    public String toString() {
        return "TvBean{" +
                "name='" + name + '\'' +
                ", tvType='" + tvType + '\'' +
                ", lang='" + lang + '\'' +
                ", pic='" + pic + '\'' +
                ", area='" + area + '\'' +
                ", year='" + year + '\'' +
                ", state=" + state +
                ", actor='" + actor + '\'' +
                ", director='" + director + '\'' +
                ", description='" + description + '\'' +
                ", picUrl='" + picUrl + '\'' +
                ", playM3u8List=" + playM3u8List +
                ", shareList=" + shareList +
                '}';
    }
}
