package com.ikan.tv.bean;

import com.airbnb.lottie.L;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Root(name = "dl", strict = false)
public class DramaInfo {
    @ElementList(entry = "dd", type = String.class, inline = true, required = false)
    private List<String> stringList;

    public DramaInfo() {
    }

    public DramaInfo(List<String> stringList) {
        this.stringList = stringList;
    }

    @Override
    public String toString() {
        return "DramaInfo{" +
                "stringList=" + stringList +
                '}';
    }

    public List<String> getDramaList(boolean isM3U8) {
        List<String> result = new ArrayList<>();
        if (stringList == null || stringList.size() == 0) return result;
        else if (stringList.size() == 1) {
            String[] strings = stringList.get(0).split("#");
            boolean flag = strings[0].toLowerCase().endsWith(".m3u8");
            if (flag && isM3U8) {
                return Arrays.asList(strings);
            } else if (!flag && !isM3U8) return Arrays.asList(strings);
        } else if (stringList.size() == 2) {
            String[] strings = stringList.get(0).split("#");
            boolean flag = strings[0].toLowerCase().endsWith(".m3u8");
            if (flag && isM3U8) {
                return Arrays.asList(strings);
            } else if (!flag && !isM3U8) return Arrays.asList(strings);

            String[] strings1 = stringList.get(1).split("#");
            boolean flag1 = strings[0].toLowerCase().endsWith(".m3u8");
            if (flag1 && isM3U8) {
                return Arrays.asList(strings1);
            } else if (!flag && !isM3U8) return Arrays.asList(strings1);
        }
        return result;
    }
}
