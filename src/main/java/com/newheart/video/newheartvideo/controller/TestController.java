package com.newheart.video.newheartvideo.controller;
import com.newheart.video.newheartvideo.config.WeChatConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author newHeart
 * @Create 2020/2/21 22:27
 */
@RestController
public class TestController {

    @Autowired
    private WeChatConfig weChatConfig;

    @GetMapping("/test")
    public String test(){
        return weChatConfig.getAppid()+":"+weChatConfig.getAppsecret();
    }
}
