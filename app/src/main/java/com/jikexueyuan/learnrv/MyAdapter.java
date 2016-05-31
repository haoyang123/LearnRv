package com.jikexueyuan.learnrv;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by haoyang on 7/7/15.
 */
class MyAdapter extends RecyclerView.Adapter {


    class ViewHolder extends RecyclerView.ViewHolder {

        private View root;
        private TextView tvTitle, tvContent;


        public ViewHolder(View root) {
            super(root);
            tvTitle = (TextView) root.findViewById(R.id.tvTitle);
            tvContent = (TextView) root.findViewById(R.id.tvContent);
        }


        public TextView getTvContent() {
            return tvContent;
        }

        public TextView getTvTitle() {
            return tvTitle;
        }

    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_cell, null));
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        ViewHolder vh = (ViewHolder) viewHolder;
        CellData cd = data[i];

        vh.getTvContent().setText(cd.content);
        vh.getTvTitle().setText(cd.title);


    }

    @Override
    public int getItemCount() {
        return data.length;
    }


  private CellData[] data = new CellData[]{new CellData("杨浩","帅气"),new CellData("杨浩","这个新闻真不错"),new CellData("杨浩","IT职业教育"),new CellData("新闻","这个新闻真不错"),new CellData("杨浩","IT职业教育"),new CellData("新闻","这个新闻真不错"),new CellData("杨浩","IT职业教育"),new CellData("新闻","这个新闻真不错"),new CellData("杨浩","IT职业教育"),new CellData("新闻","这个新闻真不错"),new CellData("杨浩","IT职业教育"),new CellData("新闻","这个新闻真不错"),new CellData("杨浩","IT职业教育"),new CellData("新闻","这个新闻真不错"),new CellData("杨浩","IT职业教育"),new CellData("新闻","这个新闻真不错"),new CellData("杨浩","IT职业教育"),new CellData("新闻","这个新闻真不错"),new CellData("杨浩","IT职业教育"),new CellData("新闻","这个新闻真不错"),new CellData("杨浩","IT职业教育"),new CellData("新闻","这个新闻真不错"),new CellData("杨浩","IT职业教育"),new CellData("新闻","这个新闻真不错"),new CellData("杨浩","IT职业教育"),new CellData("新闻","这个新闻真不错"),new CellData("杨浩","IT职业教育"),new CellData("新闻","这个新闻真不错"),new CellData("杨浩","IT职业教育"),new CellData("新闻","这个新闻真不错"),new CellData("杨浩","IT职业教育"),new CellData("新闻","这个新闻真不错"),new CellData("杨浩","IT职业教育"),new CellData("新闻","这个新闻真不错"),new CellData("杨浩","IT职业教育"),new CellData("新闻","这个新闻真不错"),new CellData("杨浩","IT职业教育"),new CellData("新闻","这个新闻真不错"),new CellData("杨浩","IT职业教育"),new CellData("新闻","这个新闻真不错"),new CellData("杨浩","IT职业教育"),new CellData("新闻","这个新闻真不错"),new CellData("杨浩","IT职业教育"),new CellData("新闻","这个新闻真不错"),new CellData("杨浩","IT职业教育"),new CellData("新闻","这个新闻真不错"),new CellData("杨浩","IT职业教育"),new CellData("新闻","这个新闻真不错"),new CellData("杨浩","IT职业教育"),new CellData("新闻","这个新闻真不错"),new CellData("杨浩","IT职业教育"),new CellData("新闻","这个新闻真不错"),new CellData("杨浩","IT职业教育"),new CellData("新闻","这个新闻真不错"),new CellData("杨浩","IT职业教育"),new CellData("新闻","这个新闻真不错"),};





//    private String[] data = new String[]{"Hello", "jikexueyuan", "hao"};


}
