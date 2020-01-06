package com.funtl.spring.security.oauth2.resource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author songtao
 * @create 2020-01-2020/1/5-21:05
 */

@SpringBootApplication
@MapperScan("com.funtl.spring.security.oauth2.resource.mapper")
public class OAuth2ResourceApplication {
    public static void main(String[] args) {
        SpringApplication.run(OAuth2ResourceApplication.class,args);
    }

}
