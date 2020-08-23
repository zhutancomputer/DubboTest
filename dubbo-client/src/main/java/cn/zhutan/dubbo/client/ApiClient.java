package cn.zhutan.dubbo.client;

import cn.zhutan.dubbo.api.service.IUserService;
import com.alibaba.dubbo.config.*;

import java.io.IOException;

public class ApiClient {
    public static void main(String[] args) throws IOException {
        // 应用配置
        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName("dubbo-client");
        // 注册中心配置
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setAddress("N/A");
        // 配置并暴露服务
        ReferenceConfig<IUserService> referenceConfig = new ReferenceConfig<>();
        referenceConfig.setInterface(IUserService.class);
        referenceConfig.setApplication(applicationConfig);
        referenceConfig.setRegistry(registryConfig);
        referenceConfig.setUrl("dubbo://192.168.92.1:20880/cn.zhutan.dubbo.api.service.IUserService");
        referenceConfig.setVersion("1.0");
        IUserService userService = referenceConfig.get();
        System.out.println(userService.getUserById(1));
        System.in.read();
    }
}
