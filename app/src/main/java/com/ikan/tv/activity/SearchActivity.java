package com.ikan.tv.activity;


import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.hjq.http.EasyHttp;
import com.ikan.tv.R;
import com.ikan.tv.base.BaseAdapter;
import com.ikan.tv.bean.SearchResultBean;
import com.ikan.tv.bean.SearchVideoBean;
import com.ikan.tv.common.MyActivity;
import com.ikan.tv.ui.adapter.SearchBtnAdapter;
import com.ikan.tv.ui.adapter.SearchResultAdapter;
import com.ikan.tv.widget.layout.WrapRecyclerView;

import java.util.ArrayList;
import java.util.List;

import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;


class SearchActivity extends MyActivity implements
        BaseAdapter.OnItemClickListener {

    private WrapRecyclerView wrapRecyclerViewHistory;
    private WrapRecyclerView wrapRecyclerViewHot;
    private WrapRecyclerView wrapRecyclerViewResult;

    private SearchBtnAdapter searchBtnAdapterHistory;
    private SearchBtnAdapter searchBtnAdapterHot;
    private SearchResultAdapter searchResultAdapter;

    private TextView textViewSearch;
    private AppCompatEditText appCompatEditText;
    private AppCompatImageView backBtn;
    private LinearLayout tintLinearLayout;
    private LinearLayout resultLinearLayout;

    private List<String> hotList;
    private List<String> historyList;
    private List<SearchResultBean> searchBeanList;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_search;
    }

    @Override
    protected void initView() {
        wrapRecyclerViewHistory = findViewById(R.id.rv_flow_btn_search_history);
        wrapRecyclerViewHot = findViewById(R.id.rv_flow_btn_search_hot);
        wrapRecyclerViewResult = findViewById(R.id.rv_search_result);
        textViewSearch = findViewById(R.id.tv_search_btn);
        appCompatEditText = findViewById(R.id.et_search_input_square);
        backBtn = findViewById(R.id.back_btn);
        tintLinearLayout = findViewById(R.id.ll_search_com);
        resultLinearLayout = findViewById(R.id.ll_search_result);

        searchBtnAdapterHistory = new SearchBtnAdapter(getActivity());
        searchBtnAdapterHot = new SearchBtnAdapter(getActivity());
        searchResultAdapter = new SearchResultAdapter(getActivity());
        wrapRecyclerViewHot.setAdapter(searchBtnAdapterHot);
        wrapRecyclerViewHistory.setAdapter(searchBtnAdapterHistory);
        wrapRecyclerViewResult.setAdapter(searchResultAdapter);

        searchBtnAdapterHistory.setOnItemClickListener(this);
        searchBtnAdapterHot.setOnItemClickListener(this);
        searchResultAdapter.setOnItemClickListener(this);
        backBtn.setOnClickListener((v) -> {
            //fanhui
        });

        textViewSearch.setOnClickListener((v) -> {
            String tmpSearch = appCompatEditText.getText().toString();
            if (tmpSearch.length() != 0) {
                startSearch(tmpSearch);
            }
        });
    }

    @Override
    protected void initData() {
        hotList = new ArrayList<>();
        historyList = new ArrayList<>();

    }


    @Override
    public void onItemClick(RecyclerView recyclerView, View itemView, int position) {
        switch (recyclerView.getId()) {
            case R.id.rv_flow_btn_search_history:
                startSearch(searchBtnAdapterHistory.getItem(position));
                break;
            case R.id.rv_flow_btn_search_hot:
                startSearch(searchBtnAdapterHot.getItem(position));
                break;
            case R.id.rv_search_result:
                goDetail(searchResultAdapter.getItem(position));
                break;
            default:
                break;
        }
    }

    private void goDetail(SearchVideoBean item) {

    }

    private void startSearch(String s) {
        if (tintLinearLayout.getVisibility() == View.VISIBLE) {
            tintLinearLayout.setVisibility(View.INVISIBLE);
            resultLinearLayout.setVisibility(View.VISIBLE);
        }

    }

}
