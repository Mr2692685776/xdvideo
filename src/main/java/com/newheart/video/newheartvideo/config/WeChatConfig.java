package com.newheart.video.newheartvideo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * @Author newHeart
 * @Create 2020/2/21 23:05
 */
@Configuration
public class WeChatConfig {

    @Value("${wxpay.appid}")
    private String appid;

    @Value("${wxpay.appsecret}")
    private String appsecret;

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public String getAppsecret() {
        return appsecret;
    }

    public void setAppsecret(String appsecret) {
        this.appsecret = appsecret;
    }
}
