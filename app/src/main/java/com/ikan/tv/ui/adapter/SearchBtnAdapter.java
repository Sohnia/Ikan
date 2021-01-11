package com.ikan.tv.ui.adapter;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageButton;

import com.ikan.tv.R;
import com.ikan.tv.common.MyAdapter;

/**
 *    author : Android 轮子哥
 *    github : https://github.com/getActivity/AndroidProject
 *    time   : 2019/09/22
 *    desc   : 状态数据列表
 */
public final class SearchBtnAdapter extends MyAdapter<String> {

    public SearchBtnAdapter(Context context) {
        super(context);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder();
    }

    private final class ViewHolder extends MyAdapter.ViewHolder {

        private AppCompatButton mTextView;

        private ViewHolder() {
            super(R.layout.item_search_small_btn);
            mTextView = (AppCompatButton) findViewById(R.id.item_search_name);
        }

        @Override
        public void onBindView(int position) {
            mTextView.setText(getItem(position));
        }
    }
}