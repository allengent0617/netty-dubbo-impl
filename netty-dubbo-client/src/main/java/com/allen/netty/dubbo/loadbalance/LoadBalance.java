package com.allen.netty.dubbo.loadbalance;

import java.util.List;


/**
 * @author : allengent@163.com
 * @date : 2019/8/25 18:12
 * description :
 */

public interface LoadBalance {
    String select(List<String> repos);
}
