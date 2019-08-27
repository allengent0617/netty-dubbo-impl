package com.allen.netty.dubbo.registry;


/**
 * @author : allengent@163.com
 * @date : 2019/8/25 18:12
 * description :
 */

public interface IServiceDiscover {
    String discover(String serviceName);
}
