import com.allen.netty.dubbo.api.IService;
import com.allen.netty.dubbo.registry.IRegisterCenter;
import com.allen.netty.dubbo.registry.RegisterCenterImpl;
import com.allen.netty.dubbo.rpc.NettyRpcServer;
import com.allen.netty.dubbo.service.ServiceImpl;

/**
 * @author : allengent@163.com
 * @date : 2019/8/25 18:12
 * description :
 */
public class ServerTest {
    public static void main(String[] args) {
        IService service = new ServiceImpl();
        IRegisterCenter registerCenter = new RegisterCenterImpl();
        NettyRpcServer rpcServer = new NettyRpcServer(registerCenter, "127.0.0.1:8090");
        rpcServer.bind(service);
        rpcServer.publisher();
    }
}