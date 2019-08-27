import com.allen.netty.dubbo.registry.IRegisterCenter;
import com.allen.netty.dubbo.registry.RegisterCenterImpl;

import java.io.IOException;


/**
 * @author : allengent@163.com
 * @date : 2019/8/25 18:12
 * description :
 */

public class RegTest {
    public static void main(String[] args) throws IOException {
        IRegisterCenter registerCenter = new RegisterCenterImpl();
        registerCenter.registry("com.allen.test", "127.0.0.1:9090");
        System.in.read();
    }
}
