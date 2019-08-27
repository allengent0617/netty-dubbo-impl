package com.allen.netty.dubbo.service;

import com.allen.netty.dubbo.annotation.RpcAnnotation;
import com.allen.netty.dubbo.api.IService;

/**
 * @author : allengent@163.com
 * @date : 2019/8/26 10:55
 * description :
 */
@RpcAnnotation(IService.class)
public class ServiceImpl implements IService {
    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public String sayHello(String msg) {
        System.out.println("rpc say :" + msg);
        return "rpc say: " + msg;
    }
}
