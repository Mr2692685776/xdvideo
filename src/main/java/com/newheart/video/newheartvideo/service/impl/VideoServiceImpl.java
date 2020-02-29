package com.newheart.video.newheartvideo.service.impl;

import com.newheart.video.newheartvideo.domain.Video;
import com.newheart.video.newheartvideo.mapper.VideoMapper;
import com.newheart.video.newheartvideo.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author newHeart
 * @Create 2020/2/28 9:51
 */
@Service
public class VideoServiceImpl implements VideoService {

    @Autowired
    private VideoMapper videoMapper;

    @Override
    public List<Video> findAll() {
        return videoMapper.findAll();
    }

    @Override
    public Video findById(int id) {
        return videoMapper.findById(id);
    }

    @Override
    public int update(Video video) {
        return videoMapper.update(video);
    }

    @Override
    public int delete(int id) {
        return videoMapper.delete(id);
    }

    @Override
    public int save(Video video) {
        return videoMapper.save(video);
    }
}
