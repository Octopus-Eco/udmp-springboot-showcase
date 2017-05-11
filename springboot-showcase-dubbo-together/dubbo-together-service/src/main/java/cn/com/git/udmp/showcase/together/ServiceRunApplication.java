package cn.com.git.udmp.showcase.together;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import cn.com.git.udmp.showcase.ShowcaseApplication;
import cn.com.git.udmp.showcase.common.ILog;

/**
 * 模拟服务端
 * @description 
 *    打可运行jar包须知：
 *    1、在父级project上执行 maven的install ，并勾选“skip test”
 *    2、在service和client的project上分别执行maven的clean compile package spring-boot:repackage ，并勾选"skip test"
 *    3、针对生成的jar分别执行java -jar xxx.jar来运行
 * @author Spring Cao
 * @date 2017年5月11日 下午10:58:23
 */
@SpringBootApplication
public class ServiceRunApplication implements ILog{
    public static void main(String a[]){
        SpringApplication.run(ShowcaseApplication.class, a);
        logger.info("Dubbo With Boot Together Service......start!");
    }
}
