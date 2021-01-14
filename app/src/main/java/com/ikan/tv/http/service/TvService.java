package com.ikan.tv.http.service;
import com.ikan.tv.bean.SearchResultBean;
import com.ikan.tv.bean.TvBean;
import com.ikan.tv.bean.TvDetailBean;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;
import retrofit2.http.Url;

public interface TvService {
    @GET
    Observable<SearchResultBean> searchWord(@Url String url, @Query("ac") String ac, @Query("wd") String keyword, @Query("pg") int pg);


    @GET
    Observable<TvDetailBean> getTvDetail(@Url String url, @Query("ac") String ac, @Query("ids") int ids);
}
