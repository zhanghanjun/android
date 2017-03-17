package com.boke.mvpframework.test;

import android.content.Context;

import com.boke.mvpframework.base.presenter.impl.MvpBasePresenter;

public class MainPresenter extends MvpBasePresenter<MainView> {
	
	private RegisterModel registerModel;

	public MainPresenter(Context context) {
		super(context);
		registerModel = new RegisterModel();
	}

	public void register(){
		
	}

}
