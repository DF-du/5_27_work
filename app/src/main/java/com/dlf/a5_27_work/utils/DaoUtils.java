package com.dlf.a5_27_work.utils;

import com.dlf.a5_27_work.base.BaseApp;
import com.dlf.a5_27_work.bean.DatasBean;
import com.example.xts.greendaodemo.db.DaoSession;
import com.example.xts.greendaodemo.db.DatasBeanDao;

public class DaoUtils {


    static DaoSession daoSession = BaseApp.getDaoSession();

    public static void insert(DatasBean datasBean) {
        daoSession.insert(datasBean);
    }

    public static void delete(DatasBean datasBean) {
        daoSession.delete(datasBean);
    }

    public static DatasBean query(DatasBean datasBean) {
        return daoSession.queryBuilder(DatasBean.class).where(DatasBeanDao.Properties.Title.eq(datasBean.getTitle())).unique();

    }
}
