package cn.com.git.udmp.showcase.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

import cn.com.git.udmp.showcase.ShowcaseApplication;
import cn.com.git.udmp.showcase.common.ILog;

@SpringBootApplication
@ImportResource({"classpath:dubbo-service.xml","classpath:dubbo-client.xml"})
public class RestServiceApplication implements ILog{
    
    public static void main(String a[]){
        SpringApplication.run(ShowcaseApplication.class, a);
        logger.info("RestService 启动....");
// 关闭Banner输出
//        SpringApplication sa = new SpringApplication(ShowcaseApplication.class);
//        sa.setBannerMode(Mode.OFF);
//        sa.run(a);
    }
}
