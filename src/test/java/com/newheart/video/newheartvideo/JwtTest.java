package com.newheart.video.newheartvideo;

import com.newheart.video.newheartvideo.domain.User;
import com.newheart.video.newheartvideo.utils.JwtUtil;
import io.jsonwebtoken.Claims;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author newHeart
 * @Create 2020/2/29 9:31
 */

public class JwtTest {

    @Test
    public void createTokenTest(){
        User user = new User();
        user.setId(1);
        user.setName("newheart");
        user.setHeadImg("/6666");
        String token = JwtUtil.createToken(user);
        System.out.println(token);
    }

    @Test
    public void checkToken(){
        Claims claims = JwtUtil.checkToken("eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJuZXdoZWFydCIsImlkIjoxLCJuYW1lIjoibmV3aGVhcnQiLCJpbWciOiIvNjY2NiIsImlhdCI6MTU4Mjk0MDE1NywiZXhwIjoxNTgyOTQxOTU3fQ.eWGGpDWi3cYA0YVRN7DDg_H5VbrRD7KSZnXRLhh6moE");
        int id = (int) claims.get("id");
        String name = (String) claims.get("name");
        String img = (String) claims.get("img");
        System.out.println(id);
        System.out.println(name);
        System.out.println(img);
    }
}
