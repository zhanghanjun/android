package com.boke.imiloan.base;

import android.app.Application;
import com.boke.imiloan.bean.UserBean;

/**
 * Created by Administrator on 2017/3/15.
 */

public class MyApplication extends Application {
    private UserBean user = new UserBean();
    private static MyApplication instance;
    public MyApplication() {}

    public static MyApplication getInstance() {
        if (instance == null)
            instance = new MyApplication();
        return instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }

    public UserBean getUser() {
        if(user ==null){
            user = new UserBean();
        }
        return user;
    }

    public void setUser(UserBean user) {
        this.user = user;
    }





}
