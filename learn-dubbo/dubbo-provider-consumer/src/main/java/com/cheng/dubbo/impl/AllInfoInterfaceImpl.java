package com.cheng.dubbo.impl;

import com.cheng.dubbo.AllInfoInterface;
import com.cheng.dubbo.GrowUpInterface;
import com.cheng.dubbo.People;

import javax.annotation.Resource;

/**
 * Desc:
 * Author: Cheng
 * Date: 2016/2/26 0026
 */
public class AllInfoInterfaceImpl implements AllInfoInterface {
    @Resource
    private GrowUpInterface growUpInterface;

    public People getAllInfo(People people) {
        people = growUpInterface.addAge(people);
        people.setAge(99);
        people.setName(people.getName()+" Dobbo!");
        return people;
    }
}
