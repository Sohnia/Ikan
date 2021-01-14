package com.ikan.tv.http.service;

import com.ikan.tv.bean.SourceResponseBean;

import io.reactivex.Observable;
import retrofit2.http.GET;

public interface SourceService {
    @GET("http://youyuan-xx.oss-cn-hangzhou.aliyuncs.com//youyuan/sub_mac.json")
    Observable<SourceResponseBean> getSources();
}
