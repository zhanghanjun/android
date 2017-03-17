package com.boke.mvpframework.test;

import android.os.Bundle;

import com.boke.mvpframework.R;
import com.boke.mvpframework.support.view.MvpActivity;

public class MainActivity extends MvpActivity<MainView, MainPresenter> implements MainView{
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		getPresenter().register();
	}

	@Override
	public MainPresenter createPresenter() {
		return new MainPresenter(this);
	}

	@Override
	public void onLoginResult(String result) {
		getMvpView().onLoginResult("");
	}

	@Override
	public void onRegisterResult(String result) {
		
	}

}
