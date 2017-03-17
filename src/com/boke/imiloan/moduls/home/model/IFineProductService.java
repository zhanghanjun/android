package com.boke.imiloan.moduls.home.model;

import com.boke.imiloan.bean.FineProductListBean;
import com.boke.imiloan.utils.Constant;

import java.util.Map;

import retrofit2.http.GET;
import retrofit2.http.QueryMap;
import rx.Observable;

/**
 * Created by Administrator on 2017/3/7.
 */

public interface IFineProductService {

    @GET(Constant.GETFINEPRODUCTLIST)
    Observable<FineProductListBean> getFineProductList(@QueryMap Map<String, String> options);

}
