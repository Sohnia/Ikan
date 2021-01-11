package com.ikan.tv.fragment;


import com.ikan.tv.base.BaseFragment;
import com.ikan.tv.R;
import com.ikan.tv.common.MyFragment;

public class CatFragment extends MyFragment {
    public static CatFragment newInstance() {
        return new CatFragment();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_cat;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initData() {

    }
}
