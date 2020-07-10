package com.dlf.a5_27_work.base;

import android.app.Application;
import android.content.Context;

import com.example.xts.greendaodemo.db.DaoMaster;
import com.example.xts.greendaodemo.db.DaoSession;

public class BaseApp extends Application {
    public static Context context;
    private static DaoSession daoSession;

    @Override
    public void onCreate() {
        super.onCreate();
        context = this;
        DaoMaster.DevOpenHelper openHelper = new DaoMaster.DevOpenHelper(this, "5_27.db");
        daoSession = new DaoMaster(openHelper.getWritableDb()).newSession();
    }

    public static DaoSession getDaoSession(){
        return daoSession;
    }
}
