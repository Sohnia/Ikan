package com.ikan.tv.bean;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.List;

@Root(name = "list", strict = false)
public class ListVideoBean {
    @ElementList(name = "video", inline = true, required = false)
    private List<SearchVideoBean> searchVideoBeanList;

    public ListVideoBean() {
    }

    public ListVideoBean(List<SearchVideoBean> searchVideoBeanList) {
        this.searchVideoBeanList = searchVideoBeanList;
    }

    public List<SearchVideoBean> getSearchVideoBeanList() {
        return searchVideoBeanList;
    }

    public void setSearchVideoBeanList(List<SearchVideoBean> searchVideoBeanList) {
        this.searchVideoBeanList = searchVideoBeanList;
    }

    @Override
    public String toString() {
        return "ListVideoBean{" +
                "searchVideoBeanList=" + searchVideoBeanList +
                '}';
    }
}
