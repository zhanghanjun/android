package com.boke.imiloan.moduls.loan.model;

import com.boke.imiloan.bean.LoanProductInfoBean;
import com.boke.imiloan.bean.LoanProductListBean;
import com.boke.imiloan.bean.MemberInfoBean;
import com.boke.imiloan.utils.Constant;

import java.util.Map;

import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.QueryMap;
import rx.Observable;

/**
 * Created by Administrator on 2017/3/7.
 */

public interface ILoanService {

    @GET(Constant.GETLOANPRODUCTLIST)
    Observable<LoanProductListBean> getLoanProductList(@QueryMap Map<String, String> options);

    @GET(Constant.GETLOANPRODUCTINFO)
    Observable<LoanProductInfoBean> getLoanProductInfo(@QueryMap Map<String, String> options);


    @FormUrlEncoded
    @POST(Constant.PRODUCTAPPLY)
    Observable<MemberInfoBean> productApply(@FieldMap Map<String, String> options);



}
