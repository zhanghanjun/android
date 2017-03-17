package com.boke.mvpframework.support.delegate.fragment;


import com.boke.mvpframework.base.presenter.MvpPresenter;
import com.boke.mvpframework.base.view.MvpView;
import com.boke.mvpframework.support.delegate.MvpDelegateCallback;

/**
 * 扩展目标接口 针对不同的模块，目标接口有差异
 * 
 * @author Dream
 *
 */
public interface FragmentMvpDelegateCallback<V extends MvpView, P extends MvpPresenter<V>>
		extends MvpDelegateCallback<V, P> {
	
}
