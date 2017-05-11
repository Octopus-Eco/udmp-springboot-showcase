package cn.com.git.udmp.showcase.together;

/**
 * 简单实体
 * @description 
 * @author Spring Cao
 * @date 2017年5月10日 下午11:09:08
 */
public class Hello implements java.io.Serializable{
    /** 
    * @Fields serialVersionUID : TODO(用一句话描述这个变量含义) 
    */ 
    
    private static final long serialVersionUID = 1L;
    
    private String something;

    public String getSomething() {
        return something;
    }

    public void setSomething(String something) {
        this.something = something;
    }
}
