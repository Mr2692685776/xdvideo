package com.newheart.video.newheartvideo.service;

import com.newheart.video.newheartvideo.domain.Video;

import java.util.List;

/**
 * @Author newHeart
 * @Create 2020/2/28 9:50
 */
public interface VideoService {

    List<Video> findAll();

    Video findById(int id);

    int update(Video video);

    int delete(int id);

    int save(Video video);
}
