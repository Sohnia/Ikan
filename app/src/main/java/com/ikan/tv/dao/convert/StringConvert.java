package com.ikan.tv.dao.convert;
import com.alibaba.fastjson.JSON;
import org.greenrobot.greendao.converter.PropertyConverter;

import java.util.List;

public class StringConvert implements PropertyConverter<List<String>, String> {
    @Override
    public List<String> convertToEntityProperty(String databaseValue) {
        return JSON.parseArray(databaseValue, String.class);
    }

    @Override
    public String convertToDatabaseValue(List<String> entityProperty) {
        return JSON.toJSONString(entityProperty);
    }
}
