package com.allen.netty.dubbo.proxy;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

/**
 * @author : allengent@163.com
 * @date : 2019/8/25 18:12
 * description :
 */
public class RpcProxyHandler extends ChannelInboundHandlerAdapter {
    private Object response;

    public Object getResponse() {
        return response;
    }

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        //将服务端返回的内容返回
        response = msg;
    }
}