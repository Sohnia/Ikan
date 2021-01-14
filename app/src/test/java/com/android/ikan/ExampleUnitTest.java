package com.android.ikan;

import android.util.Log;

import com.ikan.tv.bean.SearchResultBean;
import com.ikan.tv.http.retrofit.ReOk;
import com.ikan.tv.http.service.TvService;

import org.junit.Test;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }
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
                        Log.i("Result", searchResultBean.toString() + "");
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