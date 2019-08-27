package com.allen.netty.dubbo.registry;

/**
 * @author : allengent@163.com
 * @date : 2019/8/26 10:32
 * description :
 */

public interface IRegisterCenter {
    /**
     * 服务注册
     * @param serverName 服务名称（实现方法路径）
     * @param serviceAddress 服务地址
     */
    void registry(String serverName,String serviceAddress);
}
