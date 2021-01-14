package com.ikan.tv.dao.convert;

import com.alibaba.fastjson.JSON;
import com.ikan.tv.dao.db.SourceDb;
import org.greenrobot.greendao.converter.PropertyConverter;

public class SourceDbConvert implements PropertyConverter<SourceDb, String> {
    @Override
    public SourceDb convertToEntityProperty(String databaseValue) {
        return JSON.parseObject(databaseValue, SourceDb.class);
    }

    @Override
    public String convertToDatabaseValue(SourceDb entityProperty) {
        return JSON.toJSONString(entityProperty);
    }
}
