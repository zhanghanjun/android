package com.boke.imiloan.moduls.card.model;

import com.boke.imiloan.bean.CreditProductInfoBean;
import com.boke.imiloan.bean.CreditProductListBean;
import com.boke.imiloan.utils.Constant;

import java.util.Map;

import retrofit2.http.GET;
import retrofit2.http.QueryMap;
import rx.Observable;

/**
 * Created by Administrator on 2017/3/7.
 */

public interface ICardService {

    @GET(Constant.GETCREDITPRODUCTLIST)
    Observable<CreditProductListBean> getCreditProductList(@QueryMap Map<String, String> options);

    @GET(Constant.GETCREDITPRODUCTINFO)
    Observable<CreditProductInfoBean> getCreditProductInfo(@QueryMap Map<String, String> options);



}
