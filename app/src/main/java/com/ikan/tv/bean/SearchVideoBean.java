package com.ikan.tv.bean;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "video", strict = false)
public class SearchVideoBean {
    @Element
    private String name;
    @Element
    private String id;
    @Element(name = "last", required = false)
    private String updateTime;
    @Element(required = false)
    private String type;
    @Element(required = false)
    private String note;
    @Element(required = false)
    private String sourceName;
    @Element(required = false)
    private String sourceMainUrl;
    @Element
    private String dt;

    public SearchVideoBean() {
    }

    public SearchVideoBean(String name, String id, String updateTime, String type, String note, String sourceName, String sourceMainUrl, String dt) {
        this.name = name;
        this.id = id;
        this.updateTime = updateTime;
        this.type = type;
        this.note = note;
        this.sourceName = sourceName;
        this.sourceMainUrl = sourceMainUrl;
        this.dt = dt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSourceName() {
        return sourceName;
    }

    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }

    public String getSourceMainUrl() {
        return sourceMainUrl;
    }

    public void setSourceMainUrl(String sourceMainUrl) {
        this.sourceMainUrl = sourceMainUrl;
    }

    public String getDt() {
        return dt;
    }

    public void setDt(String dt) {
        this.dt = dt;
    }

    @Override
    public String toString() {
        return "SearchVideoBean{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", updateTime='" + updateTime + '\'' +
                ", type='" + type + '\'' +
                ", note='" + note + '\'' +
                ", sourceName='" + sourceName + '\'' +
                ", sourceMainUrl='" + sourceMainUrl + '\'' +
                ", dt='" + dt + '\'' +
                '}';
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

}
