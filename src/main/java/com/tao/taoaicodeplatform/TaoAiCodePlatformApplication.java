package com.tao.taoaicodeplatform;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.tao.taoaicodeplatform.mapper")
public class TaoAiCodePlatformApplication {

    public static void main(String[] args) {
        SpringApplication.run(TaoAiCodePlatformApplication.class, args);
    }

}
