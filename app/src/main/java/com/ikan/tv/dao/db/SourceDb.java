package com.ikan.tv.dao.db;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Unique;

@Entity
public
class SourceDb {
    @Id(autoincrement = true)//设置自增长
    private Long id;
    @Unique
    private String name;
    private String requireId;
    private int version;
    private String description;
    private String api;
    private String charset;
    private String blockName;
    private String blockClassId;
    private String playFlag;
    private String shareFlag;
    private String playHeader;

    @Generated(hash = 355882746)
    public SourceDb() {
    }

    @Generated(hash = 553149655)
    public SourceDb(Long id, String name, String requireId, int version, String description, String api, String charset, String blockName, String blockClassId, String playFlag, String shareFlag,
            String playHeader) {
        this.id = id;
        this.name = name;
        this.requireId = requireId;
        this.version = version;
        this.description = description;
        this.api = api;
        this.charset = charset;
        this.blockName = blockName;
        this.blockClassId = blockClassId;
        this.playFlag = playFlag;
        this.shareFlag = shareFlag;
        this.playHeader = playHeader;
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

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getApi() {
        return api;
    }

    public void setApi(String api) {
        this.api = api;
    }

    public String getCharset() {
        return charset;
    }

    public void setCharset(String charset) {
        this.charset = charset;
    }

    public String getBlockName() {
        return blockName;
    }

    public void setBlockName(String blockName) {
        this.blockName = blockName;
    }

    public String getBlockClassId() {
        return blockClassId;
    }

    public void setBlockClassId(String blockClassId) {
        this.blockClassId = blockClassId;
    }

    public String getPlayFlag() {
        return playFlag;
    }

    public void setPlayFlag(String playFlag) {
        this.playFlag = playFlag;
    }

    public String getShareFlag() {
        return shareFlag;
    }

    public void setShareFlag(String shareFlag) {
        this.shareFlag = shareFlag;
    }

    public String getPlayHeader() {
        return playHeader;
    }

    public void setPlayHeader(String playHeader) {
        this.playHeader = playHeader;
    }

    @Override
    public String toString() {
        return "SourceDb{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", requireId='" + requireId + '\'' +
                ", version=" + version +
                ", description='" + description + '\'' +
                ", api='" + api + '\'' +
                ", charset='" + charset + '\'' +
                ", blockName='" + blockName + '\'' +
                ", blockClassId='" + blockClassId + '\'' +
                ", playFlag='" + playFlag + '\'' +
                ", shareFlag='" + shareFlag + '\'' +
                ", playHeader='" + playHeader + '\'' +
                '}';
    }

    public String getRequireId() {
        return requireId;
    }

    public void setRequireId(String requireId) {
        this.requireId = requireId;
    }

}
