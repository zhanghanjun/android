package com.boke.imiloan.moduls.base.view.navigation.impl;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.boke.imiloan.R;

/**
 * 当前app默认的导航条(默认的ToolBar)
 *
 * 作者: Dream on 16/6/26 21:36
 * QQ:510278658
 * E-mail:510278658@qq.com
 */
public class DefaultNavigation extends AbsNavigation<DefaultNavigation.Builder.DefaultNavigationParams>{

    public DefaultNavigation(Builder.DefaultNavigationParams params){
        super(params);
    }

    @Override
    public int bindLayoutId() {
        return R.layout.navigation_default;
    }

    @Override
    public void builder() {
        super.builder();
        //给我们的导航条绑定资源
        //设置左边的ImageView的样式
        setImageViewStyle(R.id.iv_left,getParams().leftIconRes,getParams().leftIconOnClickListener);
        setImageViewStyle(R.id.iv_center,getParams().titleIconRes);
        setTextView(R.id.tv_title,getParams().title);
        setImageViewStyle(R.id.iv_right,getParams().rightIconRes,getParams().rightIconOnClickListener);
    }

    public void setTextView(int viewId,String title){
        View view = findViewById(viewId);
        if (view != null && view instanceof TextView){
            if (TextUtils.isEmpty(title)){
                view.setVisibility(View.GONE);
            }else{
                TextView textView = (TextView) view;
                textView.setVisibility(View.VISIBLE);
                textView.setText(title);
            }

        }
    }

    /**
     * 动态设置ImageView样式
     * @param viewId
     * @param imageRes
     */
    public void setImageViewStyle(int viewId, int imageRes){
        setImageViewStyle(viewId,imageRes,null);
    }

    /**
     * 动态设置ImageView样式
     * @param viewId
     * @param imageRes
     * @param onClickListener
     */
    public void setImageViewStyle(int viewId, int imageRes, View.OnClickListener onClickListener){
        ImageView imageView = (ImageView)findViewById(viewId);
        if (imageRes == 0){
            imageView.setVisibility(View.GONE);
        }else {
            imageView.setVisibility(View.VISIBLE);
            imageView.setImageResource(imageRes);
            imageView.setOnClickListener(onClickListener);
        }
    }

    //构建导航条类
    public static class Builder extends AbsNavigation.Builder{
        //构建导航条方法

        private DefaultNavigationParams params;

        public Builder(Context context,ViewGroup parent){
            super(context,parent);
            params = new DefaultNavigationParams(context,parent);
        }



        public Builder setTitle(String title) {
            params.title = title;
            return this;
        }

        public Builder setTitle(int title) {
            params.title = params.context.getResources().getString(title);
            return this;
        }

        public Builder setTitleIcon(int iconRes) {
            params.titleIconRes = iconRes;
            return this;
        }

        public Builder setLeftIcon(int iconRes) {
            params.leftIconRes = iconRes;
            return this;
        }

        public Builder setRightIcon(int iconRes) {
            params.rightIconRes = iconRes;
            return this;
        }

        public Builder setLeftIconOnClickListener(View.OnClickListener onClickListener){
            params.leftIconOnClickListener = onClickListener;
            return this;
        }

        public Builder setRightIconOnClickListener(View.OnClickListener onClickListener){
            params.rightIconOnClickListener = onClickListener;
            return this;
        }

        @Override
        public DefaultNavigation build() {
            return new DefaultNavigation(params);
        }

        //默认配置参数
        public static class DefaultNavigationParams extends NavigationParams{

            //标题
            public String title;
            //左边图片资源
            public int leftIconRes;
            //右边图片资源
            public int rightIconRes;
            //中间的图片资源
            public int titleIconRes;
            //左边的按钮点击事件
            public View.OnClickListener leftIconOnClickListener;
            //右边的按钮点击事件
            public View.OnClickListener rightIconOnClickListener;

            public DefaultNavigationParams(Context context,ViewGroup parent){
                super(context,parent);
            }
        }
    }

}
