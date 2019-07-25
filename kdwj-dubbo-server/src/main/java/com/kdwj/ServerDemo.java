package com.kdwj;

import java.io.IOException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ServerDemo {
    public static void main(String[] arg) throws IOException {
ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                new String[] { "classpath*:config/applicationContext.xml" });
        while (true) ;
      /*  ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"classpath*:config/applicationContext.xml" });
        context.start();
        System.in.read(); // 按任意键退出
*/    }
}
