package com.kdwj;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kdwj.service.DemoService;

public class ClientDemo {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"classpath*:applicationContext.xml"});
        context.start();
        DemoService demoService = (DemoService)context.getBean("demoService"); // 获取远程服务代理
        String mes = demoService.sayHello("world"); // 执行远程方法
        System.out.println("xxxxx:"+mes);
    }

}
