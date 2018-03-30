package com.sunjianchao.androidutils;

import android.app.Application;

import androidutils.sunjianchao.com.library.CrashHandlerUtil;
import androidutils.sunjianchao.com.library.LogUtil;

/**
 * Created by sunjianchao on 18/3/26.
 */

public class AndroidUtilsApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        LogUtil.setLog(false);
        //崩溃处理
        CrashHandlerUtil crashHandlerUtil = CrashHandlerUtil.getInstance();
        crashHandlerUtil.init(this);
        crashHandlerUtil.setCrashTip("很抱歉，程序出现异常，即将退出！");
    }
}
