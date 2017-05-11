package cn.com.git.udmp.showcase.together;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import cn.com.git.udmp.showcase.ShowcaseApplication;
import cn.com.git.udmp.showcase.common.ILog;

/**
 * 模拟客户端
 * @description 
 * @author Spring Cao
 * @date 2017年5月11日 下午10:56:48
 */
@SpringBootApplication
public class ClientRunApplication implements ILog{
    public static void main(String a[]){
        SpringApplication.run(ShowcaseApplication.class, a);
        logger.info("Dubbo With Boot Together Client......start!");
    }
}
