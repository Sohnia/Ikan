package com.ikan.tv.fragment;

import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import androidx.viewpager.widget.ViewPager;

import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.tabs.TabLayout;
import com.gyf.immersionbar.ImmersionBar;
import com.ikan.tv.base.BaseFragmentAdapter;
import com.ikan.tv.R;
import com.ikan.tv.common.MyFragment;
import com.ikan.tv.ui.activity.HomeActivity;
import com.ikan.tv.ui.fragment.StatusFragment;
import com.ikan.tv.widget.XCollapsingToolbarLayout;


public final class MainFragment extends MyFragment<HomeActivity> {

    private TabLayout mTabLayout;
    private ViewPager mViewPager;
    private ImageView mImageView;

    private BaseFragmentAdapter<MyFragment> mPagerAdapter;

    public static MainFragment newInstance() {
        return new MainFragment();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_main;
    }

    @Override
    protected void initView() {
        mTabLayout = findViewById(R.id.tl_main_tab);
        mImageView = findViewById(R.id.square);
        mViewPager = findViewById(R.id.vp_main_pager);
    }

    @Override
    protected void initData() {

    }

    @Override
    public boolean isStatusBarEnabled() {
        // 使用沉浸式状态栏
        return !super.isStatusBarEnabled();
    }

    @Override
    public boolean statusBarDarkFont() {
        return true;
    }
}