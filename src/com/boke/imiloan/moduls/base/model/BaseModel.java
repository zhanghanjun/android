package com.boke.imiloan.moduls.base.model;

import android.content.Context;

import com.boke.imiloan.utils.Constant;
import com.boke.mvpframework.base.model.MvpModel;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * 作者: Dream on 16/9/24 21:10
 * QQ:510278658
 * E-mail:510278658@qq.com
 */

public class BaseModel implements MvpModel {

    private Context context;

    public BaseModel(Context context){
        this.context = context;
    }

    public Context getContext() {
        return context;
    }

    public String getServerUrl(){
        return Constant.COMMONURL;
    }

    public <T> T buildService(Class<T> service){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(getServerUrl())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return retrofit.create(service);
    }
}
