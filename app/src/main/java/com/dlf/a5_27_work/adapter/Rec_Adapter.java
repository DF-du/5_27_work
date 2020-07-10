package com.dlf.a5_27_work.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.dlf.a5_27_work.R;
import com.dlf.a5_27_work.bean.DatasBean;
import com.dlf.a5_27_work.utils.DaoUtils;

import java.util.ArrayList;
import java.util.List;

public class Rec_Adapter extends RecyclerView.Adapter<Rec_Adapter.ViewHolder> {
    private Context context;
    private List<DatasBean> data_bean = new ArrayList<>();
    //定义一个状态集合
    private List<Boolean> isCheck = new ArrayList<>();

    public Rec_Adapter(Context context) {
        this.context = context;
    }

    public void addList(List<DatasBean> data_bean) {
        this.data_bean.addAll(data_bean);
        //默认添加false
        for (int i = 0; i < data_bean.size(); i++) {
            isCheck.add(false);
        }
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        DatasBean bean = data_bean.get(position);
        RequestOptions options = new RequestOptions().circleCrop();
        Glide.with(context).load(bean.getThumbnail()).apply(options).into(holder.avatar);
        holder.title.setText(bean.getTitle());
        holder.excerpt.setText(bean.getExcerpt());

        //数据库中有某条数据就设置为true
        DatasBean query = DaoUtils.query(bean);
        if (query != null) {
            isCheck.set(position, true);
        } else {
            isCheck.set(position, false);
        }

        //根据点击的状态改变成 关注还是取消
        if (isCheck.get(position)) {
            holder.btn_insert.setText("取消");
        } else {
            holder.btn_insert.setText("关注");
        }

        //点击按钮
        holder.btn_insert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //是true  就是点取消
                if (isCheck.get(position)) {
                    //变成关注
                    holder.btn_insert.setText("关注");
                    //此时的下标状态也跟着改变
                    isCheck.set(position, false);
                    //并查询数据库中有没有收藏过此对象
                    DatasBean query = DaoUtils.query(bean);
                    // 如果有点击取消选择删除
                    if (query != null) {
                        DaoUtils.delete(query);
                        Toast.makeText(context, "数据删除成功", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    //变成取消
                    holder.btn_insert.setText("取消");
                    //下标也跟着改变
                    isCheck.set(position, true);
                    //并查询数据库中是否有这条数据
                    DatasBean query = DaoUtils.query(bean);
                    //数据库中没有这条数据就插入成功
                    if (query == null) {
                        DaoUtils.insert(bean);
                        Toast.makeText(context, "数据插入成功", Toast.LENGTH_SHORT).show();
                    } else {
                        //如果数据库中已经有这条数据就插入失败
                        Toast.makeText(context, "数据已存在数据库中，插入失败", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return data_bean.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView avatar;
        public TextView title;
        public TextView excerpt;
        public Button btn_insert;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            this.avatar = (ImageView) itemView.findViewById(R.id.avatar);
            this.title = (TextView) itemView.findViewById(R.id.title);
            this.excerpt = (TextView) itemView.findViewById(R.id.excerpt);
            this.btn_insert = (Button) itemView.findViewById(R.id.btn_insert);
        }
    }
}
