package com.boke.mvpframework.support.delegate.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.View;

import com.boke.mvpframework.base.presenter.MvpPresenter;
import com.boke.mvpframework.base.view.MvpView;
import com.boke.mvpframework.support.delegate.MvpDelegateCallbackProxy;

/**
 * 具体的目标接口实现类
 * 
 * @author Dream
 *
 * @param <V>
 * @param <P>
 */
public class FragmentMvpDelegateImpl<V extends MvpView, P extends MvpPresenter<V>>
		implements FragmentMvpDelegate<V, P> {

	private MvpDelegateCallbackProxy<V, P> proxy;
	// 具体的目标接口实现类，需要持有创建Mvp实例
	private FragmentMvpDelegateCallback<V, P> delegateCallback;

	public FragmentMvpDelegateImpl(
			FragmentMvpDelegateCallback<V, P> delegateCallback) {
		if (delegateCallback == null) {
			throw new NullPointerException("delegateCallback is not null!");
		}
		this.delegateCallback = delegateCallback;
	}
	
	private MvpDelegateCallbackProxy<V, P> getDelegateProxy() {
		if (this.proxy == null) {
			this.proxy = new MvpDelegateCallbackProxy<V, P>(delegateCallback);
		}
		return this.proxy;
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		
	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {

	}

	@Override
	public void onViewCreated(View view, Bundle savedInstanceState) {
		getDelegateProxy().createPresenter();
		getDelegateProxy().attachView();
	}

	@Override
	public void onStart() {

	}

	@Override
	public void onPause() {

	}

	@Override
	public void onResume() {
		// TODO Auto-generated method stub

	}

	@Override
	public void onStop() {

	}

	@Override
	public void onDestroyView() {
		getDelegateProxy().detachView();
	}

	@Override
	public void onDestroy() {

	}

	@Override
	public void onSaveInstanceState(Bundle outState) {

	}

	@Override
	public void onAttach(Context context) {

	}

	@Override
	public void onDetach() {

	}

}
