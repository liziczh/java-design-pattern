package com.liziczh.designpattern.structural.proxy.jdkproxy;

/**
 * common
 *
 * @author chenzhehao
 * @version 1.0
 * @description
 * @date 2022/7/7 5:14 PM
 */
public class Target implements ITarget {

    @Override
    public void doSomething(String str) {
        System.out.println("Target do something... str=" + str);
    }
}
