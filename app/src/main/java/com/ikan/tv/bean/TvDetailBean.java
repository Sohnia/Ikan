package com.ikan.tv.bean;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name ="rss", strict = false)
public class TvDetailBean {
    @Element(name = "list", required = false)
    private TvVideoBean tvVideoBean;

    public TvDetailBean() {
    }

    public TvDetailBean(TvVideoBean tvVideoBean) {
        this.tvVideoBean = tvVideoBean;
    }

    public TvVideoBean getTvVideoBean() {
        return tvVideoBean;
    }

    public void setTvVideoBean(TvVideoBean tvVideoBean) {
        this.tvVideoBean = tvVideoBean;
    }

    @Override
    public String toString() {
        return "TvDetailBean{" +
                "tvVideoBean=" + tvVideoBean +
                '}';
    }
}
