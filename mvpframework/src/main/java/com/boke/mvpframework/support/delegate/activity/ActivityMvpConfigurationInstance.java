package com.boke.mvpframework.support.delegate.activity;
import com.boke.mvpframework.base.presenter.MvpPresenter;
import com.boke.mvpframework.base.view.MvpView;

public class ActivityMvpConfigurationInstance<V extends MvpView, P extends MvpPresenter<V>> {
	private P presenter;
	private Object customeConfigurationInstance;

	public ActivityMvpConfigurationInstance(P presenter,
			Object customeConfigurationInstance) {
		super();
		this.presenter = presenter;
		this.customeConfigurationInstance = customeConfigurationInstance;
	}

	public P getPresenter() {
		return presenter;
	}

	public void setPresenter(P presenter) {
		this.presenter = presenter;
	}

	public Object getCustomeConfigurationInstance() {
		return customeConfigurationInstance;
	}

	public void setCustomeConfigurationInstance(
			Object customeConfigurationInstance) {
		this.customeConfigurationInstance = customeConfigurationInstance;
	}

}
