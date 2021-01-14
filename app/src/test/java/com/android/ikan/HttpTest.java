package com.android.ikan;

import android.util.Log;


import com.ikan.tv.bean.SearchResultBean;
import com.ikan.tv.bean.TvBean;
import com.ikan.tv.http.retrofit.ReOk;
import com.ikan.tv.http.service.TvService;
import org.junit.Test;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class HttpTest {
    @Test
    public void easyHttpTest(){
        ReOk.bindXml().create(TvService.class)
                .searchWord("https://api.tiankongapi.com/api.php/provide/vod/at/xml/","list","阳光",1)
                .subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<SearchResultBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(SearchResultBean searchResultBean) {
                        Log.i("HTTP TEST1","Result:" + searchResultBean.toString() + "");
                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });

        ReOk.bindXml().create(TvService.class)
                .searchWord("https://api.tiankongapi.com/api.php/provide/vod/at/xml/","list","大叔大婶大大所多撒安达市大所多阿萨德的",1)
                .subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<SearchResultBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(SearchResultBean searchResultBean) {
                        Log.i("HTTP TEST2","Result:" + searchResultBean.toString() + "");
                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });

        ReOk.bindXml().create(TvService.class)
                .getTvDetail("https://api.tiankongapi.com/api.php/provide/vod/at/xml/","videolist",39898)
                .subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<TvBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(TvBean tvBean) {
                        Log.i("HTTP TEST3","Result:" + tvBean.toString() + "");
                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });

        ReOk.bindXml().create(TvService.class)
                .getTvDetail("https://api.tiankongapi.com/api.php/provide/vod/at/xml/","videolist",37507)
                .subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<TvBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(TvBean tvBean) {
                        Log.i("HTTP TEST4","Result:" + tvBean.toString() + "");
                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }
}
