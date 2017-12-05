package com.cheng.dubbo.impl;

import com.cheng.dubbo.GrowUpInterface;
import com.cheng.dubbo.People;

/**
 * Desc:
 * Author: Cheng
 * Date: 2016/2/26 0026
 */
public class GrowUpInterfaceImpl implements GrowUpInterface {
    @Override
    public People addAge(People people) {
        people.setAge(people.getAge()+1);
        return people;
    }
}
