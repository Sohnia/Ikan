package com.ikan.tv.bean;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "list", strict = false)
public class TvVideoBean {

    @Element(name = "video", required = false)
    private TvBean tvBean;

    public TvVideoBean() {
    }

    public TvVideoBean(TvBean tvBean) {
        this.tvBean = tvBean;
    }

    public TvBean getTvBean() {
        return tvBean;
    }

    public void setTvBean(TvBean tvBean) {
        this.tvBean = tvBean;
    }

    @Override
    public String toString() {
        return "TvVideoBean{" +
                "tvBean=" + tvBean +
                '}';
    }
}
