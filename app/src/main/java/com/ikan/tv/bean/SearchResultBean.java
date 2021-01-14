package com.ikan.tv.bean;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Path;
import org.simpleframework.xml.Root;

import java.util.List;

@Root(name ="rss", strict = false)
public class SearchResultBean {

    @Element(name = "list")
    private ListVideoBean listVideoBean;

    public SearchResultBean() {
    }

    public SearchResultBean(ListVideoBean listVideoBean) {
        this.listVideoBean = listVideoBean;
    }

    public ListVideoBean getListVideoBean() {
        return listVideoBean;
    }

    public void setListVideoBean(ListVideoBean listVideoBean) {
        this.listVideoBean = listVideoBean;
    }

    @Override
    public String toString() {
        return "SearchResultBean{" +
                "listVideoBean=" + listVideoBean +
                '}';
    }
}
