package cn.com.git.udmp.showcase.common;

import org.slf4j.Logger;

public interface ILog {
    /** 
     * @Fields logger : 日志logger对象 
     */ 
     public Logger logger = LoggerFactory.getLogger();
}
