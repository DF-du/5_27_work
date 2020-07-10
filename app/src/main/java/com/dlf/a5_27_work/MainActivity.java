package com.dlf.a5_27_work;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.dlf.a5_27_work.adapter.Rec_Adapter;
import com.dlf.a5_27_work.base.BaseActivity;
import com.dlf.a5_27_work.base.BaseMvpActivity;
import com.dlf.a5_27_work.bean.DatasBean;
import com.dlf.a5_27_work.bean.List_Bean;
import com.dlf.a5_27_work.contract.Contract;
import com.dlf.a5_27_work.contract.DataPresenter;

import java.util.List;

public class MainActivity extends BaseMvpActivity implements Contract.View<List_Bean> {

    private Rec_Adapter adapter;

    @Override
    protected Contract.BasePresenter initPresenter() {
        return new DataPresenter();
    }

    @Override
    protected void initView() {
        super.initView();
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        RecyclerView rec = findViewById(R.id.rec);
        rec.setLayoutManager(new LinearLayoutManager(this));
        adapter = new Rec_Adapter(this);
        rec.setAdapter(adapter);
    }

    @Override
    protected void initData() {
        Contract.Presenter presenter = (Contract.Presenter) this.presenter;
        presenter.getData();
    }

    @Override
    protected int getLayout() {
        return R.layout.activity_main;
    }

    private static final String TAG = "MainActivity";
    @Override
    public void onSuccess(List_Bean list_bean) {
        List<DatasBean> datas = list_bean.getDatas();
        Log.d(TAG, "onSuccess: "+datas.toString());
        adapter.addList(datas);
    }

    @Override
    public void onFlied(String msg) {

    }
}
