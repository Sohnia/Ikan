package com.ikan.tv.ui.activity;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

import androidx.annotation.NonNull;

import com.airbnb.lottie.LottieAnimationView;
import com.gyf.immersionbar.BarHide;
import com.gyf.immersionbar.ImmersionBar;
import com.hjq.http.EasyHttp;
import com.hjq.http.listener.HttpCallback;
import com.ikan.tv.R;
import com.ikan.tv.common.MyActivity;
import com.ikan.tv.http.model.HttpData;
import com.ikan.tv.http.request.UserInfoApi;
import com.ikan.tv.http.response.UserInfoBean;
import com.ikan.tv.other.AppConfig;


/**
 *    author : Android 轮子哥
 *    github : https://github.com/getActivity/AndroidProject
 *    time   : 2018/10/18
 *    desc   : 闪屏界面
 */
public final class SplashActivity extends MyActivity {

    private LottieAnimationView mLottieView;
//    private View mDebugView;

    @Override
    protected int getLayoutId() {
        return R.layout.splash_activity;
    }

    @Override
    protected void initView() {
        mLottieView = findViewById(R.id.iv_splash_lottie);
//        mDebugView = findViewById(R.id.iv_splash_debug);
        // 设置动画监听
        mLottieView.addAnimatorListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animation) {
                postDelayed(()->{
                    startActivity(HomeActivity.class);
                    finish();
                },300);

            }
        });
    }

    @Override
    protected void initData() {
//        if (AppConfig.isDebug()) {
//            mDebugView.setVisibility(View.VISIBLE);
//        } else {
//            mDebugView.setVisibility(View.INVISIBLE);
//        }
//
//        if (true) {
//            return;
//        }
        // 刷新用户信息
//        EasyHttp.post(this)
//                .api(new UserInfoApi())
//                .request(new HttpCallback<HttpData<UserInfoBean>>(this) {
//
//                    @Override
//                    public void onSucceed(HttpData<UserInfoBean> data) {
//
//                    }
//                });
    }

    @NonNull
    @Override
    protected ImmersionBar createStatusBarConfig() {
        return super.createStatusBarConfig()
                // 隐藏状态栏和导航栏
                .hideBar(BarHide.FLAG_HIDE_BAR);
    }

    @Override
    public void onBackPressed() {
        //禁用返回键
        //super.onBackPressed();
    }

    @Override
    public boolean isSwipeEnable() {
        return false;
    }

    @Override
    protected void onDestroy() {
        mLottieView.removeAllAnimatorListeners();
        super.onDestroy();
    }
}