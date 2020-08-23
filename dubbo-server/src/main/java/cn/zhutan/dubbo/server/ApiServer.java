package cn.zhutan.dubbo.server;

import cn.zhutan.dubbo.api.service.IUserService;
import cn.zhutan.dubbo.server.service.impl.UserServiceImpl;
import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ProtocolConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.config.ServiceConfig;

import java.io.IOException;

public class ApiServer {
    public static void main(String[] args) throws IOException {
        // 应用配置
        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName("dubbo-server");
        // 协议和端口配置
        ProtocolConfig protocolConfig = new ProtocolConfig();
        protocolConfig.setName("dubbo");
        protocolConfig.setPort(20880);
        // 注册中心配置
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setAddress("N/A");
        // 配置并暴露服务
        ServiceConfig<IUserService> serviceConfig = new ServiceConfig<>();
        serviceConfig.setInterface(IUserService.class);
        serviceConfig.setRef(new UserServiceImpl());
        serviceConfig.setApplication(applicationConfig);
        serviceConfig.setProtocol(protocolConfig);
        serviceConfig.setRegistry(registryConfig);
        serviceConfig.setVersion("1.0");
        serviceConfig.export();

        System.in.read();
    }
}
