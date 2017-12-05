package com.cheng.dubbo.impl;

import com.cheng.dubbo.People;
import com.cheng.dubbo.SpeakInterface;

/**
 * Desc: 生产者
 * Author: Cheng
 * Date: 2016/2/19 0019
 */
public class SpeakInterfaceImpl implements SpeakInterface {
    @Override
    public String speak(People people) {
        return "dubbo return " + people.getAge();
    }
}
