package com.ikan.tv.bean;
import com.google.gson.annotations.SerializedName;

import java.util.Date;
import java.util.List;

/**
 * Auto-generated: 2021-01-13 19:34:19
 *
 * @author http://www.itjson.com 
 * @website http://www.itjson.com/itjson/json2java.html 
 */
public class Model {

    private String name;
    private int version;
    private String description;
    private String api;
    private String charset;
    @SerializedName("blockNames")
    private String blocknames;
    @SerializedName("blockClassId")
    private String blockclassid;
    private List<Flags> flags;
    public void setName(String name) {
         this.name = name;
     }
     public String getName() {
         return name;
     }

    public void setVersion(int version) {
         this.version = version;
     }
     public int getVersion() {
         return version;
     }

    public void setDescription(String description) {
         this.description = description;
     }
     public String getDescription() {
         return description;
     }

    public void setApi(String api) {
         this.api = api;
     }
     public String getApi() {
         return api;
     }

    public void setCharset(String charset) {
         this.charset = charset;
     }
     public String getCharset() {
         return charset;
     }

    public void setBlocknames(String blocknames) {
         this.blocknames = blocknames;
     }
     public String getBlocknames() {
         return blocknames;
     }

    public void setBlockclassid(String blockclassid) {
         this.blockclassid = blockclassid;
     }
     public String getBlockclassid() {
         return blockclassid;
     }

    public void setFlags(List<Flags> flags) {
         this.flags = flags;
     }
     public List<Flags> getFlags() {
         return flags;
     }

}