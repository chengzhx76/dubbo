package com.cheng.dubbo.impl;

import com.cheng.dubbo.NameInterface;
import com.cheng.dubbo.People;

/**
 * Desc:
 * Author: Cheng
 * Date: 2016/2/26 0026
 */
public class NameInterfaceImpl implements NameInterface {
    @Override
    public String getName(People people) {
        return "dubbo return "+people.getName();
    }
}
