package com.ikan.tv.activity;

import android.annotation.SuppressLint;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.ViewPager;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.ikan.tv.base.BaseFragmentAdapter;
import com.ikan.tv.R;
import com.ikan.tv.bean.SearchResultBean;
import com.ikan.tv.bean.TvBean;
import com.ikan.tv.bean.TvDetailBean;
import com.ikan.tv.common.MyActivity;
import com.ikan.tv.common.MyFragment;
import com.ikan.tv.fragment.CatFragment;
import com.ikan.tv.fragment.LiveFragment;
import com.ikan.tv.fragment.MainFragment;
import com.ikan.tv.fragment.MineFragment;
import com.ikan.tv.helper.ActivityStackManager;
import com.ikan.tv.helper.DoubleClickHelper;
import com.ikan.tv.http.retrofit.ReOk;
import com.ikan.tv.http.service.TvService;
import com.ikan.tv.other.KeyboardWatcher;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;

/**
 * author : Android 轮子哥
 * github : https://github.com/getActivity/AndroidProject
 * time   : 2018/10/18
 * desc   : 主页界面
 */
public final class MainActivity extends MyActivity
        implements KeyboardWatcher.SoftKeyboardStateListener,
        BottomNavigationView.OnNavigationItemSelectedListener {

    private ViewPager mViewPager;
    private BottomNavigationView mBottomNavigationView;

    private BaseFragmentAdapter<MyFragment> mPagerAdapter;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {
        mViewPager = findViewById(R.id.vp_home_pager);
        mBottomNavigationView = findViewById(R.id.bv_home_navigation);

        // 不使用图标默认变色
        mBottomNavigationView.setItemIconTintList(null);
        mBottomNavigationView.setOnNavigationItemSelectedListener(this);

        KeyboardWatcher.with(this)
                .setListener(this);
        easyHttpTest();
    }

    @Override
    protected void initData() {
        mPagerAdapter = new BaseFragmentAdapter<>(this);
        mPagerAdapter.addFragment(MainFragment.newInstance());
        mPagerAdapter.addFragment(CatFragment.newInstance());
        mPagerAdapter.addFragment(LiveFragment.newInstance());
        mPagerAdapter.addFragment(MineFragment.newInstance());
        // 设置成懒加载模式
        mPagerAdapter.setLazyMode(true);
        mViewPager.setAdapter(mPagerAdapter);
    }

    /**
     * {@link BottomNavigationView.OnNavigationItemSelectedListener}
     */

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_main:
                mViewPager.setCurrentItem(0);
                return true;
            case R.id.menu_cat:
                mViewPager.setCurrentItem(1);
                return true;
            case R.id.menu_live:
                mViewPager.setCurrentItem(2);
                return true;
            case R.id.menu_mine:
                mViewPager.setCurrentItem(3);
                return true;
            default:
                break;
        }
        return false;
    }

    /**
     * {@link KeyboardWatcher.SoftKeyboardStateListener}
     */
    @Override
    public void onSoftKeyboardOpened(int keyboardHeight) {
        mBottomNavigationView.setVisibility(View.GONE);
    }

    @Override
    public void onSoftKeyboardClosed() {
        mBottomNavigationView.setVisibility(View.VISIBLE);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        // 回调当前 Fragment 的 onKeyDown 方法
        if (mPagerAdapter.getShowFragment().onKeyDown(keyCode, event)) {
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    @Override
    public void onBackPressed() {
        if (DoubleClickHelper.isOnDoubleClick()) {
            // 移动到上一个任务栈，避免侧滑引起的不良反应
            moveTaskToBack(false);
            postDelayed(() -> {

                // 进行内存优化，销毁掉所有的界面
                ActivityStackManager.getInstance().finishAllActivities();
                // 销毁进程（注意：调用此 API 可能导致当前 Activity onDestroy 方法无法正常回调）
                // System.exit(0);

            }, 300);
        } else {
            toast(R.string.home_exit_hint);
        }
    }

    @Override
    protected void onDestroy() {
        mViewPager.setAdapter(null);
        mBottomNavigationView.setOnNavigationItemSelectedListener(null);
        super.onDestroy();
    }

    @Override
    public boolean isSwipeEnable() {
        return false;
    }

    public void easyHttpTest() {
        ReOk.bindXml().create(TvService.class)
                .searchWord("https://api.tiankongapi.com/api.php/provide/vod/at/xml/", "list", "阳光", 1)
                .subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .as(AutoDispose.autoDisposable(AndroidLifecycleScopeProvider.from(this)))
                .subscribe(new Observer<SearchResultBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(SearchResultBean searchResultBean) {
                        Log.i("HTTP TEST1", "Result:" + searchResultBean.toString() + "");
                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });

        ReOk.bindXml().create(TvService.class)
                .searchWord("https://api.tiankongapi.com/api.php/provide/vod/at/xml/", "list", "大叔大婶大大所多撒安达市大所多阿萨德的", 1)
                .subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .as(AutoDispose.autoDisposable(AndroidLifecycleScopeProvider.from(this)))
                .subscribe(new Observer<SearchResultBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(SearchResultBean searchResultBean) {
                        Log.i("HTTP TEST2", "Result:" + searchResultBean.toString() + "");
                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.e("HTTP TEST4", e.getMessage() + "");
                    }

                    @Override
                    public void onComplete() {

                    }
                });

        ReOk.bindXml().create(TvService.class)
                .getTvDetail("https://api.tiankongapi.com/api.php/provide/vod/at/xml/", "videolist", 39898)
                .subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread()).as(AutoDispose.autoDisposable(AndroidLifecycleScopeProvider.from(this)))
                .subscribe(new Observer<TvDetailBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(TvDetailBean tvBean) {
                        Log.i("HTTP TEST3", "Result:" + tvBean.toString() + "");
                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.e("HTTP TEST3", e.getMessage() + "");
                    }

                    @Override
                    public void onComplete() {

                    }
                });

        ReOk.bindXml().create(TvService.class)
                .getTvDetail("https://api.tiankongapi.com/api.php/provide/vod/at/xml/", "videolist", 37507)
                .subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread()).as(AutoDispose.autoDisposable(AndroidLifecycleScopeProvider.from(this)))
                .subscribe(new Observer<TvDetailBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(TvDetailBean tvBean) {
                        Log.i("HTTP TEST4", "Result:" + tvBean.toString() + "");
                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.e("HTTP TEST4", e.getMessage() + "");
                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }
}