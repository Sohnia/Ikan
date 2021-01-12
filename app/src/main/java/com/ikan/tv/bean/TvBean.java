package com.ikan.tv.bean;


import com.ikan.tv.dao.db.SourceDb;
import java.util.List;

public class TvBean {
    private String name;
    private String requireId;
    private String tvType;
    private String lang;
    private String pic;
    private String area;
    private String year;
    private int state;
    private String actor;
    private String director;
    private String description;
    private List<String> playM3u8List;
    private List<String> shareList;
    private SourceDb sourceDb;
    private int lastWatch;
    private int videoProgress;

    public TvBean() {
    }

    public TvBean(String name, String requireId, String tvType, String lang, String pic, String area, String year, int state, String actor, String director, String description, List<String> playM3u8List, List<String> shareList, SourceDb sourceDb, int lastWatch, int videoProgress) {
        this.name = name;
        this.requireId = requireId;
        this.tvType = tvType;
        this.lang = lang;
        this.pic = pic;
        this.area = area;
        this.year = year;
        this.state = state;
        this.actor = actor;
        this.director = director;
        this.description = description;
        this.playM3u8List = playM3u8List;
        this.shareList = shareList;
        this.sourceDb = sourceDb;
        this.lastWatch = lastWatch;
        this.videoProgress = videoProgress;
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

    public SourceDb getSourceDb() {
        return sourceDb;
    }

    public void setSourceDb(SourceDb sourceDb) {
        this.sourceDb = sourceDb;
    }

    public int getLastWatch() {
        return lastWatch;
    }

    public void setLastWatch(int lastWatch) {
        this.lastWatch = lastWatch;
    }

    public int getVideoProgress() {
        return videoProgress;
    }

    public void setVideoProgress(int videoProgress) {
        this.videoProgress = videoProgress;
    }

    @Override
    public String toString() {
        return "TvBean{" +
                "name='" + name + '\'' +
                ", requireId='" + requireId + '\'' +
                ", tvType='" + tvType + '\'' +
                ", lang='" + lang + '\'' +
                ", pic='" + pic + '\'' +
                ", area='" + area + '\'' +
                ", year='" + year + '\'' +
                ", state=" + state +
                ", actor='" + actor + '\'' +
                ", director='" + director + '\'' +
                ", description='" + description + '\'' +
                ", playM3u8List=" + playM3u8List +
                ", shareList=" + shareList +
                ", sourceDb=" + sourceDb +
                ", lastWatch=" + lastWatch +
                ", videoProgress=" + videoProgress +
                '}';
    }

    public String getRequireId() {
        return requireId;
    }

    public void setRequireId(String requireId) {
        this.requireId = requireId;
    }
}
