package com.cheng.dubbo.consumer.test;

import com.cheng.dubbo.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Desc: 消费者
 * Author: Cheng
 * Date: 2016/2/19 0019
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:spring-dubbo-consumer.xml",
        "classpath*:applicationContext.xml"})
public class BaseTest {
    @Resource
    private SpeakInterface speakInterface;
    @Resource
    private NameInterface nameInterface;
    @Resource
    private GrowUpInterface growUpInterface;
//    @Resource
//    private SexInterface sexInterface;
//    @Resource
//    private AllInfoInterface allInfoInterface;

    @Test
    public void test01() {
        People people = new People();
        people.setAge(18);
        people.setSex(0);
        System.out.println("====================="+speakInterface.speak(people));
    }

    @Test
    public void test02() {
        People people = new People();
        people.setName("王大");
        people.setAge(18);
        people.setSex(0);
        System.out.println("====================="+nameInterface.getName(people));
    }

    @Test
    public void test03() {
        People people = new People();
        people.setAge(18);
        people.setSex(0);
        System.out.println("====================="+growUpInterface.addAge(people).getAge());
    }

//    @Test
//    public void test04() {
//        People people = new People();
//        people.setName("王大");
//        people.setAge(18);
//        people.setSex(0);
//        System.out.println("====================="+allInfoInterface.getAllInfo(people));
//    }

}
