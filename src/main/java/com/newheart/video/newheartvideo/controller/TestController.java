package com.newheart.video.newheartvideo.controller;
import com.newheart.video.newheartvideo.config.WeChatConfig;
import com.newheart.video.newheartvideo.domain.Video;
import com.newheart.video.newheartvideo.mapper.VideoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author newHeart
 * @Create 2020/2/21 22:27
 */
@RestController
public class TestController {

    @Autowired
    private VideoMapper videoMapper;

    @Autowired
    private WeChatConfig weChatConfig;

    @GetMapping("/test")
    public String test(){
        return weChatConfig.getAppid()+":"+weChatConfig.getAppsecret();
    }

    @GetMapping("/all")
    public List<Video> testAll(){
        return videoMapper.findAll();
    }
}
