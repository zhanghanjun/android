package com.boke.imiloan.moduls.mine.model;

import android.content.Context;
import android.util.Log;

import com.boke.imiloan.bean.DeleteApplyTransactionBean;
import com.boke.imiloan.bean.MemberAccountInfoBean;
import com.boke.imiloan.bean.MemberApplyInfoBean;
import com.boke.imiloan.bean.MemberApplyTransListBean;
import com.boke.imiloan.bean.MemberInfoBean;
import com.boke.imiloan.bean.SaveApplyInfoBean;
import com.boke.imiloan.bean.SaveMemberInfoBean;
import com.boke.imiloan.http.HttpUtils;
import com.boke.imiloan.moduls.base.model.BaseModel;

import java.util.Map;

import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

/**
 * Created by Administrator on 2017/3/7.
 */

public class MemberModel extends BaseModel{
    public MemberModel(Context context) {
        super(context);
    }


    //获取会员个人资料
    public void getMemberInfo(Map<String, String> map,final HttpUtils.OnLceHttpResultListener onLceHttpResultListener) {
        buildService(IMemberService.class)
                .getMemberInfo(map)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Action1<MemberInfoBean>() {
                    @Override
                    public void call(MemberInfoBean memberInfoBean) {
                        Log.e("memberInfoBean==",memberInfoBean.toString());
                        onLceHttpResultListener.onResult(memberInfoBean);
                    }
                }, new Action1<Throwable>() {
                    @Override
                    public void call(Throwable throwable) {
                        onLceHttpResultListener.onError(new Exception(throwable));
                    }
                });
    }


    //获取会员申请信息
    public void getMemberApplyInfo(Map<String, String> map,final HttpUtils.OnLceHttpResultListener onLceHttpResultListener) {
        buildService(IMemberService.class)
                .getMemberApplyInfo(map)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Action1<MemberApplyInfoBean>() {
                    @Override
                    public void call(MemberApplyInfoBean memberApplyInfoBean) {
                        Log.e("memberApplyInfoBean==",memberApplyInfoBean.toString());
                        onLceHttpResultListener.onResult(memberApplyInfoBean);
                    }
                }, new Action1<Throwable>() {
                    @Override
                    public void call(Throwable throwable) {
                        onLceHttpResultListener.onError(new Exception(throwable));
                    }
                });
    }



    //获取会员账号信息
    public void getMemberAccountInfo(Map<String, String> map,final HttpUtils.OnLceHttpResultListener onLceHttpResultListener) {
        buildService(IMemberService.class)
                .getMemberAccountInfo(map)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Action1<MemberAccountInfoBean>() {
                    @Override
                    public void call(MemberAccountInfoBean memberAccountInfoBean) {
                        Log.e("memberAccountInfoBean==",memberAccountInfoBean.toString());
                        onLceHttpResultListener.onResult(memberAccountInfoBean);
                    }
                }, new Action1<Throwable>() {
                    @Override
                    public void call(Throwable throwable) {
                        onLceHttpResultListener.onError(new Exception(throwable));
                    }
                });
    }



    //获取会员申请记录列表
    public void getApplyTransaction(Map<String, String> map,final HttpUtils.OnLceHttpResultListener onLceHttpResultListener) {
        buildService(IMemberService.class)
                .getApplyTransaction(map)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Action1<MemberApplyTransListBean>() {
                    @Override
                    public void call(MemberApplyTransListBean memberApplyTransListBean) {
                        Log.e("memberApplyTransList==",memberApplyTransListBean.toString());
                        onLceHttpResultListener.onResult(memberApplyTransListBean);
                    }
                }, new Action1<Throwable>() {
                    @Override
                    public void call(Throwable throwable) {
                        onLceHttpResultListener.onError(new Exception(throwable));
                    }
                });
          }




    //会员申请记录删除
    public void deleteApplyTransaction(Map<String, String> map,final HttpUtils.OnLceHttpResultListener onLceHttpResultListener) {
        buildService(IMemberService.class)
                .deleteApplyTransaction(map)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Action1<DeleteApplyTransactionBean>() {
                    @Override
                    public void call(DeleteApplyTransactionBean deleteApplyTransactionBean) {
                        Log.e("deleteTransactionBean==",deleteApplyTransactionBean.toString());
                        onLceHttpResultListener.onResult(deleteApplyTransactionBean);
                    }
                }, new Action1<Throwable>() {
                    @Override
                    public void call(Throwable throwable) {
                        onLceHttpResultListener.onError(new Exception(throwable));
                    }
                });
    }




    //个人信息保存接口
    public void setMemberInfo(Map<String, String> map,final HttpUtils.OnLceHttpResultListener onLceHttpResultListener) {
        buildService(IMemberService.class)
                .setMemberInfo(map)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Action1<SaveMemberInfoBean>() {
                    @Override
                    public void call(SaveMemberInfoBean setMemberInfoBean) {
                        Log.e("setMemberInfoBean==",setMemberInfoBean.toString());
                        onLceHttpResultListener.onResult(setMemberInfoBean);
                    }
                }, new Action1<Throwable>() {
                    @Override
                    public void call(Throwable throwable) {
                        onLceHttpResultListener.onError(new Exception(throwable));
                    }
                });
    }



    //会员申请信息保存接口
    public void setApplyInfo(Map<String, String> map,final HttpUtils.OnLceHttpResultListener onLceHttpResultListener) {
        buildService(IMemberService.class)
                .setApplyInfo(map)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Action1<SaveApplyInfoBean>() {
                    @Override
                    public void call(SaveApplyInfoBean setApplyInfoBean) {
                        Log.e("setApplyInfoBean==",setApplyInfoBean.toString());
                        onLceHttpResultListener.onResult(setApplyInfoBean);
                    }
                }, new Action1<Throwable>() {
                    @Override
                    public void call(Throwable throwable) {
                        onLceHttpResultListener.onError(new Exception(throwable));
                    }
                });
    }



}
