package com.boke.imiloan.utils;

import android.content.Context;
import android.widget.ImageView;
import com.boke.imiloan.R;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;
import com.nostra13.universalimageloader.core.display.RoundedBitmapDisplayer;

/**
 * 对ImageLoader类做了简单的封装
 *
 * Created by Dream on 16/5/30.
 */
public class ImageLoaderUtils {

    private static ImageLoaderUtils imageLoaderUtils;

    private DisplayImageOptions headerDisplayImageOptions;
    private DisplayImageOptions displayImageOptions;

    private ImageLoaderUtils(){

    }

    public static ImageLoaderUtils getInstance(){
        if (imageLoaderUtils == null){
            imageLoaderUtils = new ImageLoaderUtils();
        }
        return imageLoaderUtils;
    }

    private void init(Context context){
        if (!ImageLoader.getInstance().isInited()){
            ImageLoader.getInstance().init(ImageLoaderConfiguration.createDefault(context));
        }
    }


    /**
     * 下载头像
     * @param context
     * @param url
     * @param imageView
     */
    public void loadHeaderImage(Context context, String url,ImageView imageView){
        if (headerDisplayImageOptions == null){
            DisplayImageOptions.Builder displayImageOptionsBuilder = new DisplayImageOptions.Builder();
            displayImageOptionsBuilder.cacheInMemory(true)
                    .cacheOnDisk(true)
                    .displayer(new RoundedBitmapDisplayer(360));
            headerDisplayImageOptions = displayImageOptionsBuilder.build();
        }
        displayImage(context,url,imageView,headerDisplayImageOptions);
    }

    /**
     * 下载普通的图片
     * @param context
     * @param url
     * @param imageView
     */
    public void loadImage(Context context, String url,ImageView imageView){
        if (displayImageOptions == null){
            DisplayImageOptions.Builder displayImageOptionsBuilder = new DisplayImageOptions.Builder();
            displayImageOptionsBuilder.cacheInMemory(true)
                    .cacheOnDisk(true)
                    .showImageForEmptyUri(R.mipmap.pic_loading);
            displayImageOptions = displayImageOptionsBuilder.build();
        }
        displayImage(context,url,imageView,displayImageOptions);
    }

    private void displayImage(Context context, String url,ImageView imageView,DisplayImageOptions displayImageOptions){
        init(context);
        ImageLoader.getInstance().displayImage(url,imageView,displayImageOptions);
    }

}
