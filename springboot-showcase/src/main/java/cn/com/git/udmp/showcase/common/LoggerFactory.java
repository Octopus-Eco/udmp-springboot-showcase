package cn.com.git.udmp.showcase.common;
import org.slf4j.Logger;

public class LoggerFactory {
    /**
     * @description slf4j的logger扩展
     * @version
     * @title
     * @return slf4j.Logger
    */
    public static Logger getLogger() {
        String name = new Exception().getStackTrace()[1].getClassName();
        org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(name);
        return logger;
    }

}
