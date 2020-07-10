package com.dlf.a5_27_work.utils;

import com.dlf.a5_27_work.bean.List_Bean;

import io.reactivex.Observable;
import retrofit2.http.GET;

public interface ApiService {
//    http://static.owspace.com/?c=api&a=getList&page_id=0
    String base_url = "http://static.owspace.com/";

    @GET("?c=api&a=getList&page_id=0")
    Observable<List_Bean> getUIData();
}
