package com.mxjzq;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@SpringBootApplication
public class Application  extends SpringBootServletInitializer {
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(Application.class);
    }

    public static void main(String[] args) {
    	log.info("名校家长圈小程序后端系统正在启动中……");
        new SpringApplicationBuilder(Application.class).web(true).run(args);
        log.info("名校家长圈小程序后端系统启动成功！！！！");
    }
}
