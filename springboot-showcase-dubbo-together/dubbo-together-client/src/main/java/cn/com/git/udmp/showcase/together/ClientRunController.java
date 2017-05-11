package cn.com.git.udmp.showcase.together;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;

import cn.com.git.udmp.showcase.common.ILog;

/**
 * 模拟客户端的调用
 * @description 
 * @author Spring Cao
 * @date 2017年5月11日 下午10:57:10
 */
@RestController
public class ClientRunController implements ILog{
    
    @Reference(version="1.0.0")
    private HelloService helloService;
    
    @RequestMapping("/hello/{say}")
    public String iWouldSaySth(@PathVariable String say){
        Hello hello = new Hello();
        hello.setSomething(say);
        return helloService.sayHi(hello) ;
    }
    
    @RequestMapping("/hello")
    public String iWouldSaySth(){
        logger.info("Controller is OK~~~");
        Hello hello = new Hello();
        hello.setSomething("Hello!");
        return helloService.sayHi(hello);
    }
}
