package cn.com.git.udmp.showcase.together;

import com.alibaba.dubbo.config.annotation.Service;

import cn.com.git.udmp.showcase.common.ILog;

/**
 * 模拟Dubbox服务端
 * @description 
 * @author Spring Cao
 * @date 2017年5月11日 下午10:58:01
 */
@Service(version="1.0.0")
public class HelloServiceImpl implements HelloService,ILog{

    @Override
    public String sayHi(Hello hello) {
        logger.info("++++++++++++++++++++++++++++++++++++++++");
        // TODO 自动生成的方法存根
        return "I'm Spring, " + hello != null? hello.getSomething() : "no more";
    }

}
