package com.ikan.tv.ui.adapter;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;

import com.ikan.tv.R;
import com.ikan.tv.bean.SearchResultBean;
import com.ikan.tv.common.MyAdapter;

/**
 *    author : Android 轮子哥
 *    github : https://github.com/getActivity/AndroidProject
 *    time   : 2019/09/22
 *    desc   : 状态数据列表
 */
public final class SearchResultAdapter extends MyAdapter<SearchResultBean> {


    public SearchResultAdapter( Context context) {
        super(context);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder();
    }

    private final class ViewHolder extends MyAdapter.ViewHolder {

        private TextView tvName;
        private TextView tvFrom;
        private TextView tvType;
        private TextView tvTime;
        private ViewHolder() {
            super(R.layout.item_search_result);
            tvName = (TextView) findViewById(R.id.tv_name);
            tvFrom = (TextView) findViewById(R.id.tv_from);
            tvTime = (TextView) findViewById(R.id.tv_time);
            tvType = (TextView) findViewById(R.id.tv_type);
        }

        @Override
        public void onBindView(int position) {
            tvName.setText(getItem(position).getName());
            tvFrom.setText(getItem(position).getSourceName());
            tvTime.setText(getItem(position).getUpdateTime());
            tvType.setText(getItem(position).getType());

        }
    }
}