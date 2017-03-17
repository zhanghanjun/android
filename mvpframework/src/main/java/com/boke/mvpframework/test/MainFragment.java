package com.boke.mvpframework.test;

import com.boke.mvpframework.support.view.MvpFragment;

public class MainFragment extends MvpFragment<MainView, MainPresenter> {

	@Override
	public MainPresenter createPresenter() {
		return new MainPresenter(getContext());
	}

	@Override
	public boolean isRetainInstance() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean shouldInstanceBeRetained() {
		// TODO Auto-generated method stub
		return false;
	}

}
