package com.ikan.tv.dao.model;

import android.content.Context;

import com.ikan.tv.bean.TvBean;
import com.ikan.tv.dao.DaoManager;
import com.ikan.tv.dao.db.HistoryDb;
import com.ikan.tv.greendao.gen.HistoryDbDao;
import com.ikan.tv.greendao.gen.SearchHistoryDbDao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.schedulers.Schedulers;


/**
 * Created by yyj on 2018/08/01. email: 2209011667@qq.com
 */

public class HistoryModel {
    private HistoryDbDao mDao;

    public HistoryModel(Context context) {
        mDao = DaoManager.getInstance(context).getDaoSession().getHistoryDbDao();
    }

    private List<TvBean> db2beanList(List<HistoryDb> DbList) {
        List<TvBean> list = new ArrayList<>();
        if (DbList != null && DbList.size() > 0) {
            for (HistoryDb db : DbList) {
                list.add(db2bean(db));
            }
        }
        return list;
    }

    private TvBean db2bean(HistoryDb db) {
        TvBean bean = new TvBean();
        bean.setActor(db.getActor());
        bean.setArea(db.getArea());
        bean.setDescription(db.getDescription());
        bean.setDirector(db.getDirector());
        bean.setLang(db.getLang());
        bean.setLastWatch(db.getLastWatch());
        bean.setName(db.getName());
        bean.setPic(db.getPic());
        bean.setPlayM3u8List(db.getPlayM3u8List());
        bean.setRequireId(db.getRequireId());
        bean.setShareList(db.getShareList());
        bean.setSourceDb(db.getSourceDb());
        bean.setSoureceName(db.getSoureceName());
        bean.setState(db.getState());
        bean.setTvType(db.getTvType());
        bean.setVideoProgress(db.getVideoProgress());
        bean.setYear(db.getYear());
        bean.setUpdateTime(db.getUpdateTime());
        bean.setNote(db.getNote());
        return bean;
    }

    private HistoryDb bean2db(TvBean db) {
        HistoryDb bean = new HistoryDb();
        bean.setActor(db.getActor());
        bean.setArea(db.getArea());
        bean.setDescription(db.getDescription());
        bean.setDirector(db.getDirector());
        bean.setLang(db.getLang());
        bean.setLastWatch(db.getLastWatch());
        bean.setName(db.getName());
        bean.setPic(db.getPic());
        bean.setPlayM3u8List(db.getPlayM3u8List());
        bean.setRequireId(db.getRequireId());
        bean.setShareList(db.getShareList());
        bean.setSourceDb(db.getSourceDb());
        bean.setSoureceName(db.getSoureceName());
        bean.setState(db.getState());
        bean.setTvType(db.getTvType());
        bean.setVideoProgress(db.getVideoProgress());
        bean.setYear(db.getYear());
        return bean;
    }

    public void loadAll(Observer<List<TvBean>> observer) {
        Observable.create((ObservableOnSubscribe<List<TvBean>>) observableEmitter -> {
            try {
                List<HistoryDb> list = mDao.loadAll();
                List<TvBean> data = db2beanList(list);
                observableEmitter.onNext(data);
            } catch (Exception e) {
                observableEmitter.onError(e);
                e.printStackTrace();
            } finally {
                observableEmitter.onComplete();
            }
        })
                .subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(observer);
    }

    public void insert(final TvBean tvBean, Observer<Integer> observer) {
        Observable.create((ObservableOnSubscribe<Integer>) observableEmitter -> {
            try {
                // 查询原来是否已有。
                HistoryDb dd = mDao.queryBuilder().where(
                        HistoryDbDao.Properties.Name.eq(tvBean.getName()),
                        HistoryDbDao.Properties.SoureceName.eq(tvBean.getSoureceName())
                ).unique();

                // 有的话，更新数据后返回。
                HistoryDb newDb = bean2db(tvBean);
                newDb.setLastTimeToDb(new Date().getTime());
                if (dd != null) {
                    newDb.setId(dd.getId());
                    mDao.update(newDb);
                    observableEmitter.onNext(0);//更新后的对象。
                } else {
                    mDao.insert(newDb);
                    observableEmitter.onNext(1);// 1代表直接插入
                }
            } catch (Exception e) {
                observableEmitter.onError(e);
                e.printStackTrace();
            } finally {
                observableEmitter.onComplete();
            }
        })
                .subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(observer);
    }


    public void delete(final TvBean tvBean, Observer<Boolean> observer) {
        Observable.create(new ObservableOnSubscribe<Boolean>() {
            @Override
            public void subscribe(@NonNull ObservableEmitter<Boolean> observableEmitter) throws Exception {
                try {
                    // 查询原来是否已有。
                    HistoryDb dd = mDao.queryBuilder().where(
                            HistoryDbDao.Properties.Name.eq(tvBean.getName()),
                            HistoryDbDao.Properties.SoureceName.eq(tvBean.getSoureceName())
                    ).unique();
                    if (dd != null) mDao.deleteByKey(dd.getId());
                    observableEmitter.onNext(true);
                } catch (Exception e) {
                    observableEmitter.onError(e);
                    e.printStackTrace();
                } finally {
                    observableEmitter.onComplete();
                }
            }

        })
                .subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(observer);
    }

    public void deleteAll(final TvBean tvBean, Observer<Boolean> observer) {
        Observable.create(new ObservableOnSubscribe<Boolean>() {
            @Override
            public void subscribe(@NonNull ObservableEmitter<Boolean> observableEmitter) throws Exception {
                try {
                    mDao.deleteAll();
                    observableEmitter.onNext(true);
                } catch (Exception e) {
                    observableEmitter.onError(e);
                    e.printStackTrace();
                } finally {
                    observableEmitter.onComplete();
                }
            }

        })
                .subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(observer);
    }
}
