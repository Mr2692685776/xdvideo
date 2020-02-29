package com.newheart.video.newheartvideo.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.newheart.video.newheartvideo.domain.Video;
import com.newheart.video.newheartvideo.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

/**
 * @Author newHeart
 * @Create 2020/2/28 9:57
 */
@RestController
@RequestMapping("/api/video")
public class VideoController {

    @Autowired
    private VideoService videoService;

    @GetMapping("page")
    public Object videoPage(@RequestParam(value = "page",defaultValue = "1") int page,
                            @RequestParam(value = "size",defaultValue = "5") int size){
        PageHelper.startPage(page, size);
        List<Video> list = videoService.findAll();
        PageInfo<Video> pageInfo = new PageInfo<>(list);
        HashMap<String, Object> map = new HashMap<>();
        map.put("total_size",pageInfo.getTotal());
        map.put("total_page",pageInfo.getPages());
        map.put("data",pageInfo.getList());
        return map;
    }

    @GetMapping("page2")
    public Object videoPage2(@RequestParam(value = "page",defaultValue = "1") int page,
                            @RequestParam(value = "size",defaultValue = "5") int size){
        List<Video> list = videoService.findAll();
        PageInfo<Video> pageInfo = new PageInfo<>(list);
        HashMap<String, Object> map = new HashMap<>();
        map.put("total_size",pageInfo.getTotal());
        map.put("total_page",pageInfo.getPages());
        map.put("data",pageInfo.getList());
        return map;
    }

    @GetMapping("findById")
    public Object findById(int id){
        return videoService.findById(id);
    }

    @DeleteMapping("delById")
    public Object delById(int id){
        return videoService.delete(id);
    }

    @PostMapping("update")
    public Object update(int id , String title){
        Video video = new Video();
        video.setId(id);
        video.setTitle(title);
        return videoService.update(video);
    }

    @PostMapping("save")
    public Object save(@RequestBody Video video){
        return videoService.save(video);
    }
}
