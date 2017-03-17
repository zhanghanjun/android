package com.boke.imiloan.mycordovaplugin;

import org.apache.cordova.CordovaPlugin;

/**
 * 项目名称：android
 * 类描述：
 * 创建人：ZHANGHANJUN
 * 创建时间：2016/11/18 11:39
 * 修改人：Administrator
 * 修改时间：2016/11/18 11:39
 * 修改备注：
 *
 * @version 邮箱：1178075841@qq.com
 */


public class MyCordovaPlugin   extends CordovaPlugin{
    @Override
    public Boolean shouldAllowNavigation(String url) {
        return true;
    }

    @Override
    public Boolean shouldAllowRequest(String url) {
        return true;
    }

    @Override
    public Boolean shouldAllowBridgeAccess(String url) {
        return true;
    }

    @Override
    public Boolean shouldOpenExternalUrl(String url) {
        return true;
    }
}
