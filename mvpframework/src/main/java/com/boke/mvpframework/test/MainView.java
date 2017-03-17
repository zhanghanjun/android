package com.boke.mvpframework.test;

import com.boke.mvpframework.base.view.MvpView;

public interface MainView extends MvpView {
	public void onLoginResult(String result);
	
	//只需在该接口中添加相应功能接口即可
	public void onRegisterResult(String result);
}
