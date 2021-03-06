package com.ikan.tv.bean;

import com.ikan.tv.dao.db.SourceDb;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Path;
import org.simpleframework.xml.Root;

import java.util.List;

@Root(name = "video", strict = false)
public class TvBean {
    @Element(required = false)
    private Long id;
    @Element(required = false)
    private String name;
    @Element(required = false)
    private String soureceName;
    @Element(required = false)
    private String requireId;
    @Element(name = "type", required = false)
    private String tvType;
    @Element(required = false)
    private String lang;
    @Element(required = false)
    private String pic;
    @Element(required = false)
    private String area;
    @Element(required = false)
    private int state;
    @Element(required = false)
    private String year;
    @Element(required = false)
    private String actor;
    @Element(required = false)
    private String director;
    @Element(name = "des", required = false)
    private String description;
    @Element(name = "last", required = false)
    private String updateTime;
    @Element(name = "note", required = false)
    private String note;

    @Element(required = false)
    private int lastWatch;
    @Element(required = false)
    private int videoProgress;

    @Element(name = "dl", required = false)
    private DramaInfo dramaInfo;

    @Element(required = false)
    private List<String> playM3u8List;
    @Element(required = false)
    private List<String> shareList;

    @Element(required = false)
    private SourceDb sourceDb;

    public TvBean() {
    }

    public TvBean(Long id, String name, String soureceName, String requireId, String tvType, String lang, String pic, String area, int state, String year, String actor, String director, String description, String updateTime, String note, int lastWatch, int videoProgress, DramaInfo dramaInfo, List<String> playM3u8List, List<String> shareList, SourceDb sourceDb) {
        this.id = id;
        this.name = name;
        this.soureceName = soureceName;
        this.requireId = requireId;
        this.tvType = tvType;
        this.lang = lang;
        this.pic = pic;
        this.area = area;
        this.state = state;
        this.year = year;
        this.actor = actor;
        this.director = director;
        this.description = description;
        this.updateTime = updateTime;
        this.note = note;
        this.lastWatch = lastWatch;
        this.videoProgress = videoProgress;
        this.dramaInfo = dramaInfo;
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

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getRequireId() {
        return requireId;
    }

    public void setRequireId(String requireId) {
        this.requireId = requireId;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }


    public DramaInfo getDramaInfo() {
        return dramaInfo;
    }

    public void setDramaInfo(DramaInfo dramaInfo) {
        this.dramaInfo = dramaInfo;
    }

    @Override
    public String toString() {
        return "TvBean{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", soureceName='" + soureceName + '\'' +
                ", requireId='" + requireId + '\'' +
                ", tvType='" + tvType + '\'' +
                ", lang='" + lang + '\'' +
                ", pic='" + pic + '\'' +
                ", area='" + area + '\'' +
                ", state=" + state +
                ", year='" + year + '\'' +
                ", actor='" + actor + '\'' +
                ", director='" + director + '\'' +
                ", description='" + description + '\'' +
                ", updateTime='" + updateTime + '\'' +
                ", note='" + note + '\'' +
                ", lastWatch=" + lastWatch +
                ", videoProgress=" + videoProgress +
                ", dramaInfo=" + dramaInfo +
                ", playM3u8List=" + playM3u8List +
                ", shareList=" + shareList +
                ", sourceDb=" + sourceDb +
                '}';
    }
}
