package com.dlf.a5_27_work.contract;

import java.lang.ref.WeakReference;

public abstract class AbStractPresenter<V> implements Contract.BasePresenter<V> {

    V view;
    @Override
    public void attach(V view) {
        WeakReference<V> weakReference = new WeakReference<>(view);
        this.view = weakReference.get();
    }

    @Override
    public void detach() {
        if (view != null) {
            view = null;
        }
    }
}
