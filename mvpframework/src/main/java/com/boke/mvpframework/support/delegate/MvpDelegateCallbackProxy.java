package com.boke.mvpframework.support.delegate;

import com.boke.mvpframework.base.presenter.MvpPresenter;
import com.boke.mvpframework.base.view.MvpView;

/**
 * 具体的代理对象－－需要持有目标接口实例
 * 
 * @author Dream
 *
 */
public class MvpDelegateCallbackProxy<V extends MvpView, P extends MvpPresenter<V>>
		implements MvpDelegateCallback<V, P> {

	private MvpDelegateCallback<V, P> mvpDelegateCallback;

	public MvpDelegateCallbackProxy(
			MvpDelegateCallback<V, P> mvpDelegateCallback) {
		this.mvpDelegateCallback = mvpDelegateCallback;
	}

	@Override
	public P createPresenter() {
		P presenter = mvpDelegateCallback.getPresenter();
		if (presenter == null) {
			presenter = mvpDelegateCallback.createPresenter();
		}
		if (presenter == null) {
			throw new NullPointerException("Presenter is not null!");
		}

		// 绑定
		mvpDelegateCallback.setPresenter(presenter);
		return getPresenter();
	}

	/**
	 * 获取presenter
	 * 
	 * @return
	 */
	@Override
	public P getPresenter() {
		P presenter = mvpDelegateCallback.getPresenter();
		if (presenter == null) {
			// 抛异常
			throw new NullPointerException("Presenter is not null!");
		}
		return presenter;
	}

	@Override
	public void setPresenter(P presenter) {
		mvpDelegateCallback.setPresenter(presenter);
	}

	@Override
	public V getMvpView() {
		return mvpDelegateCallback.getMvpView();
	}

	public void attachView() {
		getPresenter().attachView(getMvpView());
	}

	public void detachView() {
		getPresenter().dettachView();
	}

	@Override
	public void setRetainInstance(boolean retaionInstance) {
		
	}

	@Override
	public boolean isRetainInstance() {
		return false;
	}

	@Override
	public boolean shouldInstanceBeRetained() {
		return false;
	}

}
