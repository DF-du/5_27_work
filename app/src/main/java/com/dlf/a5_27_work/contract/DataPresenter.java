package com.dlf.a5_27_work.contract;

import com.dlf.a5_27_work.bean.List_Bean;
import com.dlf.a5_27_work.utils.ApiService;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class DataPresenter extends AbStractPresenter<Contract.View> implements Contract.Presenter {
    @Override
    public void getData() {
        Retrofit build = new Retrofit.Builder()
                .baseUrl(ApiService.base_url)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
        Observable<List_Bean> uiData = build.create(ApiService.class).getUIData();
        uiData.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<List_Bean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(List_Bean list_bean) {
                        view.onSuccess(list_bean);
                    }

                    @Override
                    public void onError(Throwable e) {
                        view.onFlied(e.getMessage());
                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }
}
