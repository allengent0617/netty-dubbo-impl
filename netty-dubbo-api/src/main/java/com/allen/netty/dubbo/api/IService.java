package com.allen.netty.dubbo.api;

/**
 * @author : allengent@163.com
 * @date : 2019/8/25 18:12
 * description :
 */
public interface IService {
    /**
     * 计算加法
     */
    int add(int a, int b);

    /**
     * @param msg
     */
    String sayHello(String msg);

}
