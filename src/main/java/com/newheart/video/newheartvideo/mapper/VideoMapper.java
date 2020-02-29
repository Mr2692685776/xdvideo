package com.newheart.video.newheartvideo.mapper;

import com.newheart.video.newheartvideo.domain.Video;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author newHeart
 * @Create 2020/2/28 9:14
 */
@Repository
public interface VideoMapper {
    @Select("select * from video")
    List<Video> findAll();
    @Select("SELECT * FROM video WHERE id = #{id}")
    Video findById(int id);
    @Update("UPDATE video SET title=#{title} WHERE id =#{id}")
    int update(Video video);
    @Delete("DELETE FROM video WHERE id =#{id}")
    int delete(int id);

    @Insert("INSERT INTO `video` ( `title`, `summary`, " +
            "`cover_img`, `view_num`, `price`, `create_time`," +
            " `online`, `point`)" +
            "VALUES" +
            "(#{title}, #{summary}, #{coverImg}, #{viewNum}, #{price},#{createTime}" +
            ",#{online},#{point});")
    @Options(useGeneratedKeys=true, keyProperty="id", keyColumn="id")
    int save(Video video);

}
