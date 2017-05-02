package cn.com.git.udmp.showcase;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

import cn.com.git.udmp.showcase.common.ILog;

@ComponentScan(basePackages={"cn.com.git.udmp.showcase"})
@SpringBootApplication
public class ShowcaseApplication extends SpringBootServletInitializer implements CommandLineRunner,ILog{
    
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(ShowcaseApplication.class);
    }
    
    public static void main(String a[]){
        SpringApplication.run(ShowcaseApplication.class, a);
    } 
    
    public void run(String... args) throws Exception {
        cn.com.git.udmp.showcase.common.ILog.logger.info("Springboot ShowcaseApplication Server 启动...........");
    }
}
