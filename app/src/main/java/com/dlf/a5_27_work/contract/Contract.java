package com.dlf.a5_27_work.contract;

public interface Contract {
    interface BasePresenter<V>{
        void attach(V view);
        void detach();
    }

    interface View<T>{
        void onSuccess(T t);
        void onFlied(String msg);
    }

    interface Presenter extends BasePresenter<View>{
        void getData();
    }
}
