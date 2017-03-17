package com.boke.imiloan.moduls.home.model;

import com.boke.imiloan.bean.HomeBean;
import com.boke.imiloan.utils.Constant;

import retrofit2.http.GET;
import rx.Observable;

/**
 * Created by Administrator on 2017/3/7.
 */

public interface IHomeService {

    @GET(Constant.GETHOMEINFO)
    Observable<HomeBean> getHomeList();

//    @FormUrlEncoded
//    @POST(Constant.EDITINFORMATION)
//    Observable<HomeBean> EditInformation(@Field(value = "member_name", encoded = true) String membername,@Field("token") String token);

//    @FormUrlEncoded
//    @POST(Constant.EDITINFORMATION)
//    Observable<HomeBean> EditInformation(@FieldMap Map<String, String> fields);

}
