package com.jc.wx;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@RestController
@MapperScan("com.jc.wx.dao")
@SpringBootApplication
public class WxApplication {

    public static void main(String[] args) {
        SpringApplication application=new SpringApplication(WxApplication.class);
        /**
         * OFF G关闭
         * CLOSED 后台控制台输出，默认就是这种
         * LOG 日志输出
         */
        application.setBannerMode(Banner.Mode.OFF);
        application.run(args);
    }

}
