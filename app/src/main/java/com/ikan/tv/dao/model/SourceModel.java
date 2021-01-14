package com.ikan.tv.dao.model;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;

import com.ikan.tv.bean.SearchHistoryBean;
import com.ikan.tv.dao.DaoManager;
import com.ikan.tv.dao.db.SearchHistoryDb;
import com.ikan.tv.dao.db.SourceDb;
import com.ikan.tv.greendao.gen.SourceDbDao;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

public class SourceModel {
    private SourceDbDao mDao;

    public SourceModel(Context context) {
        mDao = DaoManager.getInstance(context).getDaoSession().getSourceDbDao();
    }

    public void loadAll(Observer<List<SourceDb>> observer) {
        Observable.create((ObservableOnSubscribe<List<SourceDb>>) observableEmitter -> {
            try {
                List<SourceDb> data = mDao.loadAll();
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

    public void insertAll(final List<SourceDb> sourceDbList) {
        Observable.create((ObservableOnSubscribe<Boolean>) observableEmitter -> {
            for (SourceDb sourceDb : sourceDbList) {
                try {
                    // 查询原来是否已有。
                    SourceDb dd = mDao.queryBuilder().where(SourceDbDao.Properties.Name.eq(sourceDb.getName())).unique();
                    // 有的话，将其删除。
                    if (dd != null) {
                        mDao.delete(dd);
                    }
                    long insert = mDao.insert(sourceDb);
                    sourceDb.setId(insert);
                    // 转化。
                    observableEmitter.onNext(true);
                } catch (Exception e) {
                    Log.i("SourceDb", "insert error" + sourceDb + "\n" + e.getMessage());
                    observableEmitter.onNext(false);
                }
            }
        })
                .subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<Boolean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(Boolean bool) {
                        Log.i("SourceDb", "insert result " + bool);
                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }

    public void insert(final SourceDb sourceDb) {
        Observable.create((ObservableOnSubscribe<Boolean>) observableEmitter -> {
            try {
                // 查询原来是否已有。
                SourceDb dd = mDao.queryBuilder().where(SourceDbDao.Properties.Name.eq(sourceDb.getName())).unique();
                // 有的话，将其删除。
                if (dd != null) {
                    mDao.delete(dd);
                }
                long insert = mDao.insert(sourceDb);
                sourceDb.setId(insert);
                // 转化。
                observableEmitter.onNext(true);
            } catch (Exception e) {
                Log.i("SourceDb", "insert error" + sourceDb + "\n" + e.getMessage());
                observableEmitter.onNext(false);
            }
        })
                .subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<Boolean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(Boolean bool) {
                        Log.i("SourceDb", "insert result" + bool);
                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }

    public void delete(final Long id, Observer<Long> observer) {
        Observable.create(new ObservableOnSubscribe<Long>() {
            @Override
            public void subscribe(@NonNull ObservableEmitter<Long> observableEmitter) throws Exception {
                try {
                    mDao.deleteByKey(id);
                    observableEmitter.onNext(id);
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

    public void deleteAll(Observer<Long> observer) {
        Observable.create(new ObservableOnSubscribe<Long>() {
            @Override
            public void subscribe(@NonNull ObservableEmitter<Long> observableEmitter) throws Exception {
                try {
                    mDao.deleteAll();
                    observableEmitter.onNext(0L);
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
