package com.boke.mvpframework.test.view;

import android.content.Context;
import android.util.AttributeSet;

import com.boke.mvpframework.support.view.view.MvpImageView;
import com.boke.mvpframework.test.layout.MyPresenter;
import com.boke.mvpframework.test.layout.MyView;

public class MyImageView extends MvpImageView<MyView, MyPresenter> implements MyView{

	public MyImageView(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	public MyImageView(Context context) {
		super(context);
	}

	@Override
	public MyPresenter createPresenter() {
		return new MyPresenter(getContext());
	}

	@Override
	public void onResult(String result) {
	}

}
