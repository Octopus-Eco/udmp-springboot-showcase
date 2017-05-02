package cn.com.git.udmp.showcase.dubbo.service.impl;

import cn.com.git.udmp.showcase.dubbo.service.ComputeService;

public class ComputeServiceImpl implements ComputeService{

    public int add(int a, int b) {
        return a + b;
    }
}
