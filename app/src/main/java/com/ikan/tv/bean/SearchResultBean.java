package com.ikan.tv.bean;

public class SearchResultBean {
    private String name;
    private String id;
    private String updateTime;
    private String type;
    private String sourceName;
    private String sourceMainUrl;

    public SearchResultBean() {
    }

    public SearchResultBean(String name, String id, String updateTime, String type, String sourceName, String sourceMainUrl) {
        this.name = name;
        this.id = id;
        this.updateTime = updateTime;
        this.type = type;
        this.sourceName = sourceName;
        this.sourceMainUrl = sourceMainUrl;
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

    @Override
    public String toString() {
        return "SearchBean{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", updateTime='" + updateTime + '\'' +
                ", type='" + type + '\'' +
                ", sourceName='" + sourceName + '\'' +
                ", sourceMainUrl='" + sourceMainUrl + '\'' +
                '}';
    }
}
