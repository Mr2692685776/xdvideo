package com.newheart.video.newheartvideo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.newheart.video.newheartvideo.mapper")
public class NewheartVideoApplication {

    public static void main(String[] args) {
        SpringApplication.run(NewheartVideoApplication.class, args);
    }

}
