package cn.zhutan.dubbo.server;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class XmlServer {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:dubbo-server.xml");
        context.start();

        System.in.read();
    }
}
