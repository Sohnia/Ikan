package com.ikan.tv.activity;


import android.view.View;

import com.ikan.tv.R;
import com.ikan.tv.base.BaseActivity;
import com.ikan.tv.common.MyActivity;
import com.ikan.tv.other.KeyboardWatcher;
import com.ikan.tv.ui.adapter.SearchBtnAdapter;
import com.ikan.tv.ui.adapter.SearchResultAdapter;
import com.ikan.tv.widget.layout.WrapRecyclerView;


class SearchActivity extends MyActivity {

    private WrapRecyclerView wrapRecyclerViewHistory;
    private WrapRecyclerView wrapRecyclerViewHot;
    private WrapRecyclerView wrapRecyclerViewResult;
    private SearchBtnAdapter searchBtnAdapterHistory;
    private SearchBtnAdapter searchBtnAdapterHot;
    private SearchResultAdapter searchResultAdapter;
    @Override
    protected int getLayoutId() {
        return R.layout.activity_search;
    }

    @Override
    protected void initView() {
        wrapRecyclerViewHistory = findViewById(R.id.rv_flow_btn_search_history);
        wrapRecyclerViewHot = findViewById(R.id.rv_flow_btn_search_hot);
        wrapRecyclerViewResult = findViewById(R.id.rv_search_result);


    }

    @Override
    protected void initData() {

    }


}
