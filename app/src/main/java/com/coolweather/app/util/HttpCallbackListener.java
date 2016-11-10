package com.coolweather.app.util;

/**HttpUtil回调方法
 * Created by hxh on 2016/11/9.
 */

public interface HttpCallbackListener {
    void onFinish(String response);
    void onError(Exception e);
}
