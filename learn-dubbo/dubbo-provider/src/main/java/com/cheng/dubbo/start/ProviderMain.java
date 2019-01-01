package com.cheng.dubbo.start;

import com.alibaba.dubbo.container.Main;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @desc:
 * @author: hp
 * @date: 2017/12/5
 */
public class ProviderMain {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"spring/spring-dubbo-provider.xml"});
        context.start();
        System.in.read(); // 按任意键退出11

        Main.main(args);
    }
}
