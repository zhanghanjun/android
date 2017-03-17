package com.boke.imiloan.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Created by laohu on 2016/7/29.
 */
public class JsonUtil {
    private static JsonUtil instance = null;

    private JsonUtil() {
    }

    /**
     * 数据接口静态方法
     * @return  返回静态对象
     */
    public static synchronized JsonUtil getInstance() {
        if (instance == null) {
            instance = new JsonUtil();
        }
        return instance;
    }

    /**
     * 泛型反射机制 解析json数据
     * @param <T>  声明泛型方法
     * @param str  json字符串
     * @param clazz  jsonbean解析方法
     * @return  json数据
     */
    public <T> T get(String str, Class<T> clazz)
    {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();

        try {
            return (T) gson.fromJson(str, clazz);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }




}
