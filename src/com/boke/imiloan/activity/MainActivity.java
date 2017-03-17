package com.boke.imiloan.activity;

import android.content.Intent;
import android.view.KeyEvent;
import android.widget.TabHost;

import com.boke.imiloan.R;
import com.boke.imiloan.base.ActivityCollector;
import com.boke.imiloan.bean.CreditProductListBean;
import com.boke.imiloan.bean.FineProductListBean;
import com.boke.imiloan.bean.HomeBean;
import com.boke.imiloan.bean.LoanProductListBean;
import com.boke.imiloan.bean.MemberInfoBean;
import com.boke.imiloan.moduls.card.view.fragment.CardFragment;
import com.boke.imiloan.moduls.home.view.fragment.HomeFragment;
import com.boke.imiloan.moduls.loan.view.fragment.LoanFragment;
import com.boke.imiloan.moduls.mine.view.fragment.MineFragment;
import com.boke.imiloan.moduls.tab.BaseTabActivity;
import com.boke.imiloan.moduls.tab.iterator.ITabItem;
import com.boke.imiloan.moduls.tab.iterator.TabIterator;
import com.boke.imiloan.moduls.tab.iterator.tabitem.DefaultTabItem;
import com.boke.imiloan.moduls.tab.iterator.tabiterator.ListTabIterable;
import com.boke.imiloan.utils.CommonUtil;
import com.boke.imiloan.utils.LogUtil;
import com.boke.imiloan.utils.ToastUtil;
import com.google.gson.Gson;

import org.apache.cordova.CordovaPlugin;

public class MainActivity extends BaseTabActivity implements TabHost.OnTabChangeListener{
    private ListTabIterable listTabIterable;
    public static CordovaPlugin mCordovaPlugin;


    @Override
    public void initTabHostRes() {
        listTabIterable = new ListTabIterable();
        ActivityCollector.add(this);
        listTabIterable.addTab(new DefaultTabItem.DefaultTabItemBuilder(this, R.layout.tab_indicator)
                .setTitle(R.string.main_home_text)
                .setImageNormal(R.mipmap.tab_home_n)
                .setImagePress(R.mipmap.tab_home_h)
                .setTitleNormalColor(R.color.main_tab_text_normal)
                .setTitlePressColor(R.color.main_tab_text_select)
                .setFragmentClazz(HomeFragment.class).build());

        listTabIterable.addTab(new DefaultTabItem.DefaultTabItemBuilder(this,R.layout.tab_indicator)
                .setTitle(R.string.main_loan_text)
                .setImageNormal(R.mipmap.tab_loan_n)
                .setImagePress(R.mipmap.tab_loan_h)
                .setTitleNormalColor(R.color.main_tab_text_normal)
                .setTitlePressColor(R.color.main_tab_text_select)
                .setFragmentClazz(LoanFragment.class).build());


        listTabIterable.addTab(new DefaultTabItem.DefaultTabItemBuilder(this,R.layout.tab_indicator)
                .setTitle(R.string.main_card_text)
                .setImageNormal(R.mipmap.tab_card_n)
                .setImagePress(R.mipmap.tab_card_h)
                .setTitleNormalColor(R.color.main_tab_text_normal)
                .setTitlePressColor(R.color.main_tab_text_select)
                .setFragmentClazz(CardFragment.class).build());

        listTabIterable.addTab(new DefaultTabItem.DefaultTabItemBuilder(this,R.layout.tab_indicator)
                .setTitle(R.string.main_mine_text)
                .setImageNormal(R.mipmap.tab_my_n)
                .setImagePress(R.mipmap.tab_my_h)
                .setTitleNormalColor(R.color.main_tab_text_normal)
                .setTitlePressColor(R.color.main_tab_text_select)
                .setFragmentClazz(MineFragment.class).build());
    }

    @Override
    public TabIterator<ITabItem> getTabIterator() {
        return listTabIterable.iterator();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        CordovaPlugin cordovaPlugin = this.mCordovaPlugin;
        if(cordovaPlugin != null){
            cordovaPlugin.onActivityResult(requestCode,resultCode,data);
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if(mCordovaPlugin!=null){
            mCordovaPlugin.webView.handleDestroy();
        }
    }

    public void callBackHomeInfo(HomeBean result){
        LogUtil.e("HomeBean==",new Gson().toJson(result));
        if(result!=null){
            //ToastUtil.showToast(this,result.getMessage());
        }else{
            ToastUtil.showToast(this,"系统维护中，请稍后再试");
        }
    }


    public void callBackLoanProductList(LoanProductListBean result){
        LogUtil.e("LoanProductListBean==",new Gson().toJson(result));
        if(result!=null){
            //ToastUtil.showToast(this,result.getMessage());
        }else{
            ToastUtil.showToast(this,"系统维护中，请稍后再试");
        }
    }



    public void callBackCreditProductList(CreditProductListBean result){
        LogUtil.e("CreditProductListBean==",new Gson().toJson(result));
        if(result!=null){
            //ToastUtil.showToast(this,result.getMessage());
        }else{
            ToastUtil.showToast(this,"系统维护中，请稍后再试");
        }
    }


    public void callBackFineProductList(FineProductListBean result){
        if(result!=null){
            //ToastUtil.showToast(this,result.getMessage());
        }else{
            ToastUtil.showToast(this,"系统维护中，请稍后再试");
        }
    }


    public void callBackMemberInfo(MemberInfoBean result){
        LogUtil.e("MemberInfoBean==",new Gson().toJson(result));
        if(result!=null){
            //ToastUtil.showToast(this,result.getMessage());
        }else{
            ToastUtil.showToast(this,"系统维护中，请稍后再试");
        }
    }



    @Override
    public boolean dispatchKeyEvent(KeyEvent event) {
        if (event.getKeyCode() == KeyEvent.KEYCODE_BACK) {//点击的是返回键
            if (event.getAction() == KeyEvent.ACTION_DOWN && event.getRepeatCount() == 0) {//按键的按下事件
                CommonUtil.exitBy2Click(this);
                return true;
            }
        }
        return false;
    }


}
