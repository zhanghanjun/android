package com.boke.imiloan.moduls.mine.model;

import com.boke.imiloan.bean.DeleteApplyTransactionBean;
import com.boke.imiloan.bean.MemberAccountInfoBean;
import com.boke.imiloan.bean.MemberApplyInfoBean;
import com.boke.imiloan.bean.MemberApplyTransListBean;
import com.boke.imiloan.bean.MemberInfoBean;
import com.boke.imiloan.bean.SaveApplyInfoBean;
import com.boke.imiloan.bean.SaveMemberInfoBean;
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

public interface IMemberService {

    @GET(Constant.GETMEMBERINFO)
    Observable<MemberInfoBean> getMemberInfo(@QueryMap Map<String, String> options);

    @GET(Constant.GETAPPLYINFO)
    Observable<MemberApplyInfoBean> getMemberApplyInfo(@QueryMap Map<String, String> options);

    @GET(Constant.GETMEMBERACCOUNTINFO)
    Observable<MemberAccountInfoBean> getMemberAccountInfo(@QueryMap Map<String, String> options);

    @GET(Constant.GETAPPLYTRANSACTION)
    Observable<MemberApplyTransListBean> getApplyTransaction(@QueryMap Map<String, String> options);


    @GET(Constant.DELETEAPPLYTRANSACTION)
    Observable<DeleteApplyTransactionBean> deleteApplyTransaction(@QueryMap Map<String, String> options);

    @FormUrlEncoded
    @POST(Constant.SETMEMBERINFO)
    Observable<SaveMemberInfoBean> setMemberInfo(@FieldMap Map<String, String> options);

    @FormUrlEncoded
    @POST(Constant.SETAPPLYINFO)
    Observable<SaveApplyInfoBean> setApplyInfo(@FieldMap Map<String, String> options);

}
