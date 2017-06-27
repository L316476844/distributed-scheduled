package org.jon.lv;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @Package org.jon.lv.scheduled.LanuchMain
 * @Description: 启动类
 * @Copyright: Copyright (c) 2016
 * Author lv bin
 * @date 2017/6/27 14:26
 * version V1.0.0
 */
public class LaunchMain {

    public static void main(String[] args) throws IOException {

        String[] configs = new String[]{"classpath:config/application-common.xml",
                                        "classpath:config/application-schedule.xml"};

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(configs);
        context.start();
        System.out.println("服务启动成功!");
        System.in.read(); // 为保证服务一直开着，利用输入流的阻塞来模拟
    }
}
