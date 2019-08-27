import com.allen.netty.dubbo.api.IService;
import com.allen.netty.dubbo.proxy.RpcClientProxy;
import com.allen.netty.dubbo.registry.IServiceDiscover;
import com.allen.netty.dubbo.registry.ServiceDiscoverImpl;

/**
 * @author : allengent@163.com
 * @date : 2019/8/25 18:12
 * description :
 */
public class ClientTest {
    public static void main(String[] args) {
        IServiceDiscover serviceDiscover = new ServiceDiscoverImpl();
        RpcClientProxy rpcClientProxy = new RpcClientProxy(serviceDiscover);
        IService iService = rpcClientProxy.create(IService.class);
        System.out.println(iService.sayHello("netty-to-dubbo"));
        System.out.println(iService.sayHello("你好"));
        System.out.println(iService.sayHello("成功咯，很高兴"));
        System.out.println(iService.add(10, 4));
    }
}