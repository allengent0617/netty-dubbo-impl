package com.allen.netty.dubbo.loadbalance;

import java.util.List;
import java.util.Random;


/**
 * @author : allengent@163.com
 * @date : 2019/8/25 18:12
 * description :
 */

public class RandomLoadBalance implements LoadBalance {
    @Override
    public String select(List<String> repos) {
        int len = repos.size();
        if (len == 0)
            throw new RuntimeException("未发现注册的服务。");
        Random random = new Random();
        return repos.get(random.nextInt(len));
    }
}
