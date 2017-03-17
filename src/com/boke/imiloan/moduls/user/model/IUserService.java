package com.boke.imiloan.moduls.user.model;

import com.boke.imiloan.bean.UserBean;
import com.boke.imiloan.bean.UserFindPwdBean;
import com.boke.imiloan.bean.UserFindPwdSubmitBean;
import com.boke.imiloan.bean.UserRegisterBean;
import com.boke.imiloan.bean.UserRegisterSubmitBean;
import com.boke.imiloan.utils.Constant;

import java.util.Map;

import retrofit2.http.GET;
import retrofit2.http.QueryMap;
import rx.Observable;

/**
 * Created by Administrator on 2017/3/7.
 */

public interface IUserService {

//    @GET(Constant.LOGINURL)
//    Observable<UserBean> memLogin(@Query("cellPhone") String username, @Query("password") String password);

    @GET(Constant.MEMLOGIN)
    Observable<UserBean> memLogin(@QueryMap Map<String, String> options);

    @GET(Constant.MEMREGISTER)
    Observable<UserRegisterBean> memRregister(@QueryMap Map<String, String> options);

    @GET(Constant.MEMREGISTERUSERSUBMIT)
    Observable<UserRegisterSubmitBean> memRegisterSubmit(@QueryMap Map<String, String> options);

    @GET(Constant.MEMFINDPASSWORD)
    Observable<UserFindPwdBean> memFindPassword(@QueryMap Map<String, String> options);

    @GET(Constant.MEMFINDPASSWORDSUBMIT)
    Observable<UserFindPwdSubmitBean> memFindPasswordSubmit(@QueryMap Map<String, String> options);



}
