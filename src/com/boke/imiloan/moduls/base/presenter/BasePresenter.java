package com.boke.imiloan.moduls.base.presenter;

import android.content.Context;

import com.boke.mvpframework.base.presenter.impl.MvpBasePresenter;
import com.boke.mvpframework.base.view.MvpView;

/**
 * 作者: Dream on 16/9/24 21:26
 * QQ:510278658
 * E-mail:510278658@qq.com
 */

public abstract class BasePresenter<V extends MvpView> extends MvpBasePresenter<V> {

    public BasePresenter(Context context) {
        super(context);
    }

}
