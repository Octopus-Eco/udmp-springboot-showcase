package cn.com.git.udmp.showcase.dubbo.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.com.git.udmp.showcase.common.ILog;
import cn.com.git.udmp.showcase.dubbo.service.ComputeService;

@RestController
public class ComputeServiceConsumerController implements ILog{
    /**
     * from dubbo client reference
     */
    @Autowired
    ComputeService computeService;
    
    /**
     * from local spring bean
     */
    @Autowired
    ComputeService computeService1;
    
    @RequestMapping("/hello")
    public String echo(){
        logger.info("Result : " + String.valueOf(computeService != null ? computeService.add(1, 1):-1));
        logger.info("hahah : " + String.valueOf(computeService1 != null ? computeService1.add(2, 2):-1));
        return "hello world";
    }
    @RequestMapping("/hello/{id}")
    public String echo(@PathVariable int id){
        return "Hi,This is my ID : " + id;
    }
}
