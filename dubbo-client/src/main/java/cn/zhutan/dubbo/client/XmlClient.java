package cn.zhutan.dubbo.client;

import cn.zhutan.dubbo.api.service.IUserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class XmlClient {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:dubbo-client.xml");
        IUserService userService = (IUserService) context.getBean("userService");
        System.out.println(userService.getUserById(1));
        // System.in.read();
    }
}
