package com.dlf.a5_27_work.base;

import com.dlf.a5_27_work.contract.Contract;

public abstract class BaseMvpActivity<P extends Contract.BasePresenter> extends BaseActivity{

    protected P presenter;
    @Override
    protected void initView() {
        super.initView();
        presenter = initPresenter();
        if (presenter != null) {
            presenter.attach(this);
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (presenter != null) {
            presenter.detach();
        }
    }

    protected abstract P initPresenter();
}
