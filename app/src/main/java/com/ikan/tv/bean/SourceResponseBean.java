package com.ikan.tv.bean;

import com.ikan.tv.dao.db.SourceDb;

import java.util.ArrayList;
import java.util.List;

/**
 * Auto-generated: 2021-01-13 19:34:19
 *
 * @author http://www.itjson.com
 * @website http://www.itjson.com/itjson/json2java.html
 */
public class SourceResponseBean {

    private String name;
    private String key;
    private List<Model> model;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }

    public void setModel(List<Model> model) {
        this.model = model;
    }

    public List<Model> getModel() {
        return model;
    }

    public List<SourceDb> getSourceDbList(){
        List<SourceDb> sourceDbList = new ArrayList<>();
        if (model == null || model.size() == 0) return sourceDbList;
        for(Model m : model){
            SourceDb sourceDb = new SourceDb();
            sourceDb.setApi(m.getApi());
            sourceDb.setBlockClassId(m.getBlockclassid());
            sourceDb.setBlockName(m.getBlocknames());
            sourceDb.setCharset(m.getCharset());
            sourceDb.setDescription(m.getDescription());
            sourceDb.setName(m.getName());
            sourceDb.setPlayFlag(m.getFlags().get(0).getFlag());
            sourceDb.setPlayHeader(m.getFlags().get(0).getHeader());
            sourceDb.setShareFlag(m.getFlags().get(1).getFlag());
            sourceDb.setVersion(m.getVersion());
            sourceDbList.add(sourceDb);
        }
        return sourceDbList;
    }

}