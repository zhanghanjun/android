package com.boke.imiloan.moduls.base.view.navigation;

/**
 * 定义导航条的规范
 *
 * 作者: Dream on 16/6/26 21:10
 * QQ:510278658
 * E-mail:510278658@qq.com
 */
public interface INavigation {

    //绑定布局ID
    public int bindLayoutId();

    //创建布局并且绑定布局到UI主界面
    public void builder();

}
