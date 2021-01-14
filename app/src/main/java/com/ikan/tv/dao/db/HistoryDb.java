package com.ikan.tv.dao.db;

import com.ikan.tv.dao.convert.SourceDbConvert;
import com.ikan.tv.dao.convert.StringConvert;

import org.greenrobot.greendao.annotation.Convert;
import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Index;

import java.util.List;

@Entity(indexes = {@Index(value = "name,soureceName", unique = true)})
public class HistoryDb {
    @Id(autoincrement = true)
    private Long id;
    private String updateTime;
    private String note;
    private String name;
    private String soureceName;
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
    private int lastWatch;
    private int videoProgress;
    private long lastTimeToDb;

    @Convert(columnType = String.class, converter = StringConvert.class)
    private List<String> playM3u8List;

    @Convert(columnType = String.class, converter = StringConvert.class)
    private List<String> shareList;
    @Convert(converter = SourceDbConvert.class, columnType = String.class)
    private SourceDb sourceDb;

    @Override
    public String toString() {
        return "HistoryDb{" +
                "id=" + id +
                ", updateTime='" + updateTime + '\'' +
                ", note='" + note + '\'' +
                ", name='" + name + '\'' +
                ", soureceName='" + soureceName + '\'' +
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
                ", lastWatch=" + lastWatch +
                ", videoProgress=" + videoProgress +
                ", lastTimeToDb=" + lastTimeToDb +
                ", playM3u8List=" + playM3u8List +
                ", shareList=" + shareList +
                ", sourceDb=" + sourceDb +
                '}';
    }

    @Generated(hash = 1549631443)
    public HistoryDb() {
    }

    @Generated(hash = 702928334)
    public HistoryDb(Long id, String updateTime, String note, String name, String soureceName, String requireId, String tvType, String lang, String pic, String area, String year, int state, String actor, String director, String description, int lastWatch, int videoProgress, long lastTimeToDb, List<String> playM3u8List, List<String> shareList, SourceDb sourceDb) {
        this.id = id;
        this.updateTime = updateTime;
        this.note = note;
        this.name = name;
        this.soureceName = soureceName;
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
        this.lastWatch = lastWatch;
        this.videoProgress = videoProgress;
        this.lastTimeToDb = lastTimeToDb;
        this.playM3u8List = playM3u8List;
        this.shareList = shareList;
        this.sourceDb = sourceDb;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getSoureceName() {
        return soureceName;
    }

    public void setSoureceName(String soureceName) {
        this.soureceName = soureceName;
    }
    public long getLastTimeToDb() {
        return lastTimeToDb;
    }

    public void setLastTimeToDb(long lastTimeToDb) {
        this.lastTimeToDb = lastTimeToDb;
    }

    public String getRequireId() {
        return requireId;
    }

    public void setRequireId(String requireId) {
        this.requireId = requireId;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}

